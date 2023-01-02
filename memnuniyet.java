import java.util.Scanner;

public class memnuniyet
{
	protected boolean i = true;
    public memnuniyet(){
    	while(i) {
            System.out.println("Lütfen Memnuniyetini Yıldızlarla Belirtiniz(en düşük 1 yıldız, en fazla 5 yıldzı veriniz");
            Scanner yildiz=new Scanner(System.in);
            String memnuniyetPuani=yildiz.nextLine();
            System.out.println(memnuniyetPuani);
            if(memnuniyetPuani.equals("*") || memnuniyetPuani.equals("**") ||memnuniyetPuani.equals("***") ||memnuniyetPuani.equals("****") || memnuniyetPuani.equals("*****")) {
            	System.out.println("Bizi puanladığınız için teşekkür ederiz.");
            	i = false;
            }
            else {
            	System.out.println("Hatalı tuşlama yaptınız.");
            	i = true;
            }
    	}
    }
}
