/* Phương thức trừu tượng abstract
- Phương thức trừu tượng ở class trừu tượng chỉ có phần khai báo , k có phần cài đặt
- Lớp con kế thừa lại lớp cha đồng thời cài đặt cho phương thức trừu tượng đó 
 */
// bai 1
abstract class Xe_may{
    abstract void brake();
}


class Xe_may_the_thao extends Xe_may{
    @Override
    public void brake(){
        System.out.println("Xe may the thao dang phanh");
    }
}
class Xe_may_leo_nui extends Xe_may{
    @Override
    public void brake(){
        System.out.println("Xe may leo nui dang phanh");
    }
}
// bai 2
abstract class HinhHoc{
    public HinhHoc(){

    }
    abstract void draw();
    public String color = "red";
    void Getcolor(){
        System.out.println(this.color);
    }
}
class HCN extends HinhHoc{
    @Override
    public void draw(){
        int chieuRong = 10;
        int chieuCao = 5;

        for (int i = 1; i <= chieuCao; i++) { 
            for (int j = 1; j <= chieuRong; j++) { 
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
class Htron extends HinhHoc{
    @Override
    public void draw(){
        int r = 5;
        for (int i = -r; i <= r; i++) {
            
            for (int j = -r; j <= r; j++) {
                if (i * i + j * j <= r * r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
//bai 3
abstract class Person {
    public String name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public abstract void display();
}

class Employee extends Person {
    public int salary;
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display() {
        System.out.println("--- Employee Info ---");
        System.out.println("Name: " + getName() + " | Address: " + getAddress() + " | Salary: " + salary);
    }
}

class Customer extends Person {
    public int balance;
    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }
    @Override
    public void display() {
        System.out.println("--- Customer Info ---");
        System.out.println("Name: " + getName() + " | Address: " + getAddress() + " | Balance: " + balance);
    }
}
public class Buoi8{

    public static void main(String[] args) {
        // bài 1 
        Xe_may_the_thao x1 = new Xe_may_the_thao();
        Xe_may_leo_nui x2 = new Xe_may_leo_nui();
        x1.brake();
        x2.brake();

        //bai 2
        HinhHoc h1 = new HCN();
        HinhHoc h2 = new Htron();

        h1.draw();
        h1.Getcolor();
        
        System.out.println(); // Cách dòng
        
        h2.draw();
        h2.Getcolor();

        //bai 3
        
        Person e1 = new Employee("Nguyen Van A", "Ha Noi", 15000); // Thêm dòng này
        Person c1 = new Customer("Tran Thi B", "TP.HCM", 500);
        e1.display();
        c1.display();
    }


}
