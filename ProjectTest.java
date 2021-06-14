public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        project1.setName("name");
        project1.setDescription("Description");
        String elevator = project1.getElevatorPitch();
        System.out.println(elevator);
        
    }
}
