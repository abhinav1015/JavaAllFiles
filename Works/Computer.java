public class Computer {
    private int computerId;
    private String brandName;
    private String color;
    private double price;
    Computer(){

    }
    public Computer(computerId, brandName, color, price){
        this.computerId = computerId;
        this.brandName = brandName;
        this.color = color;
        this.price = price;
    }

    public void getComputerId(){
        System.out.println("The computer id is "+this.computerId);
    }
    public void getBrandName(){
        System.out.println("The computer id is "+this.brandName);
    }
    public void getColor(){
        System.out.println("The computer id is "+this.color);
    }
    public void getPrice(){
        System.out.println("The computer id is "+this.price);
    }
    
}
