package PersonalFinance;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class ExpenseController {

    @FXML
    DatePicker datePicker = new DatePicker();
    @FXML
    TextField description = new TextField();
    @FXML
    TextField valuePicker = new TextField();
    @FXML
    TextField categoryPicker = new TextField();
    @FXML
    TextArea taExpenses = new TextArea();
    @FXML
    Label lbExpenses = new Label();

    public void onClickAddExpense(ActionEvent actionEvent) {
        //real values from input
        LocalDate ld = datePicker.getValue();
        String desc = description.getText();
        String cat = categoryPicker.getText();
        double value = Double.parseDouble(valuePicker.getText());

        //new object from ExpenseType
        ExpenseType e1 = new ExpenseType(cat, value, desc, ld);

        //calculate totalExpenses
        e1.getTotalExpenses();

        //show output
        taExpenses.setText(taExpenses.getText() + e1.toString());
        lbExpenses.setText("Total expenses: $" + ExpenseType.getTotalExpenses());
    }
}
