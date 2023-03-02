public class Student extends People{
    private int studentId;
    private String schoolName;
    private String timeStartStudy;
    private double gpa;

    public Student() {
    }

    public Student(String fullName, String birthday, String address, double height, double weight, int studentId, String schoolName, String timeStartStudy, double gpa) {
        super(fullName, birthday, address, height, weight);
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.timeStartStudy = timeStartStudy;
        this.gpa = gpa;
    }

    final boolean checkHeight(double height) {
        if (height < 5.0 || height > 1000.0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", schoolName='" + schoolName + '\'' +
                ", timeStartStudy='" + timeStartStudy + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}