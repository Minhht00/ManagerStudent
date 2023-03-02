public class Main {
    public static void main(String[] args) {
        Student[] studentList = new Student[100];
        Student student = new Student();

        boolean check = student.checkHeight(3.0);

        if (check == true) {
            System.out.println("Hợp lệ!");
        } else {
            System.out.println("Vui lòng nhập trong khoảng từ 5.0 đến 1000.0!");
        }

    }
}