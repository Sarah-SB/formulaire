package view;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class Connexion {

    private Group root;
    private Text title;
    private TextField champTxt;
    private Label champ;
    private Button btnLogUp, btnValider;

    Connexion(Group root){
        this.root = root;

        initTitre();
        initBtn();

        root.getChildren().clear();
        root.getChildren().add(title);
        root.getChildren().add(btnLogUp);
        //root.getChildren().add(btnValider);
    }
    public Text initTitre(){
        title = new Text(10, 100,"Sign In");
        title.setLayoutY(50);
        return title;
    }

    public Button initBtn(){
        btnLogUp = new Button("Sign Up");
        btnLogUp.setLayoutY(80);
        return btnLogUp;
    }

    public Group getRoot(){return root;}
}