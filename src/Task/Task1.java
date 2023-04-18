package Task;

public class Task1 {
    public String brand;
    public String color;
    public Task1(String inputBrand, String inputColor){
        brand = inputBrand;
        color = inputColor;
    }
    public String displayInfo(){
        return String.format("%s - %s",brand,color);}

}

