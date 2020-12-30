package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ListNotesController {
    public void handleBAddNewNoteButtonAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../views/create-note.fxml"));
        stage.setScene(new Scene(root, 500, 450));
        stage.setTitle("Note Taking Application");
        stage.show();
    }
}
