package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class App {

    @FXML
    private Button nextMoveButton;
    Bag bag;
    int value;

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




        bag = new Bag();
        closeButton.setOnAction(event -> {
            System.exit(0);
        });
        stopButton.setOnAction(event -> {
            buttonA1.setText("");
            buttonA2.setText("");
            buttonA3.setText("");
            buttonA4.setText("");
            buttonA5.setText("");
            buttonA6.setText("");
            buttonA7.setText("");
            buttonA8.setText("");
            buttonA9.setText("");
            buttonA10.setText("");
            buttonA11.setText("");
            buttonA12.setText("");
            buttonA13.setText("");
            buttonA14.setText("");
            buttonA15.setText("");
            buttonA16.setText("");
            buttonA17.setText("");
            buttonA18.setText("");
            buttonA19.setText("");
            buttonA20.setText("");
            buttonA21.setText("");
            buttonA22.setText("");
            buttonA23.setText("");
            buttonA24.setText("");
            buttonA25.setText("");
            buttonA26.setText("");
            buttonA27.setText("");
            buttonB1.setText("");
            buttonB2.setText("");
            buttonB3.setText("");
            buttonB4.setText("");
            buttonB5.setText("");
            buttonB6.setText("");
            buttonB7.setText("");
            buttonB8.setText("");
            buttonB9.setText("");
            buttonB10.setText("");
            buttonB11.setText("");
            buttonB12.setText("");
            buttonB13.setText("");
            buttonB14.setText("");
            buttonB15.setText("");
            buttonB16.setText("");
            buttonB17.setText("");
            buttonB18.setText("");
            buttonB19.setText("");
            buttonB20.setText("");
            buttonB21.setText("");
            buttonB22.setText("");
            buttonB23.setText("");
            buttonB24.setText("");
            buttonB25.setText("");
            buttonB26.setText("");
            buttonB27.setText("");
            gameButton.setVisible(true);


        });

        gameButton.setOnAction(event -> {


            Card cardA = new Card();
            arrayA = cardA.getArray();
            Card cardB = new Card();
            arrayB = cardB.getArray();
            if (arrayA[0][0] != 0) {
                buttonA1.setText(arrayA[0][0] + "");
            }
            if (arrayA[0][1] != 0) {
                buttonA2.setText(arrayA[0][1] + "");
            }
            if (arrayA[0][2] != 0) {
                buttonA3.setText(arrayA[0][2] + "");
            }
            if (arrayA[0][3] != 0) {
                buttonA4.setText(arrayA[0][3] + "");
            }
            if (arrayA[0][4] != 0) {
                buttonA5.setText(arrayA[0][4] + "");
            }
            if (arrayA[0][5] != 0) {
                buttonA6.setText(arrayA[0][5] + "");
            }
            if (arrayA[0][6] != 0) {
                buttonA7.setText(arrayA[0][6] + "");
            }
            if (arrayA[0][7] != 0) {
                buttonA8.setText(arrayA[0][7] + "");
            }
            if (arrayA[0][8] != 0) {
                buttonA9.setText(arrayA[0][8] + "");
            }
            if (arrayA[1][0] != 0) {
                buttonA10.setText(arrayA[1][0] + "");
            }
            if (arrayA[1][1] != 0) {
                buttonA11.setText(arrayA[1][1] + "");
            }
            if (arrayA[1][2] != 0) {
                buttonA12.setText(arrayA[1][2] + "");
            }
            if (arrayA[1][3] != 0) {
                buttonA13.setText(arrayA[1][3] + "");
            }
            if (arrayA[1][4] != 0) {
                buttonA14.setText(arrayA[1][4] + "");
            }
            if (arrayA[1][5] != 0) {
                buttonA15.setText(arrayA[1][5] + "");
            }
            if (arrayA[1][6] != 0) {
                buttonA16.setText(arrayA[1][6] + "");
            }
            if (arrayA[1][7] != 0) {
                buttonA17.setText(arrayA[1][7] + "");
            }
            if (arrayA[1][8] != 0) {
                buttonA18.setText(arrayA[1][8] + "");
            }
            if (arrayA[2][0] != 0) {
                buttonA19.setText(arrayA[2][0] + "");
            }
            if (arrayA[2][1] != 0) {
                buttonA20.setText(arrayA[2][1] + "");
            }
            if (arrayA[2][2] != 0) {
                buttonA21.setText(arrayA[2][2] + "");
            }
            if (arrayA[2][3] != 0) {
                buttonA22.setText(arrayA[2][3] + "");
            }
            if (arrayA[2][4] != 0) {
                buttonA23.setText(arrayA[2][4] + "");
            }
            if (arrayA[2][5] != 0) {
                buttonA24.setText(arrayA[2][5] + "");
            }
            if (arrayA[2][6] != 0) {
                buttonA25.setText(arrayA[2][6] + "");
            }
            if (arrayA[2][7] != 0) {
                buttonA26.setText(arrayA[2][7] + "");
            }
            if (arrayA[2][8] != 0) {
                buttonA27.setText(arrayA[2][8] + "");
            }

            if (arrayB[0][0] != 0) {
                buttonB1.setText(arrayB[0][0] + "");
            }
            if (arrayB[0][1] != 0) {
                buttonB2.setText(arrayB[0][1] + "");
            }
            if (arrayB[0][2] != 0) {
                buttonB3.setText(arrayB[0][2] + "");
            }
            if (arrayB[0][3] != 0) {
                buttonB4.setText(arrayB[0][3] + "");
            }
            if (arrayB[0][4] != 0) {
                buttonB5.setText(arrayB[0][4] + "");
            }
            if (arrayB[0][5] != 0) {
                buttonB6.setText(arrayB[0][5] + "");
            }
            if (arrayB[0][6] != 0) {
                buttonB7.setText(arrayB[0][6] + "");
            }
            if (arrayB[0][7] != 0) {
                buttonB8.setText(arrayB[0][7] + "");
            }
            if (arrayB[0][8] != 0) {
                buttonB9.setText(arrayB[0][8] + "");
            }
            if (arrayB[1][0] != 0) {
                buttonB10.setText(arrayB[1][0] + "");
            }
            if (arrayB[1][1] != 0) {
                buttonB11.setText(arrayB[1][1] + "");
            }
            if (arrayB[1][2] != 0) {
                buttonB12.setText(arrayB[1][2] + "");
            }
            if (arrayB[1][3] != 0) {
                buttonB13.setText(arrayB[1][3] + "");
            }
            if (arrayB[1][4] != 0) {
                buttonB14.setText(arrayB[1][4] + "");
            }
            if (arrayB[1][5] != 0) {
                buttonB15.setText(arrayB[1][5] + "");
            }
            if (arrayB[1][6] != 0) {
                buttonB16.setText(arrayB[1][6] + "");
            }
            if (arrayB[1][7] != 0) {
                buttonB17.setText(arrayB[1][7] + "");
            }
            if (arrayB[1][8] != 0) {
                buttonB18.setText(arrayB[1][8] + "");
            }
            if (arrayB[2][0] != 0) {
                buttonB19.setText(arrayB[2][0] + "");
            }
            if (arrayB[2][1] != 0) {
                buttonB20.setText(arrayB[2][1] + "");
            }
            if (arrayB[2][2] != 0) {
                buttonB21.setText(arrayB[2][2] + "");
            }
            if (arrayB[2][3] != 0) {
                buttonB22.setText(arrayB[2][3] + "");
            }
            if (arrayB[2][4] != 0) {
                buttonB23.setText(arrayB[2][4] + "");
            }
            if (arrayB[2][5] != 0) {
                buttonB24.setText(arrayB[2][5] + "");
            }
            if (arrayB[2][6] != 0) {
                buttonB25.setText(arrayB[2][6] + "");
            }
            if (arrayB[2][7] != 0) {
                buttonB26.setText(arrayB[2][7] + "");
            }
            if (arrayB[2][8] != 0) {
                buttonB27.setText(arrayB[2][8] + "");
            }
            try {
                if(!step) {
                    StepThread stepThread = new StepThread("Ход");
                    Thread.sleep(20);
                    value = bag.getNumber();
                    bagLabel.setText(value + "");
                    stepThread.start();
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gameButton.setVisible(false);



        });




        buttonB1.setOnAction(event -> {
            if(step) {
                if (!buttonB2.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB1.getText())) {
                        buttonB1.setText("X");
                    }
                }
            }
        });
        buttonB2.setOnAction(event -> {
            if(step) {
                if (!buttonB2.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB2.getText())) {
                        buttonB2.setText("X");
                    }
                }
            }

        });
        buttonB3.setOnAction(event -> {
            if(step) {
                if (!buttonB3.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB3.getText())) {
                        buttonB3.setText("X");
                    }
                }
            }

        });
        buttonB4.setOnAction(event -> {
            if(step) {
                if (!buttonB4.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB4.getText())) {
                        buttonB4.setText("X");
                    }
                }
            }

        });
        buttonB5.setOnAction(event -> {
            if(step) {
                if (!buttonB5.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB5.getText())) {
                        buttonB5.setText("X");
                    }
                }
            }

        });
        buttonB6.setOnAction(event -> {
            if(step) {
                if (!buttonB6.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB6.getText())) {
                        buttonB6.setText("X");
                    }
                }
            }

        });
        buttonB7.setOnAction(event -> {
            if(step) {
                if (!buttonB7.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB7.getText())) {
                        buttonB7.setText("X");
                    }
                }
            }

        });
        buttonB8.setOnAction(event -> {
            if(step) {
                if (!buttonB8.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB8.getText())) {
                        buttonB8.setText("X");
                    }
                }
            }

        });
        buttonB9.setOnAction(event -> {
            if(step) {
                if (!buttonB9.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB9.getText())) {
                        buttonB9.setText("X");
                    }
                }
            }

        });
        buttonB10.setOnAction(event -> {
            if(step) {
                if (!buttonB10.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB10.getText())) {
                        buttonB10.setText("X");
                    }
                }
            }

        });
        buttonB11.setOnAction(event -> {
            if(step) {
                if (!buttonB11.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB11.getText())) {
                        buttonB11.setText("X");
                    }
                }
            }

        });
        buttonB12.setOnAction(event -> {
            if(step) {
                if (!buttonB12.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB12.getText())) {
                        buttonB12.setText("X");
                    }
                }
            }

        });
        buttonB13.setOnAction(event -> {
            if(step) {
                if (!buttonB13.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB13.getText())) {
                        buttonB13.setText("X");
                    }
                }
            }

        });
        buttonB14.setOnAction(event -> {
            if(step) {
                if (!buttonB14.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB14.getText())) {
                        buttonB14.setText("X");
                    }
                }
            }

        });
        buttonB15.setOnAction(event -> {
            if(step) {
                if (!buttonB15.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB15.getText())) {
                        buttonB15.setText("X");
                    }
                }
            }

        });
        buttonB16.setOnAction(event -> {
            if(step) {
                if (!buttonB16.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB16.getText())) {
                        buttonB16.setText("X");
                    }
                }
            }

        });
        buttonB17.setOnAction(event -> {
            if(step) {
                if (!buttonB17.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB17.getText())) {
                        buttonB17.setText("X");
                    }
                }
            }

        });
        buttonB18.setOnAction(event -> {
            if(step) {
                if (!buttonB18.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB18.getText())) {
                        buttonB18.setText("X");
                    }
                }
            }

        });
        buttonB19.setOnAction(event -> {
            if(step) {
                if (!buttonB19.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB19.getText())) {
                        buttonB19.setText("X");
                    }
                }
            }

        });
        buttonB20.setOnAction(event -> {
            if(step) {
                if (!buttonB20.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB20.getText())) {
                        buttonB20.setText("X");
                    }
                }
            }

        });
        buttonB21.setOnAction(event -> {
            if(step) {
                if (!buttonB21.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB21.getText())) {
                        buttonB21.setText("X");
                    }
                }
            }

        });
        buttonB22.setOnAction(event -> {
            if(step) {
                if (!buttonB22.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB22.getText())) {
                        buttonB22.setText("X");
                    }
                }
            }

        });
        buttonB23.setOnAction(event -> {
            if(step) {
                if (!buttonB23.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB23.getText())) {
                        buttonB23.setText("X");
                    }
                }
            }

        });
        buttonB24.setOnAction(event -> {
            if(step) {
                if (!buttonB24.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB24.getText())) {
                        buttonB24.setText("X");
                    }
                }
            }

        });
        buttonB25.setOnAction(event -> {
            if(step) {
                if (!buttonB25.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB25.getText())) {
                        buttonB25.setText("X");
                    }
                }
            }

        });
        buttonB26.setOnAction(event -> {
            if(step) {
                if (!buttonB26.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB26.getText())) {
                        buttonB26.setText("X");
                    }
                }
            }

        });
        buttonB27.setOnAction(event -> {
            if(step) {
                if (!buttonB27.getText().equals("")) {
                    if (value == Integer.parseInt(buttonB27.getText())) {
                        buttonB27.setText("X");
                    }
                }
            }

        });



    }


    public void NextMoveButton(ActionEvent actionEvent) {
        try {
            if(!step) {
                StepThread stepThread = new StepThread("Ход");
                Thread.sleep(20);
                value = bag.getNumber();
                bagLabel.setText(value + "");
                stepThread.start();
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    class StepThread extends Thread{
        StepThread(String name){
            super(name);
        }
        public void run(){

            System.out.printf("%s начался... \n", Thread.currentThread().getName());
            try{

                step = true;
                StepThread.sleep(5000);
                step = false;

            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s закончился... \n", Thread.currentThread().getName());

        }



    }

}