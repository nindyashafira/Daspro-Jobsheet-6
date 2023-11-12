import java.util.Scanner;  //menerima input dari pengguna
public class Tugas3 {  //mendefinisikan kelas Tugas2
    public static void main(String[] args) {  //fungsi main

        //menerima input dari pengguna, memasukkan nilai dalam variabel n
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        System.out.println();  //membuat baris baru

        for (int i=1; i<=n; i++) {  //loop luar yang mengiterasi dari 1 hingga n (baris) membuat pola persegi
            for (int j=1; j<=n; j++) {   //loop dalam yang mengiterasi kolom dan mengecek posisi apakah berada didalam batas bagian kosong
                if (i>1 && i<n && j>1 && j<n) {  //jika i dan j ada didalam batas maka akan mencetak spasi
                    System.out.print(" ");  //mencetak spasi
                } else {
                    System.out.print(n + " ");  //jika i dan j ada di batas atau luar batas maka akan mencetak nilai n
                }
            }
            System.out.println();  //membuat baris baru
        }
    }
}
