package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Controller {

    private final long INIT_VALUE = 0;
    private long[] mem = {INIT_VALUE, INIT_VALUE};
    private String operation = "";
    private int index = 0;

    @FXML
    TextField text;
    @FXML
    GridPane pane;
    @FXML
    private void choiceNumber(ActionEvent actionEvent) {
        mem[index] = Long.valueOf(text.getText() + ((Button) actionEvent.getSource()).getText());
        text.setText(String.valueOf(mem[index]));
    }
    @FXML
    private void clearIndicator() {
        text.setText("0");
        mem[0] = INIT_VALUE;
        mem[1] = INIT_VALUE;
        index = 0;
    }
    @FXML
    private void choiceOperation(ActionEvent actionEvent) {
        operation = ((Button) actionEvent.getSource()).getText();
        text.setText("");
        index = 1 - index;
    }
    @FXML
    private void getResult() {
        long result = new Calculator(mem[0], mem[1], operation).getResult();
        clearIndicator();
        text.setText(String.valueOf(result));
        mem[0] = result;
    }

}
