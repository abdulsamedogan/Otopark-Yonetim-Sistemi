package _grup_12;

public class _Grup_12_fis {
    int id;
    int kln_iletisim_arac;
    int otoparkID;
    String fisSure;
    String fisUcret;

    public _Grup_12_fis(int id, int kln_iletisim_arac, int otoparkID, String fisSure, String fisUcret) {
        this.id = id;
        this.kln_iletisim_arac = kln_iletisim_arac;
        this.otoparkID = otoparkID;
        this.fisSure = fisSure;
        this.fisUcret = fisUcret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKln_iletisim_arac() {
        return kln_iletisim_arac;
    }

    public void setKln_iletisim_arac(int kln_iletisim_arac) {
        this.kln_iletisim_arac = kln_iletisim_arac;
    }

    public int getOtoparkID() {
        return otoparkID;
    }

    public void setOtoparkID(int otoparkID) {
        this.otoparkID = otoparkID;
    }

    public String getFisSure() {
        return fisSure;
    }

    public void setFisSure(String fisSure) {
        this.fisSure = fisSure;
    }

    public String getFisUcret() {
        return fisUcret;
    }

    public void setFisUcret(String fisUcret) {
        this.fisUcret = fisUcret;
    }
    
    
}
