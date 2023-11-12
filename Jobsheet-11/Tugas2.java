import java.util.Scanner;  //menerima input dari pengguna
public class Tugas2 {  //mendefinisikan kelas Tugas2
    public static void main(String[] args) {  //fungsi main

        //menerima input dari pengguna, memasukkan nilai dalam variabel n
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        System.out.println();  //mencetak baris baru

        for (int i=1; i<=n; i++) {  //loop luar yang mengiterasi dari 1 hingga n (baris)
            for (int j=i; j<=n; j++) {  //loop dalam yang mengiterasi dari i hingga n (kolom)
                System.out.print("* ");  //mencetak karakter simbol *
            }
            System.out.println();  //mencetak baris baru
        }
    }
    
}
