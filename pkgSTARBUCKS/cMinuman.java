package pkgSTARBUCKS;
public class cMinuman {
    private String nama;
    private int harga;
    cMinuman (String n, int h){
        nama=n; harga=h;
        System.out.println("Objek "+nama+" dibuat...");
    }
    public void setNama (String n){
        nama=n;
    }
    public void setHarga(int h){
        harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String ToString(){
        return "Menu: "+nama+ " [" +harga+ "] ";   
    }
}
