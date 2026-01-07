import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        // System.err.printf("Dao tao %d nganh",8); // phai co format: , . . . args:
        Scanner nhap = new Scanner(System.in);
        int a , b;
        System.out.println("Nhap a va b: ");
        a = nhap.nextInt();
        b = nhap.nextInt();
        int Tong = a + b , Hieu = a - b, Nhan = a * b;
        
        int CV = (a+b) * 2;
        int S = Nhan;

        System.out.printf("Tong = %d \n",Tong);
        System.out.printf("Hieu = %d \n",Hieu);
        System.out.printf("Nhan = %d \n",Nhan);
        if (b != 0){
           float Chia =  a / b;
           System.out.printf("Chia = %f \n",Chia); 
        }
        else{
            System.out.println("Khong chia duoc");
        }
        

        System.out.printf("Chu vi = %d \n",CV);
        System.out.printf("Dien tich = %d \n",S);
}
}