import java.util.Scanner;

public class GradeCalculator {

    public static void main(String args[]) {

        int mark;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Marks for 5 Subjects: ");
        mark = scanner.nextInt();

        System.out.print("Student's Grade is ");

        int grade = mark / 10; // Get the tens digit of the mark

        switch (grade) {
            case 10:
                System.out.print("A");
                break;
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;
            case 5:
                System.out.print("E");
                break;
            default:
                System.out.print("F");
                break;
        }

        scanner.close();
    }
}

