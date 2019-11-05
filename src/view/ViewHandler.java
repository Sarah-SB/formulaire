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
    private ControllerSignIn csi;
    private ControllerSignUp csu;
    private Group root;
    private Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new Group();
        scene = new Scene(root, 800, 800);

        this.primaryStage = primaryStage;

        primaryStage.setTitle("Login");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Inscription getViewSignUp(){return viewSignUp;}

    public Connexion getViewSignIn(){return viewSignIn;}

    public Stage getPrimaryStage(){
        return primaryStage;
    }
}
