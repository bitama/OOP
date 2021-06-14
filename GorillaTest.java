public class GorillaTest {
    public static void main(String[] args) {
        Gorilla G = new Gorilla(100);
        G.throwSomething();
        Gorilla G1 = new Gorilla(150);
        G1.throwSomething();
        G1.attack(G);
        G.eatBanana();
        G.climbUp();
        
    }
}
