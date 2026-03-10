import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka desimal pertama: ");
        float angka1 = sc.nextFloat();
        System.out.print("Masukan angka desimal kedua: ");
        float angka2 = sc.nextFloat();
        System.out.print("Masukan operator (+, -, *, /): ");
        String operator = sc.next();
        sc.close();
        float hasil;
        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case "/":
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Pembagi ndak boleh nol.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }
    }
}
