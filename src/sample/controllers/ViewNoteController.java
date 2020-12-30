package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class ViewNoteController {
    public void handleEditButtonAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../views/create-note.fxml"));
        stage.setScene(new Scene(root, 500, 450));
        stage.setTitle("Note Taking Application");
        stage.show();
    }

    public void handleDeleteButtonAction(ActionEvent actionEvent) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Confirm Delete?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent()) {
            if (result.get() == ButtonType.OK) {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("../views/ListNote.fxml"));
                stage.setScene(new Scene(root, 500, 450));
                stage.setTitle("Note Taking Application");
                stage.show();
            }
        }
    }

    public void handleBackButtonAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../views/ListNote.fxml"));
        stage.setScene(new Scene(root, 500, 450));
        stage.setTitle("Note Taking Application");
        stage.show();
    }
}
