public class Kapasite {
    private int kapasite;
    public void setSariKapasite(int kapasite){
    	this.kapasite=kapasite;
        if(kapasite>4){
        	System.out.println("Bu taksi size uygun değildir lütfen farklı bir taksiyle devam ediniz");
        }
    }
    public int getSariKapasite(){
        return kapasite;
    }
    public void setSiyahKapasite(int kapasite){
    	this.kapasite=kapasite;
        if(kapasite>8){
        	System.out.println("Bu taksi size uygun değildir lütfen farklı bir taksiyle devam ediniz");
        }
    }
    public int getSiyahKapasite(){
        return kapasite;
    }
    public void setServisKapasite(int kapasite){
    	this.kapasite=kapasite;
        if(kapasite>20){
        	System.out.println("Servis araçlarımız maks 20 kişiliktir");
        }

    }
    public int getServisKapasite(){
        return kapasite;
    }
    public void setTurkuvazKapasite(int kapasite){
    	this.kapasite=kapasite;
        if(kapasite>6){
            System.out.println("Bu taksi size uygun değildir lütfen farklı bir taksiyle devam ediniz");
        }
    }
    public int getTurkuvazKapasite(){
        return kapasite;
    }
}
