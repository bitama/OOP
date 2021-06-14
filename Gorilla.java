public class Gorilla extends Mammal {
    public Gorilla(int energyLever) {
        super(energyLever);
    }

    public void throwSomething() {
        int E=this.getEnergy();
        this.setEnergyLevel(E -= 5*3);
        System.out.println("The Gorilla threw something " + this.getEnergy());
    }
    public void eatBanana() {
        int E=this.getEnergy();
        this.setEnergyLevel(E +=10*2);
        System.out.println("The Gorilla has been eaten and he  has now " + this.getEnergy());
    }
    
    public void climbUp() {
        int E = this.getEnergy();
        this.setEnergyLevel(E -= 10);
        System.out.println("The Gorilla has been climb up and  he has  now " + this.getEnergy());

    }

    public void attack(Gorilla gorilla) {
        int E=gorilla.getEnergy();
        gorilla.setEnergyLevel(E -= 10);
        System.out.println("the gorilla has been attacked " + gorilla.getEnergy());
    }
    
    
}
