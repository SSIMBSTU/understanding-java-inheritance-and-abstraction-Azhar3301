import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UniversityMember> members = new ArrayList<>();

        members.add(
                new Professor(
                        101,
                        "Dr.Ziaur Rahman",
                        120000,
                        "ICT",
                        "java",
                        35,
                        "java 2026"
                )
        );

        members.add(
                new Professor(
                        102,
                        "Dr. Ahmed",
                        115000,
                        "ICT",
                        "Renewable Energy",
                        28,
                        "Green Energy Fund"
                )
        );

        members.add(
                new AdministrativeOfficer(
                        201,
                        "Mr. Karim",
                        60000,
                        "Accounts"
                )
        );

        members.add(
                new AdministrativeOfficer(
                        202,
                        "Ms. Jannat",
                        65000,
                        "Admissions"
                )
        );

        System.out.println("========== UNIVERSITY MEMBERS ==========\n");

        for (UniversityMember member : members) {

            member.displayBasicInfo();

            System.out.println("Duty:");
            member.performDuty();

            System.out.println("--------------------------------");
        }

        System.out.println("\n========== PROFESSOR RESEARCH PROFILES ==========\n");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor professor = (Professor) member;

                professor.showResearchProfile();

                System.out.println("--------------------------------");
            }
        }
    }
}