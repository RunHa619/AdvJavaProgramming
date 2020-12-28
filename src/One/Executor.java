package One;

public class Executor {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Runha";
        names[1] = "Sedin";
        names[2] = "Elma";
        //names[3] = "Damira";//Array Index Out Of Bounds Exception
        //int number = 23/0;//Arithmetic Exception divided by zero
        double number = divideBy(0);

        for (int i =0;i<names.length;i++){
            System.out.println(names[i]);
        }

    }
    static int divideBy(int number){

        int decimalNumber = 23;
        int result = decimalNumber/number;
        return result;

    }
}
