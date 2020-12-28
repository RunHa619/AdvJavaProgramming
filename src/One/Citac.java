package One;

import java.io.Closeable;
import java.io.IOException;

public class Citac implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Zatvaram nesto ");
    }

    public static void main(String[] args) throws IOException{


        try(Citac citac = new Citac()) {

        }catch (Exception ex){
            System.err.println(ex.getMessage());

        }
    }
}
