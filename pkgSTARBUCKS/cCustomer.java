package pkgSTARBUCKS;
public class cCustomer {
    private String nama;
    cCustomer (String n) {
        nama=n;
        System.out.println("Objek " + nama + " dibuat...");
    }
    public void setNama (String n){
        nama=n;
    } 
    public String getNama(){
        return nama;
    }  
    public String ToString(){
        return "Customer: "+nama;
    }

}
