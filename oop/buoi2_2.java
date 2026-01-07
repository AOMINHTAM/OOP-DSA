
import java.util.Arrays;
import java.util.Scanner;
public class buoi2_2{
    public static void NhapMang(int[] a){
        Scanner nhap = new Scanner(System.in);
        
        for(int i = 0 ; i < a.length ; i++){
            int n = nhap.nextInt();
            a[i] = n;
        }
    }
    public static void XuatMang(int[] a){
        for(int i = 0;i < a.length;i++){
            System.out.printf("mang a[%d] = %d ",i,a[i]);
        }
    }
    public static int FindX(int[] a,int x){
        int index = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == x){
                index = i ;
                return index;
            }
        }
        return -1;
    }
    public static int MANG_MAX(int[] a){
        int LonNhat = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > LonNhat){
                LonNhat = a[i];
            }
        }
        return LonNhat;
    }
    public static int Mang_Min(int[] a){
        int NhoNhat = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] <= NhoNhat){
                NhoNhat = a[i];
            }
        }
        return NhoNhat;
    }
    public static int FindMAX(int[] a){
        int Big = a[0];
        int index = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > Big){
                Big = a[i];
                index = i;
            }
        }
        return index;
        
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = nhap.nextInt();
        int[] a = new int[n];
        NhapMang(a);
        XuatMang(a);
        System.out.print("Nhap x = ");
        int x = nhap.nextInt();
        System.out.println("tim vi tri gia tri a[i] = x");
        System.out.println(FindX(a, x));
        System.out.print("So lon nhat trong mang a = ");
        System.out.println(MANG_MAX(a));
        System.out.print("So be nhat trong mang a = ");
        System.out.println(Mang_Min(a));
        System.out.print("vi tri so lon nhat trong mang a = ");
        System.out.println(FindMAX(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}