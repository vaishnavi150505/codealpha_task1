import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("Enter student grades (type -1 to finish):");
        while (true) {
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }
        
        // Calculate average, highest, and lowest scores

        double sum = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        
        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = sum / grades.size();
        
        // Output the results
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
