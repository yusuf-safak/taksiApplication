import java.awt.*;
import java.util.Scanner;

public class Main {
	public static boolean i = true;
	public static boolean ii = true;
	public static boolean iii = true;
	public static boolean iiii = true;
	public static boolean j = true;
	public static boolean jj = false;
	public static boolean jjj = false;
	public static boolean jjjj = true;
    public static void main(String[] args){
    	
    	while(ii) {
    		
    		
            System.out.println("Akasya Durağı' na hoşgeldiniz."); //Başlangıç
            
            //Müşteriden telefon numarası alma
            telNo tel = new telNo();
            tel.telNoAta();
            // Muşteriler için ekleme  algoritması öğrenicez.
            
            //Taksi türlerine ait classların atanması
            Taksi siyah=new siyahTaksi();
            Taksi servis=new ServisTaksi();
            Taksi sarı=new sariTaksi();
            Taksi turkuvaz=new TurkuvazTaksi();
            
            Kapasite kapasiteler=new Kapasite(); //Kapasite kontrollerinin yapıldığı class

            İndirimKodu i̇ndirimKodu=new İndirimKodu(); //indirim kuponu işlemlerinin yapıldığı class
            
            //TaksimetreAcilis interface i
            TaksimetreAcilis st=new sari_turkuvazAcilis(); // Sarı ve turkuaz taksi için
            TaksimetreAcilis ss= new servis_siyahAcilis(); // Servis ve siyah taksi için

            //Taksi seçeneklerini gösteren class
            Taksilerimiz taksi=new Taksilerimiz();
            kapasiteliTaksiListesi taksiler = new kapasiteliTaksiListesi(); 

            //memnuniyet memnuniyetiniz=new memnuniyet();

            yemek menücagir=new yemek(); // Yemek menülerini gösteren class
            
            //Şoför seçenekleri 
            Soforlerimiz sofor = new Soforlerimiz();
            sofor.soforGetir();

            taksi.Taksilerimiz();
            while(i) {
            	//Taksi seçenekleri ve seçimleri
                System.out.println("Lütfen Taksi Seçiniz");
                Scanner secim=new Scanner(System.in);
                int sec= secim.nextInt();

                //Taksi türüne göre kapasite sorgulama 
                Scanner kapasite=new Scanner(System.in);
                switch(sec){
                    case 1:
                        System.out.println("Kaç kişisiniz");
                        int kisiSari=kapasite.nextInt();
                        kapasiteler.setSariKapasite(kisiSari);
                        if(kapasiteler.getSariKapasite()>4) {
                        	i = true;
                        	taksiler.Taksilerimiz();
                        }else {
                            sarı.taksiCagir();
                            st.acilis();
                            i = false;
                        }
                        break;
                    case 2:System.out.println("Kaç kişisiniz");
                        int kisiSiyah=kapasite.nextInt();
                        kapasiteler.setSiyahKapasite(kisiSiyah);
                        if(kapasiteler.getSiyahKapasite()>8) {
                        	i = true;
                        	taksiler.Taksilerimiz();
                        }else {
                            siyah.taksiCagir();
                            ss.acilis();
                            i = false;
                        }
                        break;
                    case 3:System.out.println("Kaç kişisiniz");
                         int kisiTurkuvaz=kapasite.nextInt();
                         kapasiteler.setTurkuvazKapasite(kisiTurkuvaz);
                         if(kapasiteler.getTurkuvazKapasite()>6) {
                         	i = true;
                         	taksiler.Taksilerimiz();
                         }else {
                             turkuvaz.taksiCagir();
                             st.acilis();
                             i = false;
                         }
                        break;
                    case 4:System.out.println("Kaç kişisiniz");
                        int kisiServis=kapasite.nextInt();
                        kapasiteler.setServisKapasite(kisiServis);
                        if(kapasiteler.getServisKapasite()>20) {
                        	i = true;
                        	taksiler.Taksilerimiz();
                        }else {
                            servis.taksiCagir();
                            ss.acilis();
                            i = false;
                        }
                        break;
                }
            }

            //Müşteri için yemek menüsü tercih işlemi
            while(iiii) {
            	System.out.println("Yemekli araç ister misiniz ? 'evet' ya da 'hayır' diye yanıt veriniz");
                Scanner y=new Scanner(System.in);
                String secim2=y.nextLine();
                yemek cagirma=new yemek();
                if(secim2.equals("evet")) {
                	while(j) {
                    	System.out.println(" 1) Yemek + İçecek\n 2) Sadece İçecek");
                        System.out.println("Lütfen Seçiminizi Yapınız");
                        Scanner m=new Scanner(System.in);
                        int secim3=m.nextInt();
                        switch (secim3){
                            case 1:
                              do{
                            	  jj = false;
                            	  menücagir.menüYİ();
                            	  Scanner p=new Scanner(System.in);
                                  int secim4=p.nextInt();

                                       switch (secim4){
                                           case 1:cagirma.cagir("Cips","Kola");
                                               break;

                                           case 2:cagirma.cagir("Kuruyemiş","İce Tea");
                                               break;

                                           case 3:cagirma.cagir("Çikolata","Su");
                                               break;

                                           case 4:cagirma.cagir("Çiğköfte","Ayran");
                                               break;

                                           case 5:cagirma.cagir("Sandwich","Meyve Suyu");
                                               break;

                                           default:System.out.println("Yanlış Seçim Girdiniz"); jj = true;
                                       }
                              }
                              while(jj);
                               j  = false;
                               break;

                            case 2:
                            	do{
                            		jjj = false;
                            		menücagir.menüİ();
                                    Scanner l=new Scanner(System.in);
                                    int secim5=l.nextInt();

                                         switch (secim5){
                                              case 1:cagirma.cagir("Kola");
                                                  break;
                                              case 2:cagirma.cagir("İce Tea");
                                                  break;
                                              case 3:cagirma.cagir("Su");
                                                  break;
                                              case 4:cagirma.cagir("Ayran");
                                                  break;
                                              case 5:cagirma.cagir("Meyve Suyu");
                                                  break;
                                              case 6:cagirma.cagir("Soda");
                                                  break;

                                             default:System.out.println("Yanlış Seçim Girdiniz"); jjj = true;
                                         }
                            	}
                            	while(jjj);
                              j  = false;     
                              break;

                            default:System.out.println("Yanlis Secim Girdiniz"); j = true;

                    }
                    Scanner yiyecek=new Scanner(System.in);
                    Scanner icecek=new Scanner(System.in);
                    iiii = false;
                	}
                }else if(secim2.equals("hayır")) {
                	System.out.println("Yemekli araç tercih etmediniz");
                	iiii = false;
                }
                else {
                	System.out.println("Hatalı tuşlama yaptınız");
                	iiii = true;
                }
            }

            
            //İndirim kuponu sorgulama işlemi
            
            while(jjjj) {
                System.out.println("İndirim Kuponunuz Var mı ? Varsa 1'e yoksa 2'e tiklayiniz");
                Scanner indirim=new Scanner(System.in);
                int indirimK=indirim.nextInt();
                switch(indirimK){
                	case 1:
        	            System.out.println("Kupon Kodunuzu Giriniz");
        	            Scanner kod=new Scanner(System.in);
        	            String koduKullan=kod.nextLine();
        	            i̇ndirimKodu.setKuponKodu(koduKullan);
        	            i̇ndirimKodu.kazan();
        	            jjjj = false;
        	            break;
                	case 2:
                        System.out.println("İndirim kuponu kullanmadan devam ediyorsunuz...");
                        jjjj = false;
                        break;
                    default:
                    	System.out.println("Hatalı tuşlama yaptınız.");
                    	jjjj = true;
                		
                }
            }
            
            //Memnuniyet anketi
            memnuniyet memnuniyetiniz=new memnuniyet();
            
            //Yenileme işlemi
            while(iii) {
                System.out.println("Yeniden işlem yapmak istiyorsanız 1'e istemiyorsanız 2'ye basınız: ");
                Scanner r=new Scanner(System.in);
                int refresh=r.nextInt();
                switch(refresh) {
            	case 1:
            		ii = true;
            		iii = false;
            		break;
            	case 2: 
            		ii = false;
            		iii = false;
            		break;
            	default:
            		System.out.println("Hatalı tuşlama yaptınız");
            		iii = true;
            }
            }
            
    	}
    }
}