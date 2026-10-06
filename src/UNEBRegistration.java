public class UNEBRegistration {
    static {
        System.out.println("1. [STATIC BLOCK - UNEBRegistration] UNEB Registration System is starting...");
    }

    public static void main(String[] args) {
        System.out.println("2. [MAIN METHOD] main() started - beginning candidate registration\n");

        Student s1 = new Student("Nakato Sarah", "Gayaza High School");
        s1.displayDetails();

        Student s2 = new Student("Okello James", "Gulu High School");
        s2.displayDetails();

        Student s3 = new Student("Mukasa Brian", "Ntare School");
        s3.displayDetails();
    }
}

class Student {
    static int examYear;
    static int registrationFee;
    static String gradingPolicy;
    static int totalCandidates;

    String indexNumber;
    String name;
    String school;
    String status;
    String examCentre;

    static {
        System.out.println("3. [STATIC BLOCK - Student] Loading UNEB examination settings (runs ONCE)...");
        examYear = 2026;
        registrationFee = 164000;
        gradingPolicy = "Grades A to E (Competence Based)";
        totalCandidates = 0;
        System.out.println("   Exam Year: " + examYear + " | Fee: UGX " + registrationFee + " | Grading: " + gradingPolicy + "\n");
    }

    {
        totalCandidates++;
        indexNumber = "U" + examYear + "/" + String.format("%03d", totalCandidates);
        status = "PENDING";
        examCentre = "NOT YET ASSIGNED";
        System.out.println("4. [INSTANCE BLOCK] Defaults set for " + indexNumber + " -> Status: " + status + ", Centre: " + examCentre);
    }

    Student(String name, String school) {
        this.name = name;
        this.school = school;
        this.examCentre = school + " Examination Centre";
        this.status = "REGISTERED";
        System.out.println("5. [CONSTRUCTOR] " + name + " registered and assigned to " + examCentre);
    }

    void displayDetails() {
        System.out.println("   ----- Candidate Details -----");
        System.out.println("   Index No : " + indexNumber);
        System.out.println("   Name     : " + name);
        System.out.println("   School   : " + school);
        System.out.println("   Centre   : " + examCentre);
        System.out.println("   Status   : " + status);
        System.out.println("   Fee Paid : UGX " + registrationFee + " for UNEB " + examYear + "\n");
    }
}
