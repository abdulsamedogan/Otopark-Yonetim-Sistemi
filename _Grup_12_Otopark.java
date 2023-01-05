package _grup_12;

public class _Grup_12_Otopark {
    int otoparkID;
    int otoparkKat;
    int otoparkNo;
    boolean otoparkDoluluk;

    public _Grup_12_Otopark(int otoparkID, int otoparkKat, int otoparkNo, boolean otoparkDoluluk) {
        this.otoparkID = otoparkID;
        this.otoparkKat = otoparkKat;
        this.otoparkNo = otoparkNo;
        this.otoparkDoluluk = otoparkDoluluk;
    }
    
    public int getOtoparkID() {
        return otoparkID;
    }

    public void setOtoparkID(int otoparkID) {
        this.otoparkID = otoparkID;
    }

    public int getOtoparkKat() {
        return otoparkKat;
    }

    public void setOtoparkKat(int otoparkKat) {
        this.otoparkKat = otoparkKat;
    }

    public int getOtoparkNo() {
        return otoparkNo;
    }

    public void setOtoparkNo(int otoparkNo) {
        this.otoparkNo = otoparkNo;
    }

    public boolean isOtoparkDoluluk() {
        return otoparkDoluluk;
    }

    public void setOtoparkDoluluk(boolean otoparkDoluluk) {
        this.otoparkDoluluk = otoparkDoluluk;
    }
    
    
}
