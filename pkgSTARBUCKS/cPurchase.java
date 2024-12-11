package pkgSTARBUCKS;
public class cPurchase {
    private cCustomer customer;
    private cMinuman minuman[];
    private int jmnm, maksmnm, total;
    
    cPurchase (int maks){
        maksmnm=maks;
        minuman = new cMinuman[maksmnm];
        jmnm=0; total=0;
    }
    public void isiCustomer(cCustomer p){
     customer = new cCustomer(p.getNama());
        System.out.println("Isi customer sukses...");
    }
    public void tambahMinuman (cMinuman m){
        if(jmnm>=maksmnm){
            System.out.println("Keranjang penuh!");
        }
        else{
            minuman[jmnm] = new cMinuman(m.getNama(), m.getHarga());
            jmnm++;
            System.out.println("Penambahan sukses...");
        }
    }
    public void lihatMinuman(){
        if (customer!=null)
            System.out.println(customer.ToString());
        else{
            System.out.println("Pembeli belum ada...");
        }
        System.out.println("Daftar Minuman");
        if(jmnm<=0){
            System.out.println("Keranjang kosong!");
        }
        else{
            for (int i = 0; i < jmnm; i++){
                System.out.println((i+1)+"."+minuman[i].ToString());
            }
        }
    }
    public void hapusMinuman(String hapus){
        if(jmnm<=0){
            System.out.println("Keeranjang kosong!");
        }
        else{
            //temukan yg dihapus
            //lakukan penghapusan
            boolean ada=false;
            for (int i = 0; i<10; i++){
                if(hapus.equalsIgnoreCase(minuman[i].getNama())) {
                    ada=true;
                minuman[i]=null;
                //penggeseran elemen array maju
                for (int j = i; j<jmnm; j++){
                    if(j==jmnm-1){
                        minuman[j]=null;
                    }
                    else{
                        minuman[j]=minuman[j+1]; //geser maju
                    }
                }
                jmnm--;
                    System.out.println("Penghapusan sukses...");
                break;
            }
        }
        if (ada==false){
            System.out.println("Minuman tidak ada...");
        }
        }
    }
}

