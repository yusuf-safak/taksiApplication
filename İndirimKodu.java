public class İndirimKodu {
    private String kuponKodu;

    public void setKuponKodu(String KuponKodu){
        this.kuponKodu=KuponKodu;

    }

    public void  kazan() {
    	System.out.println("İndirim kodu işleniyor...");
        switch(kuponKodu){
            case "bdk532": System.out.println("20 TL İndirim Kodu Tanımlanmıştır"); break;
            case "v3yv8t": System.out.println("50 TL İndirim Kodu Tanımlanmıştır"); break;
            case "k004m7": System.out.println("30 TL İndirim Kodu Tanımlanmıştır"); break;
            case "35mkl2": System.out.println("Bu İndirim Kodu Tükenmiştir"); break;
            default:System.out.println("Yanlış İndirim Kodu Girdiniz"); break;
        }

    }
}
