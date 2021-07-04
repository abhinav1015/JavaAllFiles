public class Car{
        private int carId;
        private String name;
        private String brand;
        private Double price;
        
        //getters and setters
        
        //setter for carId
        public void setCarId(int carId){
        this.carId=carId;
        }
        //getters for carId
        public int getCarId(){
        return carId;
        }
        //setter for name
        public void setName(String name){
        this.name=name;
        }
        //getter for name
        public String getName(){
        return name;
        }
        //setter for bramd
        public void setBrand(String brand){
        this.brand=brand;
        }
        //getter for brand
        public String getBrand(){
        return brand;
        }
        //setter for price
        public void setName(Double price){
        this.price=price;
        }
        //getter for price
        public double getPrice(){
        return price;
        }
        
}

