
package aracodevi;


public class Motosiklet extends Arac {
    private String vitesTuru;
    
    public Motosiklet(String marka,String model,String vitesTuru){
        super(marka,model);
        this.vitesTuru = vitesTuru;
    }
    
    public void ozellikleriYazdir(){
        super.ozellikleriYazdir();
        System.out.println("Vites turu: " + this.vitesTuru);
    }
}