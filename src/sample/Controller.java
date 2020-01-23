package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Controller {

    private Parse parse = new Parse();
    @FXML
    TextField text;
    @FXML
    GridPane pane;
    @FXML
    private void choiceNumber(ActionEvent actionEvent) {
        String indicatorText = text.getText();
        String num = ((Button) actionEvent.getSource()).getText();
        indicatorText = indicatorText + num;
        if (indicatorText.length() > 1 && indicatorText.charAt(0) == '0') {
            indicatorText = indicatorText.substring(1);
        }
        text.setText(indicatorText);
    }
    @FXML
    private void clearIndicator() {
        text.setText("0");
    }
    @FXML
    private void choiceOperation(ActionEvent actionEvent) {
        parse.setOperation(((Button) actionEvent.getSource()).getText());
        parse.addNumber(text.getText());
        text.setText("");
    }
    @FXML
    private void getResult() {
        parse.addNumber(text.getText());
        text.setText(String.valueOf(new Calculator(parse.getA(), parse.getB(), parse.getOperation()).getResult()));
    }

}
