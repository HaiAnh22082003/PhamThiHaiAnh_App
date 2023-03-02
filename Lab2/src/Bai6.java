import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n,i;
        long giaithua=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            giaithua*=i;
        }
        System.out.println(n+"! co ket qua la: "+giaithua);
    }
}
