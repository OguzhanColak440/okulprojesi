package P1;

public class Ögretmen  extends Kisi {

    private String bölüm;
    private String sicil;

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

    public Ögretmen(String bölüm, String sicil) {
        this.bölüm = bölüm;
        this.sicil = sicil;
    }

    public Ögretmen(String adSoyad, String kimlikNo, int yas, String bölüm, String sicil) {
        super(adSoyad, kimlikNo, yas);
        this.bölüm = bölüm;
        this.sicil = sicil;
    }
}
