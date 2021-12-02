import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class GUI {

    int count=0;
    @FXML
    private AnchorPane Panel;

    @FXML
    private Label counter;

    @FXML
    void incrementCounter(KeyEvent event) {
        count++;
        counter.setText(Integer.toString(count));
        System.out.println(count);
    }

}
