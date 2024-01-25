
package aracodevi;


public class Arac {
    private String marka;
    private String model;
    
    public Arac(String marka,String model){
        this.marka = marka;
        this.model = model;
        
    }
    public void ozellikleriYazdir(){
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
    }
}
