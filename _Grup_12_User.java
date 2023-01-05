package _grup_12;

public class _Grup_12_User {
    int id;
    String isim;
    String soyIsim;
    String Tc;

    public _Grup_12_User(int id,String isim, String soyIsim, String Tc) {
        this.id = id;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.Tc = Tc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTc() {
        return Tc;
    }

    public void setTc(String Tc) {
        this.Tc = Tc;
    }
    
}
