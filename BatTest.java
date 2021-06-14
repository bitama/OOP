public class BatTest {
    public static void main(String[] args) {
        Bat bat1 = new Bat(300);
        Bat bat2 = new Bat(300);
        bat1.setFly();
        bat1.getHumans();
        bat2.attack(bat1);
    }
}
