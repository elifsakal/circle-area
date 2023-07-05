package src.bil201.ders4.sekiller;

public class daire {
	private float yaricap;
    static final float pi=3.14f;
    
    
    public daire (float yaricap) {
    	this.yaricap=yaricap;
  
    }
    
    protected float cevreHesapla() {
    	float cevre = 2*pi*yaricap;
    	  return cevre;
    }
    float alanHesapla() {
    	float alan = pi*yaricap*yaricap;
    	  return alan;
     }
   
}
