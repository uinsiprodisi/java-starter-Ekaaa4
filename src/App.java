import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Prodi: ");
        String prodi = input.nextLine();

        System.out.print("Alasan Belajar Java: ");
        String alasan = input.nextLine();
        
        System.out.println("Halo " + nama + ", dengan NIM " + nim + " " + prodi + " alasan saya belajar JAVA adalah" + alasan);
    }
}