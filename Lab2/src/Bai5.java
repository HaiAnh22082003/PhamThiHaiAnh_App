import java.util.Scanner;

public class Bai5{
    public static void main(String[] args) {
        int n,S=0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap vao n so nguyen: ");
        n=sc.nextInt();
        S+=n;
        }while(S<100);
        System.out.println("Tong cac so nguyen vua nhap la: "+S);
    }
}