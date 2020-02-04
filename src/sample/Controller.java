package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

    private ICalculator calc = new Calculator(new Multiplication());
    private String indicatorValue = "";
    private Calculators calcs = new Calculators();
    private final String INIT_VALUE = "1";

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
        calc = new Calculator(new Plus());
        setA(((Button) actionEvent.getSource()).getText());

    }
    @FXML
    private void minus(ActionEvent actionEvent) {
        calc = new Calculator(new Minus());
        setA(((Button) actionEvent.getSource()).getText());
    }
    @FXML
    private void division(ActionEvent actionEvent) {
        calc = new Calculator(new Division());
        setA(((Button) actionEvent.getSource()).getText());
    }
    @FXML
    private void multiplication(ActionEvent actionEvent) {
        calc = new Calculator(new Multiplication());
        setA(((Button) actionEvent.getSource()).getText());
    }
    @FXML
    private void clearIndicator() {
        indicatorValue = "";
        indicator.setText("0");
    }
    @FXML
    private void getResult() {
        calc.setB(indicatorValue);
        clearIndicator();
        indicator.setText(calc.getResult());
    }

    @FXML
    private void inversion() {
        indicator.setText("-" + indicator.getText());
    }

    @FXML
    private void openBracket() {
        calcs.put((Calculator) calc);
        clearIndicator();
    }

    @FXML
    private void closeBracket() {
        getResult();
        calc = calcs.get();
        indicatorValue = indicator.getText();
    }

    private void setA(String value) {
        calc.setA(indicator.getText());
        indicatorValue = "";
        indicator.setText(value);
    }

    @FXML
    private void initialize() {
        calc.setA(INIT_VALUE);
    }

}
