public class PhoneNumber {
    private final int countryCode;
    private String phNumber;

    public PhoneNumber(String phNumber){
        if (phNumber.length()>10){
            this.countryCode=Integer.parseInt(phNumber.substring(0,phNumber.length()-10));
            this.phNumber=phNumber.substring(phNumber.length()-10);
        }
        else{
            this.countryCode=1;
            this.phNumber=phNumber;
        }
    }

    public PhoneNumber(int countryCode,String phNumber){
        this.countryCode=countryCode;
        this.phNumber=phNumber;
    }
}
