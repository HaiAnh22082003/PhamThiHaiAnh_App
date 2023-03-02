import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Nhap vao so phan tu cua mang: ");
        n=sc.nextInt();
        }while(n<0);
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhap vao so thu "+(i+1)+" :");
            A[i]=sc.nextInt();
        }
        int Tong=0;
        for(int i=0;i<n;i++){
             Tong+=A[i];
        }
        System.out.println("Trung binh cong "+n+" so la: "+((float)Tong/n));
    }
}
