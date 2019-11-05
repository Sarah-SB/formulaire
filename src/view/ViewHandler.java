package view;

import controller.ControllerSignIn;
import controller.ControllerSignUp;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler extends Application {

    private Stage primaryStage;
    private Inscription viewSignUp;
    private Connexion viewSignIn;
    private ControllerSignUp csu;
    private ControllerSignIn csi;
    private Group root;
    private Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        Group root = new Group();
        Scene scene = new Scene(root, 800, 800);

        viewSignUp = new Inscription(root);

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Inscription getViewSignUp() {return viewSignUp;}

    public Connexion getViewSignIn() {return viewSignIn;}

    public Stage getPrimaryStage() {return primaryStage;}
}