// bai 1
public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
// bai 2
class Rectangle{
    private int length;
    private int width;
    public Rectangle(){
        
    }
    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public int getArea(){
        return width*length;
    }
    public String toString(){
        return "Retangle [length] = " + length + " [width] = " + width;
    } 

}
// bai 3
class Employee{
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int id , String firstname , String lastname , int salary){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String GetFullName(){
        return firstname + " " + lastname;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int get_luong_nam(){
        return salary*12;
    }
    public void up_to_salary(int phan_tram){
        this.salary = (salary*phan_tram);
    }
    public String toString(){
        return "id = " + id + "\nfirst_name = " + firstname + "\nlast_name = " + lastname + "\nsalary = " + salary;
    }

}
// bai 4
class Account{
    private String id;
    private String name;
    private int balance; // so du
    public Account(String id , String name , int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void credit(int amount) // amount la so tien giao dich tang
    {
        this.balance = balance + amount;
    }
    public void debit(int amount) // giam
    {
        this.balance = balance - amount;
    }
    public void transferTo(Account destination, int amount) {
        this.balance -= amount;            
        destination.balance += amount;
    }
}
class Date{
    private int day;
    private int month;
    private int year;
    public Date(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;

    }
    public void setMonth(int month){
        this.month = month;

    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString(){
        return "Day-Month-Year = " + day + "-" + month + "-" + year;
    }
    public boolean isleapyear(){
        return (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);
    }
}
public class buoi_4{
    public static void main(String[] args) {
        // bai 1
        Circle cc1 = new Circle();
        System.out.println(cc1);
        System.out.println(cc1.getArea());
        System.out.println(cc1.getRadius());
        System.out.println(cc1.getColor());
        cc1.setRadius(2.0);
        cc1.setColor("blue");
        System.out.println(cc1);
        // bai 2
        Rectangle rec1 = new Rectangle(10, 5);
        System.out.println(rec1);
        System.out.println(rec1.getLength());
        System.out.println(rec1.getWidth());
        System.out.println(rec1.getArea());
        rec1.setLength(15);
        rec1.setWidth(15);
        System.out.println(rec1);

        // bai 3
        Employee em1 = new Employee(1, "Ao", "Minh Tam", 100);
        System.out.println(em1.getId());
        System.out.println(em1.getFirstname());
        System.out.println(em1.getLastname());
        System.out.println(em1.GetFullName());
        System.out.println(em1.getSalary());
        System.out.println(em1.get_luong_nam());
        System.out.println(em1);

        em1.setSalary(200);
        em1.up_to_salary(100);
        System.out.println(em1.getSalary());

        //bai 4
        Account acc1 = new Account("A001", "Ao Minh Tam", 19092006);

        System.out.println(acc1.getId());
        System.out.println(acc1.getName());
        System.out.println(acc1.getBalance());
        acc1.credit(100);
        System.out.println(acc1.getBalance());
        acc1.debit(200);
        System.out.println(acc1.getBalance());
        
        Account acc2 = new Account("A002", "Gu Xin", 0);
        acc1.transferTo(acc2, 200);
        System.out.printf("So du cua acc1 = %d\n",acc1.getBalance());
        System.out.printf("So du tai khoan acc2 = %d\n",acc2.getBalance());
        
        // bai 5
        Date dt = new Date(19, 9, 2006);
        System.out.println(dt.getDay());
        System.out.println(dt.getMonth());
        System.out.println(dt.getYear());
        System.out.println(dt);
        System.out.println(dt.isleapyear());
        dt.setDay(25);
        dt.setMonth(12);
        dt.setYear(2006);
        System.out.println(dt);
        System.out.println(dt.isleapyear());


    }
}