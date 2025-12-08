import model.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car A = new Car("A",200);
        Thread carA = new Thread(A);
        Car B = new Car("B",400);
        Thread carB = new Thread(B);
        Car C = new Car("C",300);
        Thread carC = new Thread(C);
        carA.start();
        carB.start();
        carC.start();
    }
}