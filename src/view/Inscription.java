package view;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class Inscription {

    private Text title;
    private Group root;
    //private TextField champTxt;
    //private Label champ;
    private Button btnLogUp, btnValider;
Inscription(Group root){
    this.root = root;

    title = initText(150, "Sign In");
    title.setLayoutY(300);

    root.getChildren().clear();
    root.getChildren().add(title);
}
    public Text initText(int fontSize, String textContent){
        Text text = new Text();
        text.setText(textContent);
        double width = 800;
        text.setWrappingWidth(width);
        double middle = (Screen.getPrimary().getBounds().getWidth()/2) - (width/2);

        return text;
    }

    public Group getRoot(){return root;}
}