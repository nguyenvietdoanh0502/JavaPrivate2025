public class Utils {
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
}
