public class Switch {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
            case 'C':
                System.out.println("Fair!");
            default:
                System.out.println("Invalid grade.");
                break;
        }
    }
}
