public class IntroToOopTest {
    public static void main(String[] args){
        IntroToOop hW = new IntroToOop();
            
        IntroToOop bike = new IntroToOop();
        IntroToOop car= new IntroToOop();
        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        car.setNumberOfWheels(4);
        car.setColor("green");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
            
        
        
        // System.out.println(hW.car("V8 juice", 20025));
        // System.out.println(hW.car("V10 Lemonada ", 25 ,"Patrick"));

        // String greeting = hW.greet();
        // String greetingWithName = hW.greet("Eduardo");
        // String greetingWithNameAge = hW.greet("Nick",95);
        // if (greeting.equals("Hello World") || greetingWithName.equals("Hello Eduardo")){
        //     System.out.println("Test successful");
        // } else{
        //     System.out.println("Test Fail");
        // }
        // System.out.println(greetingWithNameAge);
}
}
