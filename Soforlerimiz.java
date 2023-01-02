import java.util.Scanner;

public class Soforlerimiz {
	boolean i = true;
	public void soforGetir() {
		Sofor sinan = new firildakSinan();
		Sofor arif = new arifKeser();
		Sofor osman = new osmanAga();
		while(i){
			System.out.println("\nLütfen bir tane şoför seçiniz.");
			System.out.println("1- Fırıldak Sinan (10TL/1KM)\n2- Arif Keser (12TL/1KM)\n3- Osman Aga (14TL/1KM)");
			Scanner secim=new Scanner(System.in);
            int sec= secim.nextInt();
            switch(sec) {
            	case 1:
            		sinan.soforCagir();
            		i = false;
            		break;
            	case 2:
            		arif.soforCagir();
            		i = false;
            		break;
            	case 3: 
            		osman.soforCagir();
            		i = false;
            		break;
            	default:
            		System.out.println("Hatalı tuşlama yaptınız.");
            		i = true;
            }
			
		}
	}
}
