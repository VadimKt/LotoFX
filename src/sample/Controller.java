package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button CloseBattonAction;

    @FXML
    private Button NewGameBattonAction;

   @FXML
    void initialize(){
       CloseBattonAction.setOnAction(event -> {
           System.exit(0);
       });
       NewGameBattonAction.setOnAction(event -> {
           NewGameBattonAction.getScene().getWindow().hide();
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("/sample/app.fxml"));


            try {
                loader.load();
            } catch (IOException e){
                    e.printStackTrace();
            }
           Parent root = loader.getRoot();
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.showAndWait();


       });

   }


}
