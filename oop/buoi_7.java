/* overiding : xảy ra nếu lớp con có phương thức giống lớp cha 
*/

class Hinhhoc{
    void Tinh_dien_tich(){

    }
}
class Hinh_Tron extends Hinhhoc{
    double r ;

    public Hinh_Tron(double r) {
        this.r = r;
    }
    
    void Tinh_dien_tich(){
        System.out.println("Dien tich hinh tron = " + 3.14 * (r * r));
    }
}
class Hcn extends Hinhhoc{
    float a ; float b ;

    public Hcn(float a, float b) {
        this.a = a; // chieu dai
        this.b = b; // chieu rong
    }
    
    void Tinh_dien_tich(){
        System.out.println("Dien tich HCN = " + a * b);
    }
}
class Animal{
    Float kg;

    void Make_sound(){
        
    }
}
class Pig extends Animal{
    void Make_sound(){
        System.out.println("Un in");
    }
}
class Cat extends Animal{
    void Make_sound(){
        System.out.println("Meo Meo");
    }
}
class Dog extends Animal{
    void Make_sound(){
        System.out.println("Gau Gau");
    }
}
class Bird extends Animal{
    void Make_sound(){
        System.out.println("Bip Bip");
    }
}
// bai 2
class Xedap{
    void Run(){
        System.out.println("Xe dap dang chay");
    }
}
class XeDapDien extends Xedap{
    void Run(){
        System.out.println("Xe Dap Dien Dang chay");
    }
}
// bai 3
class Person {
    String name;
    String date;

    void set_name(String name) {
        this.name = name;
    }

    void set_date(String date) {
        this.date = date;
    }

    String getDetails() {
        return "Ten = " + name + "\nBirthday = " + date;
    }
}

class Employee extends Person {
    double salary;

    void set_salary(double salary) {
        this.salary = salary;
    }

    @Override
    String getDetails() {
        return super.getDetails() + "\nLuong = " + salary;
    }
}

class Manager extends Employee {
    private Employee assistant;

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        if (assistant != null) {
            details += "\nAssistant: " + assistant.getDetails();
        }
        return details;
    }
}
// bai 4 
class Bank {
    public double getInterestRate() {
        return 0.0; 
    }
}

class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 8.0;
    }
}

class ICICI extends Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

class AXIS extends Bank {
    @Override
    public double getInterestRate() {
        return 9.0;
    }
}
// bai 5
class Car{
    void move(){
        System.out.println("Running");
    }
}
class LandRover extends Car{
    void move(){
        System.out.println("LandRover Running");
    }
}
class Ford extends Car{
    void move(){
        System.out.println("Ford Running");
    }
}
class Honda extends Car{
    void move(){
        System.out.println("Honda Running");
    }
}
public class buoi_7 {
    public static void main(String[] args) {
        Hinhhoc h1 = new Hinh_Tron(5.0);
        h1.Tinh_dien_tich();
        Hinhhoc h2 = new Hcn(4.0f, 6.0f);
        h2.Tinh_dien_tich();

        Animal a1 = new Pig(); // heo
        Animal a2 = new Cat(); // meo
        Animal a3 = new Dog(); // Cho
        Animal a4 = new Bird(); // chim
        a1.Make_sound();
        a2.Make_sound();
        a3.Make_sound();
        a4.Make_sound();

        // bai 2
        Xedap x1 = new Xedap();
        x1.Run();
        XeDapDien x2 = new XeDapDien();
        x2.Run();

        // bai 3
        Employee emp = new Employee();
        emp.set_name("Nguyen Van A");
        emp.set_date("01/01/2000");
        emp.set_salary(500);

        Manager mgr = new Manager();
        mgr.set_name("Tran Van B");
        mgr.set_date("02/02/1990");
        mgr.set_salary(15000);
        mgr.setAssistant(emp);

        System.out.println(mgr.getDetails());
        // bai 4 
        Bank b; 

        b = new SBI();
        System.out.println("Lai suat SBI: " + b.getInterestRate() + "%");

        b = new ICICI();
        System.out.println("Lai suat ICICI: " + b.getInterestRate() + "%");

        b = new AXIS();
        System.out.println("Lai suat AXIS: " + b.getInterestRate() + "%");
        // bai 5
        Car myCar;

        myCar = new LandRover();
        myCar.move(); 
        
        myCar = new Ford();
        myCar.move(); 

        myCar = new Honda();
        myCar.move(); 

    }
}
