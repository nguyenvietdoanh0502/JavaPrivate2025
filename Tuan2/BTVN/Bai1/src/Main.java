import java.util.Scanner;

public class Main {
    public static int Sum(int[] array){
        int sum = 0;
        for(int i =0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void Sort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void MaxMin(int[] array){
        Sort(array);
        System.out.println("Giá trị lớn nhất của mảng là: "+array[array.length-1]);
        System.out.println("Giá trị nhỏ nhất của mảng là: "+array[0]);
    }
    public static boolean CheckSNT(int x){
        if (x<=1){
            return false;
        }
        for(int i =2;i<Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void MaxSNT(int[] array){
        Sort(array);
        boolean check = true;
        for(int i = array.length-1;i>=0;i--){
            if(CheckSNT(array[i])){
                System.out.println("Số nguyên tố lớn nhất là: "+array[i]);
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Không có số nguyên tố nào");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập mảng: ");
        for (int i =0;i<n;i++){
            int value = sc.nextInt();
            array[i]=value;
        }
        System.out.print("--- Menu ---\n" +
                "1. Tính tổng các phẩn tử trong mảng\n" +
                "2. In ra phần tử lớn nhất, nhỏ nhất trong mảng\n" +
                "3. Sắp xếp lại mảng theo chiều tăng dần\n" +
                "4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra \"Không có\")\n" +
                "Nhập lựa chọn:");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("Tổng các phần tử trong mảng là: "+Sum(array));
                break;
            case 2:
                MaxMin(array);
                break;
            case 3:
                Sort(array);
                System.out.print("Mảng sau khi sắp xếp: ");
                for(int i =0;i<n;i++){
                    System.out.print(array[i]+" ");
                }
                break;
            case 4:
                MaxSNT(array);
                break;
            default:
                System.out.println("Lựa chọn nhập sai");
        }
    }
}