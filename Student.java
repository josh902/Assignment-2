public class Student {
    //Attributes:
    String stdName; //Student's name
    double assignmentOne; // Score for assignment 1
    double assignmentTwo; // Score for assignment 2
    double totalMarks; // Total marks for the student

    public Student(String stdName,double assignmentOne, double assignmentTwo){
        this.stdName = stdName;
        this.assignmentOne = assignmentOne; // Set the score for assignment 1
        this.assignmentTwo = assignmentTwo; // Set the score for assignment 2
        // Calculate the total marks for the student.

        this.totalMarks = this.assignmentOne + this.assignmentTwo;
    }
    public String stdReport(){
        // Format the student's data into a report string.

        String report = String.format("%S:\tAssignment1 – %.2f\tAssignment2 - %.2f\tTotal – %.2f",
                this.stdName,this.assignmentOne,this.assignmentTwo,this.totalMarks);
        return report;
    }
}