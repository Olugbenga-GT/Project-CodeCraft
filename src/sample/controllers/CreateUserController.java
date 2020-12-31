package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class CreateUserController {

    @FXML
    private Text actiontarget;

    public void handleSubmitButtonAction(ActionEvent actionEvent) throws IOException {
        if (checkPasswordMatch("", "")) {
            //display  popup
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Sign-up");
            alert.setContentText("Sign-up Successful");

            //if user presses ok, move to next
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent()) {
                if (result.get() == ButtonType.OK) {
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    Parent root = FXMLLoader.load(getClass().getResource("../views/login.fxml"));
                    stage.setScene(new Scene(root, 500, 450));
                    stage.setTitle("Note Taking Application");
                    stage.show();
                }
            }
        }
        else {
            actiontarget.setText("Password Don't Match");
        }
    }

    private boolean checkPasswordMatch(String firstPassword, String secondPassword){
        return true;
    }
}
