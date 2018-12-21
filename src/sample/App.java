package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class App {


    int value;
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
    private Button CloseButton;

    private int[][] arrayA;

    private int[][] arrayB;

    @FXML
    void initialize() {
        CloseButton.setOnAction(event -> {
            System.exit(0);
        });
        StopButton.setOnAction(event -> {
            ButtonA1.setText("");
            ButtonA2.setText("");
            ButtonA3.setText("");
            ButtonA4.setText("");
            ButtonA5.setText("");
            ButtonA6.setText("");
            ButtonA7.setText("");
            ButtonA8.setText("");
            ButtonA9.setText("");
            ButtonA10.setText("");
            ButtonA11.setText("");
            ButtonA12.setText("");
            ButtonA13.setText("");
            ButtonA14.setText("");
            ButtonA15.setText("");
            ButtonA16.setText("");
            ButtonA17.setText("");
            ButtonA18.setText("");
            ButtonA19.setText("");
            ButtonA20.setText("");
            ButtonA21.setText("");
            ButtonA22.setText("");
            ButtonA23.setText("");
            ButtonA24.setText("");
            ButtonA25.setText("");
            ButtonA26.setText("");
            ButtonA27.setText("");
            ButtonB1.setText("");
            ButtonB2.setText("");
            ButtonB3.setText("");
            ButtonB4.setText("");
            ButtonB5.setText("");
            ButtonB6.setText("");
            ButtonB7.setText("");
            ButtonB8.setText("");
            ButtonB9.setText("");
            ButtonB10.setText("");
            ButtonB11.setText("");
            ButtonB12.setText("");
            ButtonB13.setText("");
            ButtonB14.setText("");
            ButtonB15.setText("");
            ButtonB16.setText("");
            ButtonB17.setText("");
            ButtonB18.setText("");
            ButtonB19.setText("");
            ButtonB20.setText("");
            ButtonB21.setText("");
            ButtonB22.setText("");
            ButtonB23.setText("");
            ButtonB24.setText("");
            ButtonB25.setText("");
            ButtonB26.setText("");
            ButtonB27.setText("");



        });

        GameButton.setOnAction(event -> {


            Card cardA = new Card();
            arrayA = cardA.getArray();
            Card cardB = new Card();
            arrayB = cardB.getArray();
            if (arrayA[0][0] != 0) {
                ButtonA1.setText(arrayA[0][0] + "");
            }
            if (arrayA[0][1] != 0) {
                ButtonA2.setText(arrayA[0][1] + "");
            }
            if (arrayA[0][2] != 0) {
                ButtonA3.setText(arrayA[0][2] + "");
            }
            if (arrayA[0][3] != 0) {
                ButtonA4.setText(arrayA[0][3] + "");
            }
            if (arrayA[0][4] != 0) {
                ButtonA5.setText(arrayA[0][4] + "");
            }
            if (arrayA[0][5] != 0) {
                ButtonA6.setText(arrayA[0][5] + "");
            }
            if (arrayA[0][6] != 0) {
                ButtonA7.setText(arrayA[0][6] + "");
            }
            if (arrayA[0][7] != 0) {
                ButtonA8.setText(arrayA[0][7] + "");
            }
            if (arrayA[0][8] != 0) {
                ButtonA9.setText(arrayA[0][8] + "");
            }
            if (arrayA[1][0] != 0) {
                ButtonA10.setText(arrayA[1][0] + "");
            }
            if (arrayA[1][1] != 0) {
                ButtonA11.setText(arrayA[1][1] + "");
            }
            if (arrayA[1][2] != 0) {
                ButtonA12.setText(arrayA[1][2] + "");
            }
            if (arrayA[1][3] != 0) {
                ButtonA13.setText(arrayA[1][3] + "");
            }
            if (arrayA[1][4] != 0) {
                ButtonA14.setText(arrayA[1][4] + "");
            }
            if (arrayA[1][5] != 0) {
                ButtonA15.setText(arrayA[1][5] + "");
            }
            if (arrayA[1][6] != 0) {
                ButtonA16.setText(arrayA[1][6] + "");
            }
            if (arrayA[1][7] != 0) {
                ButtonA17.setText(arrayA[1][7] + "");
            }
            if (arrayA[1][8] != 0) {
                ButtonA18.setText(arrayA[1][8] + "");
            }
            if (arrayA[2][0] != 0) {
                ButtonA19.setText(arrayA[2][0] + "");
            }
            if (arrayA[2][1] != 0) {
                ButtonA20.setText(arrayA[2][1] + "");
            }
            if (arrayA[2][2] != 0) {
                ButtonA21.setText(arrayA[2][2] + "");
            }
            if (arrayA[2][3] != 0) {
                ButtonA22.setText(arrayA[2][3] + "");
            }
            if (arrayA[2][4] != 0) {
                ButtonA23.setText(arrayA[2][4] + "");
            }
            if (arrayA[2][5] != 0) {
                ButtonA24.setText(arrayA[2][5] + "");
            }
            if (arrayA[2][6] != 0) {
                ButtonA25.setText(arrayA[2][6] + "");
            }
            if (arrayA[2][7] != 0) {
                ButtonA26.setText(arrayA[2][7] + "");
            }
            if (arrayA[2][8] != 0) {
                ButtonA27.setText(arrayA[2][8] + "");
            }

            if (arrayB[0][0] != 0) {
                ButtonB1.setText(arrayB[0][0] + "");
            }
            if (arrayB[0][1] != 0) {
                ButtonB2.setText(arrayB[0][1] + "");
            }
            if (arrayB[0][2] != 0) {
                ButtonB3.setText(arrayB[0][2] + "");
            }
            if (arrayB[0][3] != 0) {
                ButtonB4.setText(arrayB[0][3] + "");
            }
            if (arrayB[0][4] != 0) {
                ButtonB5.setText(arrayB[0][4] + "");
            }
            if (arrayB[0][5] != 0) {
                ButtonB6.setText(arrayB[0][5] + "");
            }
            if (arrayB[0][6] != 0) {
                ButtonB7.setText(arrayB[0][6] + "");
            }
            if (arrayB[0][7] != 0) {
                ButtonB8.setText(arrayB[0][7] + "");
            }
            if (arrayB[0][8] != 0) {
                ButtonB9.setText(arrayB[0][8] + "");
            }
            if (arrayB[1][0] != 0) {
                ButtonB10.setText(arrayB[1][0] + "");
            }
            if (arrayB[1][1] != 0) {
                ButtonB11.setText(arrayB[1][1] + "");
            }
            if (arrayB[1][2] != 0) {
                ButtonB12.setText(arrayB[1][2] + "");
            }
            if (arrayB[1][3] != 0) {
                ButtonB13.setText(arrayB[1][3] + "");
            }
            if (arrayB[1][4] != 0) {
                ButtonB14.setText(arrayB[1][4] + "");
            }
            if (arrayB[1][5] != 0) {
                ButtonB15.setText(arrayB[1][5] + "");
            }
            if (arrayB[1][6] != 0) {
                ButtonB16.setText(arrayB[1][6] + "");
            }
            if (arrayB[1][7] != 0) {
                ButtonB17.setText(arrayB[1][7] + "");
            }
            if (arrayB[1][8] != 0) {
                ButtonB18.setText(arrayB[1][8] + "");
            }
            if (arrayB[2][0] != 0) {
                ButtonB19.setText(arrayB[2][0] + "");
            }
            if (arrayB[2][1] != 0) {
                ButtonB20.setText(arrayB[2][1] + "");
            }
            if (arrayB[2][2] != 0) {
                ButtonB21.setText(arrayB[2][2] + "");
            }
            if (arrayB[2][3] != 0) {
                ButtonB22.setText(arrayB[2][3] + "");
            }
            if (arrayB[2][4] != 0) {
                ButtonB23.setText(arrayB[2][4] + "");
            }
            if (arrayB[2][5] != 0) {
                ButtonB24.setText(arrayB[2][5] + "");
            }
            if (arrayB[2][6] != 0) {
                ButtonB25.setText(arrayB[2][6] + "");
            }
            if (arrayB[2][7] != 0) {
                ButtonB26.setText(arrayB[2][7] + "");
            }
            if (arrayB[2][8] != 0) {
                ButtonB27.setText(arrayB[2][8] + "");
            }



            Bag bag = new Bag();
            try {

                for (int i = 0; i < 90; i++) {
                    int Namber = bag.getNumber();
                    BagLabel.setText(Namber + "");
                    Thread.sleep(4000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


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


    void setVal(Button button, int val) {
        if (val != 0) {

        }
    }

}
