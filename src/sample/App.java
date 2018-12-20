package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class App {

    @FXML
    private Button StopButton;

    @FXML
    private Label BagLabel;

    @FXML
    private Button ButtonA21;

    @FXML
    private Button ButtonA22;

    @FXML
    private Button ButtonA20;

    @FXML
    private Button ButtonA25;

    @FXML
    private Button ButtonA26;

    @FXML
    private Button ButtonA23;

    @FXML
    private Button ButtonA24;

    @FXML
    private Button ButtonA27;

    @FXML
    private Button ButtonA9;

    @FXML
    private Button ButtonA8;

    @FXML
    private Button ButtonA7;

    @FXML
    private Button ButtonA6;

    @FXML
    private Button ButtonA5;

    @FXML
    private Button ButtonA4;

    @FXML
    private Button ButtonA3;

    @FXML
    private Button GameButton;

    @FXML
    private Button ButtonA10;

    @FXML
    private Button ButtonA2;

    @FXML
    private Button ButtonA1;

    @FXML
    private Button ButtonA11;

    @FXML
    private Button ButtonA14;

    @FXML
    private Button ButtonA15;

    @FXML
    private Button ButtonA12;

    @FXML
    private Button ButtonA13;

    @FXML
    private Button ButtonA18;

    @FXML
    private Button ButtonA19;

    @FXML
    private Button ButtonA16;

    @FXML
    private Button ButtonA17;

    @FXML
    private Button ButtonB9;

    @FXML
    private Button ButtonB8;

    @FXML
    private Button ButtonB7;

    @FXML
    private Button ButtonB6;

    @FXML
    private Button ButtonB5;

    @FXML
    private Button ButtonB4;

    @FXML
    private Button ButtonB20;

    @FXML
    private Button ButtonB3;

    @FXML
    private Button ButtonB21;

    @FXML
    private Button ButtonB2;

    @FXML
    private Button ButtonB1;

    @FXML
    private Button ButtonB24;

    @FXML
    private Button ButtonB25;

    @FXML
    private Button ButtonB22;

    @FXML
    private Button ButtonB23;

    @FXML
    private Button ButtonB26;

    @FXML
    private Button ButtonB27;

    @FXML
    private Button ButtonB10;

    @FXML
    private Button ButtonB13;

    @FXML
    private Button ButtonB14;

    @FXML
    private Button ButtonB11;

    @FXML
    private Button ButtonB12;

    @FXML
    private Button ButtonB17;

    @FXML
    private Button ButtonB18;

    @FXML
    private Button ButtonB15;

    @FXML
    private Button ButtonB16;

    @FXML
    private Button ButtonB19;

    @FXML
    void initialize(){
        StopButton.setOnAction(event -> {
          StopButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));


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

        GameButton.setOnAction(event -> {
            Card card = new Card();
            int [][] array = card.getArray();


        });

        ButtonA1.setOnAction(event -> {

        });
        ButtonA2.setOnAction(event -> {

        });
        ButtonA3.setOnAction(event -> {

        });
        ButtonA4.setOnAction(event -> {

        });
        ButtonA5.setOnAction(event -> {

        });
        ButtonA6.setOnAction(event -> {

        });
        ButtonA7.setOnAction(event -> {

        });
        ButtonA8.setOnAction(event -> {

        });
        ButtonA9.setOnAction(event -> {

        });
        ButtonA10.setOnAction(event -> {

        });
        ButtonA11.setOnAction(event -> {

        });
        ButtonA12.setOnAction(event -> {

        });
        ButtonA13.setOnAction(event -> {

        });
        ButtonA14.setOnAction(event -> {

        });
        ButtonA15.setOnAction(event -> {

        });
        ButtonA16.setOnAction(event -> {

        });
        ButtonA17.setOnAction(event -> {

        });
        ButtonA18.setOnAction(event -> {

        });
        ButtonA19.setOnAction(event -> {

        });
        ButtonA20.setOnAction(event -> {

        });
        ButtonA21.setOnAction(event -> {

        });
        ButtonA22.setOnAction(event -> {

        });
        ButtonA23.setOnAction(event -> {

        });
        ButtonA24.setOnAction(event -> {

        });
        ButtonA25.setOnAction(event -> {

        });
        ButtonA26.setOnAction(event -> {

        });
        ButtonA27.setOnAction(event -> {

        });






    }

}
