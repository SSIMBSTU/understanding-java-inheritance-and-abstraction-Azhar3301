public class AdministrativeOfficer extends Employee {
    private String officeSection;

    public AdministrativeOfficer(int memberId,
                                 String name,
                                 double salary,
                                 String officeSection) {

        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    public void processDocuments() {
        System.out.println(name +
                " is processing official university documents.");
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Office Section: " + officeSection);
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " manages administrative and office operations.");
    }
}