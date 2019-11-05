package view;


import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Inscription {

    private Text title;
    private Group root;
    private TextField champTxt;
    //private Label chNom, chPrenom, chAdresse, chCP, chVille, chEmail, chMdp;
    private Button btnLogIn;
    private PasswordField champPssword;

    Inscription(Group root){
    this.root = root;

    initTitre();
    initBtn();/*
    chNom = initChamp("Nom");
    chNom.setLayoutY(200);

    chPrenom = initChamp("Prénom");
    chPrenom.setLayoutY(300);

    chAdresse = initChamp("Adresse");
    chAdresse.setLayoutY(400);

    chCP = initChamp("Code Postal");
    chCP.setLayoutY(500);

    chVille = initChamp("Ville");
    chVille.setLayoutY(600);

    chEmail = initChamp("Adresse Mail");
    chEmail.setLayoutY(700);

    chMdp = initChamp("Mot de passe");
    chMdp.setLayoutY(700);*/

    initTextF();
    initPssword();
    root.getChildren().clear();
    root.getChildren().add(title);/*
    root.getChildren().add(chNom);
    root.getChildren().add(chPrenom);
    root.getChildren().add(chAdresse);
    root.getChildren().add(chCP);
    root.getChildren().add(chVille);
    root.getChildren().add(chEmail);*/

    root.getChildren().add(champPssword);
    root.getChildren().add(btnLogIn);

    }
    public Text initTitre(){
        Text title = new Text(200, 100,"Sign Up");
        title.setLayoutY(50);
        return title;
    }
/*
    public Label initChamp(String text){
        Label champ = new Label();
        champ.setLayoutY(200);
        champ.setLayoutX(100);
        return champ;
    }*/

    public TextField initTextF(){
        TextField champTxt = new TextField();
        champTxt.setLayoutY(250);
        champTxt.setLayoutX(100);
        return champTxt;
    }

    public PasswordField initPssword(){
        champPssword = new PasswordField();
        champPssword.setLayoutY(850);
        champPssword.setLayoutX(100);
        return champPssword;
    }

    public Button initBtn(){
        btnLogIn = new Button("Sign In");
        btnLogIn.setLayoutY(300);
        btnLogIn.setLayoutX(200);
        return btnLogIn;
    }



    public Text getTitle() {
        return title;
    }

    public Group getRoot(){return root;}
}