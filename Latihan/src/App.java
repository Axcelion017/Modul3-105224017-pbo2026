import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan usia anda: ");
        int usia = sc.nextInt();
        if (usia > 17){
            if (usia < 60){
                System.out.print("Masukan berat badan anda: ");
                float berat = sc.nextFloat();
                if (berat > 45.0){
                    System.out.print("Masukan kadar hemoglobin anda: ");
                    float hb = sc.nextFloat();
                    sc.close();
                    if (hb > 12.5){
                        if (hb < 17.0){
                            System.out.println("Selamat, anda memenuhi syarat untuk donor darah");
                        }else System.out.println("Maaf, kadar hemoglobin anda belum memenuhi syarat untuk donor darah");
                    } else System.out.println("Maaf, kadar hemoglobin anda belum memenuhi syarat untuk donor darah");
                } else System.out.println("Maaf, berat badan anda belum memenuhi syarat untuk donor darah");
            }else System.out.println("Maaf, umur anda sudah melebihi batas untuk donor darah");
        }else System.out.println("Maaf, umur anda belum cukup untuk donor darah");

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }

        int angka = 10;
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);

        
    }
}