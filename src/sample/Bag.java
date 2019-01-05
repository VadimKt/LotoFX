package sample;

public class Bag {
    int arrayBag[] = new int[90];

    public Bag(){
        for (int i = 0; i < 90; i++) {
            arrayBag[i] = i+1;

        }

    }

    int  getNumber(){
        int result=-1;
        while (result==-1) {
            double t = Math.random() * 90;
            int n = (int) t;
            if (arrayBag[n] != 0) {
                result = arrayBag[n];
                arrayBag[n] = 0;
                return result;
            }

        }
        return 0;
    }

}