class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + this.name + ", address=" + this.address + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program=" + this.program + ", year=" + this.year + ", fee=" + this.fee + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + this.school + ", pay=" + this.pay + "]";
    }
}

public class TestPersonClasses {
    public static void main(String[] args) {
        Person person = new Person("John Wesley", "Rua Rivaldo Alves Feitosa");
        System.out.println(person);

        Student student = new Student("Kayky", "Rua Armênio Moreira", "Marketing", 3 , 10000.0);
        System.out.println(student);

        Staff staff = new Staff("Tuler", "Rua São João", "Federal", 15000.0);
        System.out.println(staff);
    }
}