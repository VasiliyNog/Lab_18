import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button sendButton;

    @FXML
    private TextField messageTextField;

    @FXML
    private TextArea chatTextArea;

    @FXML
    private void sendButtonClick(ActionEvent actionEvent) {
        chatTextArea.setText("Your message: " + messageTextField.getText());
        messageTextField.clear();
    }
}