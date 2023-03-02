public class People {
    public static int id;
    private String fullName;
    private String birthday;
    private String address;
    private double height;
    private double weight;

    // Hàm khởi tạo lớp người

    public People() {
    }

    public People(String fullName, String birthday, String address, double height, double weight) {
        id++;
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "}";
    }
}
