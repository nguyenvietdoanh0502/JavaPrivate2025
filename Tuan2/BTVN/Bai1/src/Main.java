import java.util.Scanner;

public class Main {

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
                System.out.println("Tổng các phần tử trong mảng là: "+Utils.Sum(array));
                break;
            case 2:
                Utils.MaxMin(array);
                break;
            case 3:
                Utils.Sort(array);
                System.out.print("Mảng sau khi sắp xếp: ");
                for(int i =0;i<n;i++){
                    System.out.print(array[i]+" ");
                }
                break;
            case 4:
                Utils.MaxSNT(array);
                break;
            default:
                System.out.println("Lựa chọn nhập sai");
        }
    }
}