public class DigitsOnlyFileReader extends  AbstractFileReader{

    public DigitsOnlyFileReader(String filePath){
        super(filePath);
    }

    protected String parseLine(String line){
        return line.replaceAll("[^0-9]","");
    }
}
