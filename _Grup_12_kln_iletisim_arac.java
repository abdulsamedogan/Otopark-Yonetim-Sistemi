package _grup_12;

public class _Grup_12_kln_iletisim_arac {
    int ID;
    int klnID;
    int iletisimID;
    int aracId;

    public _Grup_12_kln_iletisim_arac(int ID, int klnID, int iletisimID, int aracId) {
        this.ID = ID;
        this.klnID = klnID;
        this.iletisimID = iletisimID;
        this.aracId = aracId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getKlnID() {
        return klnID;
    }

    public void setKlnID(int klnID) {
        this.klnID = klnID;
    }

    public int getIletisimID() {
        return iletisimID;
    }

    public void setIletisimID(int iletisimID) {
        this.iletisimID = iletisimID;
    }

    public int getAracId() {
        return aracId;
    }

    public void setAracId(int aracId) {
        this.aracId = aracId;
    }
    
    
}
