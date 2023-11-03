import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    //input data penonton
                    while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton [baris-1][baris-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("Data berhasil disimpan");
                        } else{
                            System.out.println("Kursi telah terisi");
                            System.out.println("Pilih kursi lain? (y/n)");
                            next = input.nextLine();

                            if (next.equalsIgnoreCase("y")){
                                continue;
                            }else{
                                break;
                            }
                        }
                       
                    } else{
                        System.out.println("Kursi tidak tersedia.");
                    }
                    System.out.println("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();

                    if(next.equalsIgnoreCase("n")) {
                        break;
                        }
                    }
                    break;
                case 2:
                    //tampilkan daftar penonton
                    System.out.println("Daftar Penonton:");
                for (int i=0; i<penonton.length; i++) {
                    for (int j=0; j<penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else{
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                //exit
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid");

            }
        }
    }
}