import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int faktorial = 1;

        if (angka < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk angka negatif.");
        } else {
            int i = 1;
            while (i <= angka) {
                faktorial *= i;
                i++;
            }
            System.out.println(angka + "! = " + faktorial);
        }

        input.close();
    }
}
