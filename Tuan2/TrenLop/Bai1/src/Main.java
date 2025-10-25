import java.util.Scanner;


public class Main {
    public static boolean SNT(int x){
        for(int i =2;i<Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        if(x==1){
            return false;
        }
        return true;
    }
    public static void CheckSNT(int[] array){
        for(int x: array){
            if(SNT(x)){
                System.out.println(x+ " la so nguyen to");
            }
        }
    }
    public static int Sum(int[] array){
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static long Tich(int[] array){
        long tich=1;
        for(int i=0;i<100;i++){
            tich=tich*=array[i];
        }
        return tich;
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i=0;i<100;i++){
            array[i]=i+1;
        }
        System.out.println("Tong bong: "+Sum(array));
        System.out.println("Tich bang: "+Tich(array));
        CheckSNT(array);
        Mang.Print();

    }
}