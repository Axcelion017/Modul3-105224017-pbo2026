import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int p, vstock = 5, fstock = 15, tstock = 30;
        Scanner sc = new Scanner(System.in);
        do{
            int fcount = 0, tcount = 0, page;
            boolean iscancelled = false; //fcount variabel jumlah tiket yang valid 
            System.out.println("Kiosk (Mesin Tiket Mandiri)");
            System.out.println("1. Tiket VIP (" + vstock + ")" );
            System.out.println("2. Tiket Festival (" + fstock + ")");
            System.out.println("3. Tiket Tribune (" + tstock + ")" );
            System.out.print("Masukan jenis tiket yang ingin dibeli: ");
            p = sc.nextInt();
            switch(p){
                case 1:
                    System.out.print("Masukan jumlah tiket yang ingin dibeli: ");
                    tcount = sc.nextInt();
                    if (tcount > vstock){
                        System.out.println("Jumlah tiket melebihi stok, Transaksi dibatalkan.");
                        break;
                    }
                    for(int i = 0; i < tcount; i++){
                        System.out.print("Masukan umur pelanggan ke-" +(i+1) + ":" );
                        page = sc.nextInt();
                        if(page == -1){
                            iscancelled = true;
                            break;
                        }else if (page < 18 && page > 0){
                            System.out.println("Umur tidak mencukupi.");
                            continue;
                        }else if (page <= 120 && page >= 18){
                            fcount++;
                        }else{
                            System.out.println("Usia tidak valid. Masukan Ulang usianya.");
                            i--;
                        }
                    }
                    if(!iscancelled){
                        vstock -= fcount;
                        System.out.println("Jumlah tiket dengan usia valid adalah : (" + fcount +")");
                        System.out.println("Harga Total: Rp"  + (fcount*1500000));
                    }
                    break;
                case 2:
                    System.out.print("Masukan jumlah tiket yang ingin dibeli: ");
                    tcount = sc.nextInt();
                    if (tcount > fstock){
                        System.out.println("Jumlah tiket melebihi stok, Transaksi dibatalkan.");
                        break;
                    }
                    for(int i = 0; i < tcount; i++){
                        System.out.print("Masukan umur pelanggan ke-" +(i+1) + ":" );
                        page = sc.nextInt();
                        if(page == -1){
                            iscancelled = true;
                            break;
                        }else if (page < 15 && page > 0){
                            System.out.println("Umur tidak mencukupi.");
                            continue;
                        }else if (page <= 120 && page >= 15){
                            fcount++;
                        }else{
                            System.out.println("Usia tidak valid. Masukan Ulang usianya.");
                            i--;
                        }
                    }
                    if(!iscancelled){
                        fstock -= fcount;
                        System.out.println("Jumlah tiket dengan usia valid adalah : (" + fcount +")");
                        System.out.println("Harga Total: Rp"  + (fcount*800000));
                    }
                    break;
                case 3:
                    System.out.print("Masukan jumlah tiket yang ingin dibeli: ");
                    tcount = sc.nextInt();
                    if (tcount > tstock){
                        System.out.println("Jumlah tiket melebihi stok, Transaksi dibatalkan.");
                        break;
                    }
                    for(int i = 0; i < tcount; i++){
                        System.out.print("Masukan umur pelanggan ke-" +(i+1) + ":" );
                        page = sc.nextInt();
                        if(page == -1){
                            iscancelled = true;
                            break;
                        }else if (page > 0 &&  page <= 120){
                            fcount++;
                        }else{
                            System.out.println("Usia tidak valid. Masukan Ulang usianya.");
                            i--;
                        }
                    }
                    if (!iscancelled){
                        tstock -= fcount;
                        System.out.println("Jumlah tiket dengan usia valid adalah : (" + fcount +")");
                        System.out.println("Harga Total: Rp"  + (fcount*500000));
                    }
                    break;
                case 4:
                    System.out.println("Mesin dimatikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukan ulang pilihan");
                    break;
            }
        }while(p != 4);
        sc.close();
    }
}
