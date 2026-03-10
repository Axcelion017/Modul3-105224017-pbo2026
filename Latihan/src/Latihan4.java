import java.util.Scanner;
public class Latihan4 {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai akhir dan persentase absensi: ");
        String hasil = (sc.nextFloat() >= 75.0 && sc.nextFloat() > 80.0) ? "Lulus" : "Tidak Lulus";
        sc.close();
        System.out.println(hasil);
    }
}
