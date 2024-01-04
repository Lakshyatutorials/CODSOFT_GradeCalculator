import java.util.Scanner;

public class Grade_calc { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT GRADE CALCULATOR");
        System.out.println("-----------------------------------");

        System.out.println("Enter the number of subjects:");
        int Subjects = sc.nextInt();

        double[] marks = new double[Subjects];

    System.out.println("Enter marks obtained in each subject (Out of 100):");
    for (int i = 0; i < Subjects; i++) {
        double mark;
            do {
                System.out.println("Enter marks for Subject " + (i + 1) + " :");
                //For taking the valid input
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a valid number:");
                    sc.next();  
                }
                mark = sc.nextDouble();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            marks[i] = mark;
        }
    
    

    double TotalMarks = 0;
    for (double mark : marks) {
        TotalMarks += mark;
    }

    double AveragePercentage = (TotalMarks / Subjects) / 100 * 100;

    String grade = "FAIL";
    if (AveragePercentage >= 90) {
        grade = "A";
    } else if (AveragePercentage >= 80) {
        grade = "B";
    } else if (AveragePercentage >= 70) {
        grade = "C";
    } else if (AveragePercentage >= 60) {
        grade = "D";
    }
    else if (AveragePercentage >= 50) {
        grade = "E";
    }
    //remarks for the student based on grades
    String remarks="";
    switch (grade){
        case"A":
        remarks="Excellent! Keep up the good work";
        break;
        case"B":
        remarks="Good Job! Continue to strive for excellence";
        break;
        case"C":
        remarks="Satisfactory,Keep working hard to improve";
        break;
        case"D":
        remarks="Pass, But there's a room for improvement";
        break;
        case"E":
        remarks="Barely passed. Focus on improving your performance.";
        break;
        default:
        remarks = "Sorry, you have failed. Try harder next time.";
    }
    
    System.out.println("Total Marks: " + TotalMarks);
    System.out.println("Average Percentage: " + AveragePercentage + "%");
    System.out.println("Grade: " + grade);
    System.out.println("Remarks: "+remarks);
}
}