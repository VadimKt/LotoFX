package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.ArrayList;


public class App {
    @FXML
    private Button nextMoveButton;
    Bag bag;
    int value;
    ArrayList<Button> arraybuttonA = new ArrayList<>();
    ArrayList<Button> arraybuttonB = new ArrayList<>();
    ArrayList<Integer> arrayAList;
    ArrayList<Integer> arrayBList;
    @FXML
    private Label labelComp;
    @FXML
    private Label labelPlayer;

    @FXML
    private Label labelBag;
    @FXML
    private Label labelWin;
    @FXML
    private Label labelLoser;

    @FXML
    private Button buttonNext;
    @FXML
    private Button buttonExit;

    boolean step = false;
    @FXML
    private Button stopButton;

    @FXML
    private Label bagLabel;

    @FXML
    private Button buttonA21;

    @FXML
    private Button buttonA22;

    @FXML
    private Button buttonA20;

    @FXML
    private Button buttonA25;

    @FXML
    private Button buttonA26;

    @FXML
    private Button buttonA23;

    @FXML
    private Button buttonA24;

    @FXML
    private Button buttonA27;

    @FXML
    private Button buttonA9;

    @FXML
    private Button buttonA8;

    @FXML
    private Button buttonA7;

    @FXML
    private Button buttonA6;

    @FXML
    private Button buttonA5;

    @FXML
    private Button buttonA4;

    @FXML
    private Button buttonA3;

    @FXML
    private Button gameButton;

    @FXML
    private Button buttonA10;

    @FXML
    private Button buttonA2;

    @FXML
    private Button buttonA1;

    @FXML
    private Button buttonA11;

    @FXML
    private Button buttonA14;

    @FXML
    private Button buttonA15;

    @FXML
    private Button buttonA12;

    @FXML
    private Button buttonA13;

    @FXML
    private Button buttonA18;

    @FXML
    private Button buttonA19;

    @FXML
    private Button buttonA16;

    @FXML
    private Button buttonA17;

    @FXML
    private Button buttonB9;

    @FXML
    private Button buttonB8;

    @FXML
    private Button buttonB7;

    @FXML
    private Button buttonB6;

    @FXML
    private Button buttonB5;

    @FXML
    private Button buttonB4;

    @FXML
    private Button buttonB20;

    @FXML
    private Button buttonB3;

    @FXML
    private Button buttonB21;

    @FXML
    private Button buttonB2;

    @FXML
    private Button buttonB1;

    @FXML
    private Button buttonB24;

    @FXML
    private Button buttonB25;

    @FXML
    private Button buttonB22;

    @FXML
    private Button buttonB23;

    @FXML
    private Button buttonB26;

    @FXML
    private Button buttonB27;

    @FXML
    private Button buttonB10;

    @FXML
    private Button buttonB13;

    @FXML
    private Button buttonB14;

    @FXML
    private Button buttonB11;

    @FXML
    private Button buttonB12;

    @FXML
    private Button buttonB17;

    @FXML
    private Button buttonB18;

    @FXML
    private Button buttonB15;

    @FXML
    private Button buttonB16;

    @FXML
    private Button buttonB19;
    @FXML
    private Button closeButton;

    private int[][] arrayA;

    private int[][] arrayB;

    @FXML
    void initialize() {
        stopButton.setVisible(false);
        arraybuttonA.add(0, buttonA1);
        arraybuttonA.add(1, buttonA2);
        arraybuttonA.add(2, buttonA3);
        arraybuttonA.add(3, buttonA4);
        arraybuttonA.add(4, buttonA5);
        arraybuttonA.add(5, buttonA6);
        arraybuttonA.add(6, buttonA7);
        arraybuttonA.add(7, buttonA8);
        arraybuttonA.add(8, buttonA9);
        arraybuttonA.add(9, buttonA10);
        arraybuttonA.add(10, buttonA11);
        arraybuttonA.add(11, buttonA12);
        arraybuttonA.add(12, buttonA13);
        arraybuttonA.add(13, buttonA14);
        arraybuttonA.add(14, buttonA15);
        arraybuttonA.add(15, buttonA16);
        arraybuttonA.add(16, buttonA17);
        arraybuttonA.add(17, buttonA18);
        arraybuttonA.add(18, buttonA19);
        arraybuttonA.add(19, buttonA20);
        arraybuttonA.add(20, buttonA21);
        arraybuttonA.add(21, buttonA22);
        arraybuttonA.add(22, buttonA23);
        arraybuttonA.add(23, buttonA24);
        arraybuttonA.add(24, buttonA25);
        arraybuttonA.add(25, buttonA26);
        arraybuttonA.add(26, buttonA27);

        arraybuttonB.add(0, buttonB1);
        arraybuttonB.add(1, buttonB2);
        arraybuttonB.add(2, buttonB3);
        arraybuttonB.add(3, buttonB4);
        arraybuttonB.add(4, buttonB5);
        arraybuttonB.add(5, buttonB6);
        arraybuttonB.add(6, buttonB7);
        arraybuttonB.add(7, buttonB8);
        arraybuttonB.add(8, buttonB9);
        arraybuttonB.add(9, buttonB10);
        arraybuttonB.add(10, buttonB11);
        arraybuttonB.add(11, buttonB12);
        arraybuttonB.add(12, buttonB13);
        arraybuttonB.add(13, buttonB14);
        arraybuttonB.add(14, buttonB15);
        arraybuttonB.add(15, buttonB16);
        arraybuttonB.add(16, buttonB17);
        arraybuttonB.add(17, buttonB18);
        arraybuttonB.add(18, buttonB19);
        arraybuttonB.add(19, buttonB20);
        arraybuttonB.add(20, buttonB21);
        arraybuttonB.add(21, buttonB22);
        arraybuttonB.add(22, buttonB23);
        arraybuttonB.add(23, buttonB24);
        arraybuttonB.add(24, buttonB25);
        arraybuttonB.add(25, buttonB26);
        arraybuttonB.add(26, buttonB27);
        labelWin.setVisible(false);
        labelLoser.setVisible(false);
        buttonNext.setVisible(false);
        buttonExit.setVisible(false);
        nextMoveButton.setVisible(false);


        closeButton.setOnAction(event -> {
            System.exit(0);
        });
        stopButton.setOnAction(event -> {
            if (!step) {
                for (Button button : arraybuttonA) {
                    button.setText("");
                }
                for (Button button : arraybuttonB) {
                    button.setText("");
                }
                bagLabel.setText("");

                gameButton.setVisible(true);
                stopButton.setVisible(false);
            }

        });

        gameButton.setOnAction(event -> {
            stopButton.setVisible(true);
            bag = new Bag();
            Card cardA = new Card();
            arrayA = cardA.getArray();
            Card cardB = new Card();
            arrayB = cardB.getArray();
            arrayAList = new ArrayList<>();
            arrayBList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    arrayAList.add(arrayA[i][j]);
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    arrayBList.add(arrayB[i][j]);
                }
            }

            int count1 = 0;
            for (Button button : arraybuttonA) {
                if (arrayAList.get(count1) != 0) {
                    button.setText(arrayAList.get(count1) + "");
                }
                count1++;
            }
            int count2 = 0;
            for (Button button : arraybuttonB) {
                if (arrayBList.get(count2) != 0) {
                    button.setText(arrayBList.get(count2) + "");
                }
                count2++;
            }
            if (!step) {
                StepThread stepThread = new StepThread("Ход");
                value = bag.getNumber();
                bagLabel.setText(value + "");
                for (Button button : arraybuttonA) {
                    if (!button.getText().equals("")) {
                        if (value == Integer.parseInt(button.getText())) {
                            button.setText("X");

                        }
                    }

                }
                stepThread.start();
            }
            gameButton.setVisible(false);
        });


        buttonB1.setOnAction(event -> {

            if (step) {
                if (!buttonB1.getText().equals("")&& !buttonB1.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB1.getText())) {
                        buttonB1.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }


        });
        buttonB2.setOnAction(event -> {
            if (step) {
                if (!buttonB2.getText().equals("")&& !buttonB2.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB2.getText())) {
                        buttonB2.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB3.setOnAction(event -> {
            if (step) {
                if (!buttonB3.getText().equals("")&& !buttonB3.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB3.getText())) {
                        buttonB3.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB4.setOnAction(event -> {
            if (step) {
                if (!buttonB4.getText().equals("")&& !buttonB4.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB4.getText())) {
                        buttonB4.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB5.setOnAction(event -> {
            if (step) {
                if (!buttonB5.getText().equals("")&& !buttonB5.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB5.getText())) {
                        buttonB5.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB6.setOnAction(event -> {
            if (step) {
                if (!buttonB6.getText().equals("")&& !buttonB6.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB6.getText())) {
                        buttonB6.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }


        });
        buttonB7.setOnAction(event -> {
            if (step) {
                if (!buttonB7.getText().equals("")&& !buttonB7.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB7.getText())) {
                        buttonB7.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB8.setOnAction(event -> {
            if (step) {
                if (!buttonB8.getText().equals("")&& !buttonB8.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB8.getText())) {
                        buttonB8.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB9.setOnAction(event -> {
            if (step) {
                if (!buttonB9.getText().equals("")&& !buttonB9.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB9.getText())) {
                        buttonB9.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);
                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB10.setOnAction(event -> {
            if (step) {
                if (!buttonB10.getText().equals("")&& !buttonB10.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB10.getText())) {
                        buttonB10.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB11.setOnAction(event -> {
            if (step) {
                if (!buttonB11.getText().equals("")&& !buttonB11.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB11.getText())) {
                        buttonB11.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB12.setOnAction(event -> {
            if (step) {
                if (!buttonB12.getText().equals("")&& !buttonB12.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB12.getText())) {
                        buttonB12.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB13.setOnAction(event -> {
            if (step) {
                if (!buttonB13.getText().equals("")&& !buttonB13.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB13.getText())) {
                        buttonB13.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB14.setOnAction(event -> {
            if (step) {
                if (!buttonB14.getText().equals("")&& !buttonB14.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB14.getText())) {
                        buttonB14.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB15.setOnAction(event -> {
            if (step) {
                if (!buttonB15.getText().equals("")&& !buttonB15.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB15.getText())) {
                        buttonB15.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB16.setOnAction(event -> {
            if (step) {
                if (!buttonB16.getText().equals("")&& !buttonB16.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB16.getText())) {
                        buttonB16.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);


                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB17.setOnAction(event -> {
            if (step) {
                if (!buttonB17.getText().equals("")&& !buttonB17.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB17.getText())) {
                        buttonB17.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB18.setOnAction(event -> {
            if (step) {
                if (!buttonB18.getText().equals("")&& !buttonB18.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB18.getText())) {
                        buttonB18.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB19.setOnAction(event -> {
            if (step) {
                if (!buttonB19.getText().equals("")&& !buttonB19.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB19.getText())) {
                        buttonB19.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB20.setOnAction(event -> {
            if (step) {
                if (!buttonB20.getText().equals("")&& !buttonB20.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB20.getText())) {
                        buttonB20.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB21.setOnAction(event -> {
            if (step) {
                if (!buttonB21.getText().equals("")&& !buttonB21.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB21.getText())) {
                        buttonB21.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB22.setOnAction(event -> {
            if (step) {
                if (!buttonB22.getText().equals("")&& !buttonB22.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB22.getText())) {
                        buttonB22.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB23.setOnAction(event -> {
            if (step) {
                if (!buttonB23.getText().equals("")&& !buttonB23.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB23.getText())) {
                        buttonB23.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }


                    }
                }
            }

        });
        buttonB24.setOnAction(event -> {
            if (step) {
                if (!buttonB24.getText().equals("")&& !buttonB24.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB24.getText())) {
                        buttonB24.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB25.setOnAction(event -> {
            if (step) {
                if (!buttonB25.getText().equals("")&& !buttonB25.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB25.getText())) {
                        buttonB25.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB26.setOnAction(event -> {
            if (step) {
                if (!buttonB26.getText().equals("")&& !buttonB26.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB26.getText())) {
                        buttonB26.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);

                                }

                            }
                        }

                    }
                }
            }

        });
        buttonB27.setOnAction(event -> {
            if (step) {
                if (!buttonB27.getText().equals("")&& !buttonB27.getText().equals("X")) {
                    if (value == Integer.parseInt(buttonB27.getText())) {
                        buttonB27.setText("X");
                        int count =0;
                        for(Button button:arraybuttonB){
                            if (button.getText().equals("") || button.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelWin.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);
                                    step = false;

                                }

                            }
                        }

                    }
                }
            }

        });


    }


    public void NextMoveButton(ActionEvent actionEvent) {
        if (!step) {
            StepThread stepThread = new StepThread("Ход");

            value = bag.getNumber();
            bagLabel.setText(value + "");
            for (Button button : arraybuttonA) {
                if (!button.getText().equals("") && !button.getText().equals("X")) {
                    if (value == Integer.parseInt(button.getText())) {
                        button.setText("X");
                        int count =0;
                        for(Button button3 :arraybuttonA){
                            if (button3.getText().equals("") || button3.getText().equals("X")) {
                                count++;
                                if(count==27){
                                    for(Button button2:arraybuttonB){
                                        button2.setVisible(false);
                                    }
                                    for(Button button1:arraybuttonA){
                                        button1.setVisible(false);
                                    }
                                    gameButton.setVisible(false);
                                    stopButton.setVisible(false);
                                    closeButton.setVisible(false);
                                    nextMoveButton.setVisible(false);
                                    bagLabel.setVisible(false);
                                    labelBag.setVisible(false);
                                    labelComp.setVisible(false);
                                    labelPlayer.setVisible(false);
                                    labelLoser.setVisible(true);
                                    buttonNext.setVisible(true);
                                    buttonExit.setVisible(true);


                                }

                            }
                        }

                    }
                }

            }
            stepThread.start();

        }


    }

    public void buttonNext(ActionEvent actionEvent) {

        for(Button button2:arraybuttonB){
            button2.setVisible(true);
        }
        for(Button button1:arraybuttonA){
            button1.setVisible(true);
        }
        closeButton.setVisible(true);
        bagLabel.setVisible(true);
        labelBag.setVisible(true);
        labelComp.setVisible(true);
        labelPlayer.setVisible(true);
        labelLoser.setVisible(false);
        labelWin.setVisible(false);
        buttonNext.setVisible(false);
        buttonExit.setVisible(false);
        for (Button button : arraybuttonA) {
            button.setText("");
        }
        for (Button button : arraybuttonB) {
            button.setText("");
        }
        bagLabel.setText("");

        gameButton.setVisible(true);
    }


    public void buttonExit(ActionEvent actionEvent) throws IOException {
            System.exit(0);
    }

    class StepThread extends Thread {
        StepThread(String name) {
            super(name);
        }

        public void run() {

            System.out.printf("%s начался... \n", Thread.currentThread().getName());
            try {
                nextMoveButton.setVisible(false);
                step = true;
                StepThread.sleep(4000);
                step = false;
                int count1 =0;
                int count2 =0;
                for(Button button :arraybuttonA){
                    if (button.getText().equals("") || button.getText().equals("X")) {
                        count1++;

                    }
                }
                for(Button button :arraybuttonB){
                    if (button.getText().equals("") || button.getText().equals("X")) {
                        count2++;

                    }
                }
                if(count1==27 || count2==27){
                    nextMoveButton.setVisible(false);
                }
                else {
                    nextMoveButton.setVisible(true);
                }




            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s закончился... \n", Thread.currentThread().getName());

        }


    }


}