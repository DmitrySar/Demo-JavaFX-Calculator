package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    private IAtomicCalc calc;
    private String a;
    private String b;
    private String indicatorValue = "";

    @FXML
    TextField indicator;
    @FXML
    private void choiceNumber(ActionEvent actionEvent) {
        String num = ((Button) actionEvent.getSource()).getText();
        indicatorValue += num;
        indicator.setText(indicatorValue);
    }

    @FXML
    private void plus(ActionEvent actionEvent) {
        calc = new Plus();
        setA(((Button) actionEvent.getSource()).getText());

    }
    @FXML
    private void minus(ActionEvent actionEvent) {
        calc = new Minus();
        setA(((Button) actionEvent.getSource()).getText());
    }
    @FXML
    private void division(ActionEvent actionEvent) {
        calc = new Division();
        setA(((Button) actionEvent.getSource()).getText());
    }
    @FXML
    private void multiplication(ActionEvent actionEvent) {
        calc = new Multiplication();
        setA(((Button) actionEvent.getSource()).getText());
    }
    @FXML
    private void clearIndicator() {
        indicatorValue = "";
        indicator.setText("0");
    }
    @FXML
    private void getResult() {
        b = indicatorValue;
        clearIndicator();
        indicator.setText(calc.getResult(a, b));
    }

    private void setA(String value) {
        a = indicator.getText();
        indicatorValue = "";
        indicator.setText(value);
    }

}
