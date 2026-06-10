public class AcademicStaff extends Employee {
    protected String department;

    public AcademicStaff(int memberId, String name,
                         double salary, String department) {
        super(memberId, name, salary);
        this.department = department;
    }

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture.");
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " teaches university courses.");
    }
}