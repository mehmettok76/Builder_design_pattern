
package aracodevi;


public class AracOdevi {
    public static void main(String[] args){
        Araba araba1 = new Araba("Mercedes-Benz","GLK",1.6f);
        araba1.ozellikleriYazdir();
        Motosiklet motosiklet1 = new Motosiklet("Honda","ADV350","Otomatik");
        motosiklet1.ozellikleriYazdir();
    }
    
}
