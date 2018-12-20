package sample;

public class Card {

    int [][] arrayCard =  new int[3][9];

    public Card() {
        int count =15;
        for(int i=0;i<3;i++){
            for(int j=0;j<9;j++){
                arrayCard[i][j]=0;
            }
        }
        while(count>0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                    if (Math.random() < 0.3) {
                        if (checkSize(arrayCard, j, i)) {
                            if(arrayCard[i][j]==0) {
                                int value = rnd(j * 10, (j * 10 + 9));
                                if(checkValue(arrayCard,value)) {
                                    arrayCard[i][j] = value;
                                    count--;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public  boolean checkSize(int[][] array, int x, int y) {
        int countY = 0;
        int countX = 0;

        for (int j=0;j<9;j++) {
            if(array[y][j]>0){
                countY++;
            }
        }
        if(countY>=5){
            return false;
        }else{
            for (int j=0;j<3;j++) {
                if(array[j][x]>0){
                    countX++;
                }
            }
            if(countX>=2){
                return false;
            }
        }


        return true;
    }

    public  boolean checkValue( int[][] array, int number) {

        for(int i=0;i<3;i++){
            for(int j=0;j<9;j++){
                if(array[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }

    public int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public int[][] getArray() {
        return arrayCard;
    }
}
