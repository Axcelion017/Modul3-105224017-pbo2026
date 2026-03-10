import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int saldo = 500000;
        int menu;
        do{
            System.out.println("Program Mesin ATM");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.printf("Saldo Anda: Rp%d \n", saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setor tunai: Rp");
                    int setor = input.nextInt();
                    saldo += setor;
                    System.out.printf("Saldo Anda setelah setor tunai: Rp%d \n", saldo);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah tarik tunai: Rp");
                    int tarik = input.nextInt();
                    if(tarik > saldo){
                        System.out.println("Saldo tidak cukup untuk melakukan tarik tunai.");
                    } else {
                        if (tarik < 50000) {
                            System.out.println("Tarik tunai minimal Rp50.000.");
                            break;
                        }
                        saldo -= tarik;
                        System.out.printf("Saldo Anda setelah tarik tunai: Rp%d \n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    input.close();
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
                }
        }while(menu != 4);
    }
}
