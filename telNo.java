import java.util.Scanner;

public class telNo {
	protected boolean i = true;
	
	public void telNoAta() {
		while(i) {
			System.out.println("Telefon numaranızı başında 0 olmadan giriniz: ");
		    Scanner tlf=new Scanner(System.in);
		    String telefonNumarasi = tlf.nextLine();
			if(telefonNumarasi.length() != 10) {
				System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar deneyiniz!");
				i = true;
			}
			else {
				System.out.println("Telefon numaraniz: " + telefonNumarasi+" \nUygulamaya Giriş Yapıldı");
				i = false;
			}
		}
	}
	
}
