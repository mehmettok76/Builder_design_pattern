
package aracodevi;


public class Araba extends Arac {
    private float motorHacmi;
    
    public Araba(String marka,String model,float motorHacmi){
        super(marka,model);
        this.motorHacmi = motorHacmi;
    }
    
    public void ozellikleriYazdir(){
        super.ozellikleriYazdir();
        System.out.println("Motor hacmi: " + motorHacmi +" litre");
    }
    
}
