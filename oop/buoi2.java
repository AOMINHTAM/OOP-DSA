import java.util.Scanner;
public class buoi2{
    public static boolean SNT(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args){
    // bai 1
    for(int i = 1 ; i <= 5 ; i++){
        System.out.println("Xin chao");
    }
    // bai 2
    Scanner nhap = new Scanner(System.in);
    int n = nhap.nextInt();
    int sum = 0;
    for(int i = 1 ; i <= n ;i++){
        sum += i;
    }
    System.out.println(sum);
    // bai 3
    for(int i = 0 ; i < 11 ; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
    // bai 4
    sum = 0;
    for(int i = 2 ; i <= n ; i+=2){
        sum += i;
    }
    System.out.println(sum);
    int m = nhap.nextInt();
    if(m <= 9){
    for(int i = 1 ; i <= m ; i++){
        System.out.printf("Bang cuu chuong %d\n",i);
        for(int j = 1 ; j <= 10 ; j++){
            System.out.printf("%d * %d = %d\n", i,j,i*j);
        }
    }
    }
    // bai 6 *
    int bai6 = nhap.nextInt();
    for(int i = 1 ; i <= bai6 ; i++){
        System.out.printf("%d ",i);
    }
    // bai 7 
    int bai7 = nhap.nextInt();
    for(int i = 2 ; i <= bai7 ;i++){
        if(SNT(i)){
            System.out.println(i);
        }
    }
}
}
