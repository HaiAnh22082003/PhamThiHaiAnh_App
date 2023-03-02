import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String Ten;
        int Namsinh;
        int Tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban: ");
        Ten=sc.nextLine();
        System.out.println("Nhap vao nam sinh cua ban; ");
        Namsinh=sc.nextInt();
        if(Namsinh<0||Namsinh>2023){
            System.out.println("Ban da nhap sai nam sinh.");
        }else{
               Tuoi=2023-Namsinh;
        if(Tuoi<16){
            System.out.println("Ban "+Ten+" la vi thanh nien.");
        }else if(Tuoi<18){
            System.out.println("Ban "+Ten+" dang tuoi truong thanh.");
        }else {
            System.out.println("Ban "+Ten+" da gia.");
        }
        }
}}
