public class Car extends Vehicle {
    int seats;
    String fuelType;

    public Car(){
        super(); // kế thừa hàm khỏi tạo không tham số của class cha
    }

    public Car(String id, String name,
               String model, String color, int seats, String fuelType){
        super(id, name, model, color); // kế thừa hàm khởi tạo có tham số cua class cha
        this.seats = seats;
        this.fuelType = fuelType;
    }

    public void display(){
        super.display();
        System.out.println("Seats: "+ seats);
        System.out.println("Fuel type: "+ fuelType);
    }
}

