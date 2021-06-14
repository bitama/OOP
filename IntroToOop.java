import java.security.acl.Owner;

public class IntroToOop {
    
    private int numberOfWheels;
    private String color;
    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }
    // getter
    public String getColor() {
        return color;
    }
    // setter
    public void setColor(String color) {
        this.color = color;        // 1
    }
    
    
    
    // public String greet(String name){
    //     return "Hello " + name;
    // }
    // public String greet(String name,int age){
    //     return "Hello" + name + age;
    // }

    // public String greet() {
    //     return "Hello World";
    // }

    // public String car(String engineSize, int topSpeed) {
    //     return "engineSize " + engineSize + "topSpeed: " + topSpeed;
    // }
    // public String car(String engineSize, int topSpeed, String Owner) {
    //     return "engineSize " + engineSize + "topSpeed: " + topSpeed + "owner: " + Owner;
    // }
    
}
