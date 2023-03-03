import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao ma tran co so dong: ");
        m=sc.nextInt();
        System.out.print("Nhap vao ma tran co so cot: ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Phan tu thu "+"["+i+"]"+"["+j+"]"+" cua ma tran la: ");
                a[i][j]=sc.nextInt();
            }
        }
        int max=a[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max<a[i][j]){
                    max=a[i][j];
                }
                
    }
}
        System.out.println("Phan tu lon nhat cua ma tran la: "+max);       
}}
