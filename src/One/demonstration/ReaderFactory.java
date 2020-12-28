package One.demonstration;

public class ReaderFactory {
    public static Reader getReader(String readerType){
        Reader reader = null;
        if (readerType.equals("XML")){
            reader = new XMLreader();
        }else if (readerType.equals("CSV")){
            reader = new CSVReader();
        }else if (readerType.equals("DB")){
            reader = new DBReader();
        }
        return reader;
    }
}
