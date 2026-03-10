import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int PIN = 123456, input, i = 0;
        do{
            System.out.print("Masukan PIN: ");
            input = sc.nextInt();
            if (input == PIN && i < 3){
                System.out.println("PIN benar");
                break;
            } else if (i == 2 && input != PIN){
                System.out.println("PIN salah, Akun diblokir");
            }else {
                System.out.println("PIN salah, coba lagi");
            }
            i++;
        }while (input != 123456 && i < 3);
        sc.close();
    }
}
