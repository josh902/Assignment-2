public class Course {
    //Attributes:
    String coursesName; // Name of the course
    double assign1Average; // Average score for assignment 1
    double assign2Average; // Average score for assignment 2
    double coursesAverage; // Average score for the course

    //Constructor(s):
    public Course(String coursesName){
        this.coursesName = coursesName; // Setting the course name
        this.coursesAverage = (assign1Average + assign2Average)/2;
    }

    public String courseRating(){
        String rate;
        if (this.coursesAverage >=90)
            rate = "A";
        else if (this.coursesAverage >=80)
            rate = "B";
        else if (this.coursesAverage >=70)
            rate = "C";
        else if (this.coursesAverage >=60)
            rate = "D";
        else
            rate = "F";
        return rate;

    }
    public String coursesReport(){
        //Java Programming : Assignment1 – 70   Assignment2 – 80      Average - 75   Course Rating: C
        String coursesReport = String.format("%s : Assignment1 – %.2f Assignment2 – %.2f Average - %.2f\n" +
                        "Course Rating: %s.",
                this.coursesName,this.assign1Average,this.assign2Average, this.coursesAverage,courseRating());
        return coursesReport;
    }
}