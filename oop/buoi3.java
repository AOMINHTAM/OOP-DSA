/* overload
    overided
 */
// bai 1
class Car{
    public String So_Xe;
    public String Ten_Chu;
    public String Hieu;
    public int Gia_Xe;
    public float Dung_Tich;

}
// bai 2
class nhanvien{
    public String ten;
    public String ngay_sinh;
    public String gioi_tinh;
    public float luong;

    public void Nhap(String x , String y , String z , float t){
        this.ten = x;
        this.ngay_sinh = y;
        this.gioi_tinh = z;
        this.luong = t;
    }
    public void Hien_Thi(){
        System.out.printf("Ten = %s\nNgay Sinh = %s\nGioi Tinh = %s\nLuong = %f\n",ten,ngay_sinh,gioi_tinh,luong);
    }

}
// bai 3
class sinhvien{
    public String ten;
    public String ngay_sinh;
    public String gioi_tinh;
    public String Lop;

    public void Nhap(String x , String y , String z , String t){
        this.ten = x;
        this.ngay_sinh = y;
        this.gioi_tinh = z;
        this.Lop = t;
    }
    public void Hien_Thi(){
        System.out.printf("Ten = %s\nNgay Sinh = %s\nGioi Tinh = %s\nLop = %s\n",ten,ngay_sinh,gioi_tinh,Lop);
    }
}
public class buoi3{
    public static void main(String[] args){
       
    
        

    }
}