import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String chuoi;
        char kytu='o';
        int Dem=0;
        do{
        System.out.println("Nhap vao chuoi: ");
        chuoi=sc.nextLine();
        }while(chuoi.length()>80);
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i)==kytu){
                Dem++;
            }
        }
        System.out.println("So lan xuat hien ki tu "+kytu+" la: "+Dem);
    }
}
