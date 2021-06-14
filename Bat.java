public class Bat {
    private int energy;

    public Bat(int energy) {
        this.energy = energy;
    }

    public void setFly() {
        this.energy -= 50;
        System.out.println("Bat taking of and decreased by " + this.energy);
        
    }

    public void  getHumans() {
        this.energy += 25;
        System.out.println("Never mind Just increased by " + this.energy);
    }

    public void attack(Bat bat1) {
        bat1.energy -= 100;
        System.out.println("bat2  has attached bat1 and lost " + bat1.energy);
    } 
}
