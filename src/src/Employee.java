public abstract class Employee extends UniversityMember {
    protected double salary;

    public Employee(int memberId, String name, double salary) {
        super(memberId, name);
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Salary: " + salary);
    }
}