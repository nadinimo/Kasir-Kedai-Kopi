package pkgSTARBUCKS;



import java.util.Scanner;
public class appStarbuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih2 = 0;
        cPurchase beli = new cPurchase(3);
        cCustomer pbl = new cCustomer("");
        cMinuman menu[] = new cMinuman[5];
        menu[0] = new cMinuman("Red velvet", 70000);
        menu[1] = new cMinuman("Vanilla", 67000);
        menu[2] = new cMinuman("Chocolate", 69000);
        menu[3] = new cMinuman("Matcha", 73000);
        menu[4] = new cMinuman("Cappucino", 68000);
        
        do{
            System.out.println("\nAPP STARBUCK");
            System.out.println("1. Customer");
            System.out.println("2. Minuman");
            System.out.println("3. Transaksi");
            System.out.println("4. Selesai");
            System.out.print(" Pilih = ");
            pilih=sc.nextInt();
            switch (pilih){
                case 1:

                    System.out.println("Nama customer: ");
                    String nm = sc.next();
                    pbl.setNama(nm);
                    break;
                case 2:
                    
                    System.out.println("Daftar Menu Minuman");
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + "." + menu[i].ToString());
                    }
                    break;
                case 3:
                    
                    do{
                        System.out.println(" Pembelian");
                        System.out.println(" 1. Isi pembelian");
                        System.out.println(" 2. Tambah minuman");
                        System.out.println(" 3. Hapus minuman");
                        System.out.println(" 4. Lihat minuman");
                        System.out.println(" 5. Selesai");
                        System.out.println(" PIlih: ");
                        pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                beli.isiCustomer(pbl);
                                break;
                            case 2:
                                System.out.println("  Menu: ");
                                String mn = sc.next();
                                boolean ada = false;
                                for (int i = 0; i < menu.length; i++) {
                                    if (mn.equalsIgnoreCase(menu[i].getNama())) {
                                        ada = true;
                                        beli.tambahMinuman(menu[i]);
                                        break;
                                    }
                                }   
                                if(ada==false){
                                    System.out.println("  Menu tidak ada...");
                                }
                                break;
                            case 3:
                                System.out.println("  Menu dihapus: ");
                                String h = sc.next();
                                beli.hapusMinuman(h);
                                break;
                            case 4:
                                beli.lihatMinuman();
                                break;
                            case 5:
                                System.out.println("  Kembali...");               
                        }
                    }while(pilih!=5);
                    break;
                case 4:
                    System.out.println("Terima kasih...");
                    break;
            }
            while (pilih != 4);
        }      
    }
}
