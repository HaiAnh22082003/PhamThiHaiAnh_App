import java.util.Scanner;

class Bai1{
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap vao lan lout hai so a,b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Tong hai so a va b la: "+(a+b));
        System.out.println("Hieu hai so a va b la: "+(a-b));
        System.out.println("Tich hai so a va b la: "+(a*b));
        System.out.printf("Thuong hai so a va b la: "+((float)a/b));
        if(a==b){
            System.out.println("\nHai so a va b bang nhau.");
        }else if(a>b){
            System.out.println("\na lon hon b.");
        }else {
            System.out.println("\na nho hon b.");
        }
    }
}