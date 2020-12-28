package One.demonstration.user;

import One.demonstration.Reader;
import One.demonstration.ReaderFactory;

public class ReaderTester {
    public static void main(String[] args) {
        Reader reader = ReaderFactory.getReader("XML");
        String readedValue = reader.read();
        System.out.println(readedValue);
    }
}
