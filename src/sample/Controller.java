package sample;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Text textRegu;
    @FXML
    private Button closeButtonAction;

    @FXML
    private Button newGameButtonAction;
    @FXML
    private Button  regulation;
    @FXML
    private Button  gameButton;

    @FXML
    private Label label1;
    @FXML
    private Label loto;


   @FXML
    void initialize(){
       textRegu.setVisible(false);
       label1.setVisible(false);
       gameButton.setVisible(false);

       closeButtonAction.setOnAction(event -> {
           System.exit(0);
       });
       newGameButtonAction.setOnAction(event -> {
           newGameButtonAction.getScene().getWindow().hide();
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
           stage.setResizable(false);
           stage.showAndWait();

       });
       gameButton.setOnAction(event -> {
           gameButton.getScene().getWindow().hide();
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
           stage.setResizable(false);
           stage.showAndWait();
       });

       regulation.setOnAction(event -> {
           newGameButtonAction.setVisible(false);
           closeButtonAction.setVisible(false);
           regulation.setVisible(false);
           textRegu.setVisible(true);
           label1.setVisible(true);
           gameButton.setVisible(true);
           loto.setVisible(false);

       });

   }


}
