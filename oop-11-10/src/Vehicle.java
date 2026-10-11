public class Vehicle {
    String id;
    String name;
    String model;
    String color;

    public Vehicle(){}

    public  Vehicle(String id, String name, String model, String color){
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public void display(){
        System.out.println("Id: " + id);
        System.out.println("name: " + name);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
    }
}
