package One;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class DynamicalArrayWriter {
    private ArrayList<Integer> lista = new ArrayList<>();

    public DynamicalArrayWriter() {
        for (int i = 0; i <= 10; i++) {
            lista.add(i);
        }

    }


    public void writeListIntoFile() {
        PrintWriter out = null;

        try {
            //FileWriter ->IOException
            FileWriter fileWriter = new FileWriter("output.txt");//IOEXception objekat
            //PrintWriter
             out = new PrintWriter(fileWriter);
            for (int i = 0; i < lista.size(); i++) {
                out.println("Value at : " + i + " is : " + lista.get(i));

            }
        }catch (IOException exception) {
            System.err.println("IO se desio :  "+exception.getMessage());

        } finally {
            if (out != null){
                out.close();
            }

        }


    }
    public ArrayList<Integer> getLista () {
        return lista;
    }
    //Try - catch - finally --> TRY WITH RESOURCE
    public void readFile(){
        try(FileReader fileReader = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(fileReader);){
            String line = null;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }


        }catch(FileNotFoundException e1){
            JOptionPane.showMessageDialog(null,"Nisi unjeo dobro ime fajla");

        }catch(IOException e2){
            System.err.println();

        }
    }
}
