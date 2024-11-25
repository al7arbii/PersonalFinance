package PersonalMeals;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MealController {

    @FXML
    ComboBox mealOfDay = new ComboBox();
    @FXML
    TextField mealComposition = new TextField();
    @FXML
    TextField mealName = new TextField();
    @FXML
    TextField mealCalories = new TextField();
    @FXML
    TextArea taMeals = new TextArea();
    @FXML
    Label lbCalories = new Label();

    public void initialize(){
        mealOfDay.getItems().addAll("Breakfast", "Lunch", "Dinner");
    }
    public void onClickAddMeal (ActionEvent actionEvent){
        //add input
        String category = mealComposition.getText();
        String name = mealName.getText();
        double value = Double.parseDouble(mealCalories.getText());

        //make object from input
        MealType m1 = new MealType(mealOfDay.getValue().toString(), category, name, value);

        //show output
        taMeals.setText(taMeals.getText() + m1.toString());
        lbCalories.setText("Total calories: " + MealType.getAllCalories());
    }
}
