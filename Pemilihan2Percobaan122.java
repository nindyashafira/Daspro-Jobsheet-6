import java.util.Scanner;
public class Pemilihan2Percobaan122 {
public static void main(String[] args) {
    Scanner input22 = new Scanner(System.in);
    System.out.print("Masukkan tahun: ");
    int tahun = input22.nextInt();

    if ((tahun % 4) == 0 && tahun % 100 != 0) {
        System.out.println(tahun + " adalah tahun kabisat");
    }else {
        System.out.println(tahun + " bukan tahun kabisat");
    }
}
}