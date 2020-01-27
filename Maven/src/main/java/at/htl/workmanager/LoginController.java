package at.htl.workmanager;

import java.awt.event.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController extends Application {

    private Parent parent;
    private Scene scene;
    private Stage stage;
    @FXML
    private TextField userName;
    @FXML
    private TextField password;
    private UserWindowController sc;

    @Override
    public void start(Stage stage) throws Exception {

    }

    public LoginController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/at.htl.workmanager/LoginController.fxml"));
        fxmlLoader.setController(this);
        try {
            parent = (Parent) fxmlLoader.load();
            scene = new Scene(parent, 600, 400);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        @FXML
        protected void handleSubmitButtonAction(ActionEvent event) {
            System.out.println(userName.getText());
            if (userName.getText().trim().length() > 0 && password.getText().trim().length() > 0) {
                UserWindowController userWindow = new UserWindowController();
                userWindow.redirectHome(stage, userName.getText().trim());
            }

        }

        public void launchLoginController(Stage stage) {
            this.stage = stage;
            stage.setTitle("User Login");
            stage.setScene(scene);
            stage.setResizable(true);
            stage.hide();
            stage.show();
        }
    }


