package src.bil201.ders4.sekiller;

public class daireDemo {

	public static void main(String[] args) {
		daire daire1;
		daire1 = new daire(5);
		
		System.out.println("Dairenin �evresi: " + daire1.cevreHesapla());
		System.out.println("Dairenin alan�: " + daire1.alanHesapla());
	}

}
