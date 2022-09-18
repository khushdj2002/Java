package abhijith;

public interface Sellable {
    public String description();
    public  int listPrice();
    public int lowestPrice();

    int weight();

    boolean isHazardous();
}
