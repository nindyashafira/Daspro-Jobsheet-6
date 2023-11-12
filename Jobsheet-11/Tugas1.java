import java.util.Scanner; //menerima input dari pengguna
public class Tugas1 {  //mendefinisikan kelas Tugas1
    public static void main(String[] args) {   //fungsi main
        
        //menerima input dari pengguna, memasukkan nilai dalam variabel n
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++) {  //loop luar yang mengiterasi sebanyak n kali (baris)
            for (int j=0; j<i; j++) {  //loop dalam yang mengiterasi banyaknya kolom
                System.out.println(j+1);  //mencetak nilai dan menambah 1 setiap iterasi
            }
            System.out.println();  //membuat baris baru
        }
    }
}
