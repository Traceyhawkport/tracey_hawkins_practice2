package StudentRecord;

public class StudentRecord1 {


    private String StudentName;//class feilds-data for class
    private double SciScore;//class feilds
    private double MathScore;//class feilds
    private static int numberOfStudents;

    //CONSTRUCTOR METHOD BELOW
    public StudentRecord1(String StudentName, double SciScore, double MathScore) {
        numberOfStudents++;
        this.StudentName = StudentName;
        this.SciScore = SciScore;
    }//Constructor assigns input values to object

    public String getStudentName() {
        return StudentName;
    }

    public void SetStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    //End of StudentName

    public void setSciScore(double SciScore) {
        this.SciScore = SciScore;
    }

    public double getSciScore() {
        return SciScore;
    }
    //end of SciScore

    public void setMathScore(double MathScore) {
        this.MathScore = MathScore;
    }

    public double getMathScore() {
        return MathScore;

        //public int getnumberOfStudents() {
        //return numberOfStudents;


    }
}


