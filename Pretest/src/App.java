import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan usia anda: ");
        int usia = sc.nextInt();
        System.out.print("Masukan berat badan anda: ");
        double berat = sc.nextDouble();
        System.out.print("Masukan kadar hemoglobin anda: ");
        double hemoglobin = sc.nextDouble();
        sc.close();

        if (usia >17){
            if (usia < 60){
                if (berat > 45){
                    if (hemoglobin > 12.5) 
                        if (hemoglobin < 17.0) System.out.println("Anda memenuhi syarat untuk mendonorkan darah");
                        else System.out.println("Maaf, kadar hemoglobin anda terlalu tinggi untuk mendonorkan darah");
                    else System.out.println("Maaf, kadar hemoglobin anda tidak mencukupi untuk mendonorkan darah");
                }else  System.out.println("Maaf, berat badan anda tidak mencukupi untuk mendonorkan darah");
            }else System.out.println("Maaf, anda sudah terlalu tua untuk mendonorkan darah");
        }else System.out.println("Maaf, anda belum cukup umur untuk mendonorkan darah");

    }
}  
