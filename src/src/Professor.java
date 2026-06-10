public class Professor extends AcademicStaff {
    private String researchArea;
    private int publications;
    private String researchGrant;

    public Professor(int memberId, String name,
                     double salary,
                     String department,
                     String researchArea,
                     int publications,
                     String researchGrant) {

        super(memberId, name, salary, department);

        this.researchArea = researchArea;
        this.publications = publications;
        this.researchGrant = researchGrant;
    }

    public void showResearchProfile() {
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
        System.out.println("Research Grant: " + researchGrant);
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " conducts research, supervises students, and teaches advanced courses.");
    }
}