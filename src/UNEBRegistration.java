public class UNEBRegistration {
    static {
        System.out.println("1. [STATIC BLOCK - UNEBRegistration] UNEB Registration System is starting...");
    }

    public static void main(String[] args) {
        System.out.println("2. [MAIN METHOD] main() started - beginning candidate registration\n");
    }
}

class Student {
    static int examYear;
    static int registrationFee;
    static String gradingPolicy;
    static int totalCandidates;

    static {
        System.out.println("3. [STATIC BLOCK - Student] Loading UNEB examination settings (runs ONCE)...");
        examYear = 2026;
        registrationFee = 164000;
        gradingPolicy = "Grades A to E (Competence Based)";
        totalCandidates = 0;
        System.out.println("   Exam Year: " + examYear + " | Fee: UGX " + registrationFee + " | Grading: " + gradingPolicy + "\n");
    }
}
