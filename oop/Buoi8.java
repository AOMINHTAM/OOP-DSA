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
//bai 4
abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;

    public PhuongTienDiChuyen(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public void batDau() {
        System.out.println(loaiPhuongTien + ": Bat dau khoi hanh.");
    }

    public void tangToc() {
        System.out.println(loaiPhuongTien + ": Dang tang toc nhanh dan.");
    }

    public void dungLai() {
        System.out.println(loaiPhuongTien + ": Da dung han.");
    }

    // Phương thức trừu tượng: Lớp con bắt buộc phải cài đặt chi tiết
    abstract double layVanToc();
}

// 2. Lớp Máy Bay
class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String loaiPhuongTien, String loaiNhienLieu) {
        super(loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println(loaiPhuongTien + " dang cat canh voi nhien lieu " + loaiNhienLieu);
    }

    public void haCanh() {
        System.out.println(loaiPhuongTien + " dang ha canh.");
    }

    @Override
    double layVanToc() {
        return 900.0; // Vận tốc giả định của máy bay
    }
}

// 3. Lớp Xe Ô tô
class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public XeOto(String loaiPhuongTien, String loaiNhienLieu) {
        super(loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    double layVanToc() {
        return 120.0; // Vận tốc giả định của ô tô
    }
}

// 4. Lớp Xe Đạp
class XeDap extends PhuongTienDiChuyen {
    public XeDap(String loaiPhuongTien) {
        super(loaiPhuongTien);
    }

    @Override
    double layVanToc() {
        return 20.0; // Vận tốc giả định của xe đạp
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
        // bai 4
        MayBay mb = new MayBay("May Bay Dan Dung", "Xang Jet A1");
        XeOto oto = new XeOto("Xe O To 4 Cho", "Xang A95");
        XeDap xd = new XeDap("Xe Dap The Thao");

        // Chạy thử Máy Bay
        mb.batDau();
        mb.catCanh();
        System.out.println("Van toc: " + mb.layVanToc() + " km/h");
        mb.haCanh();
        System.out.println("-------------------------");

        // Chạy thử Ô tô
        oto.batDau();
        oto.tangToc();
        System.out.println("Van toc: " + oto.layVanToc() + " km/h");
        oto.dungLai();
        System.out.println("-------------------------");

        // Chạy thử Xe đạp
        xd.batDau();
        System.out.println("Van toc: " + xd.layVanToc() + " km/h");
        xd.dungLai();
    }


}
