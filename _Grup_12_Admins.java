package _grup_12;

public class _Grup_12_Admins {
    int adminID;
    String adminIsim;
    String adminKlnAdi;
    String adminSifre;

    public _Grup_12_Admins(int adminID, String adminIsim, String adminKlnAdi, String adminSifre) {
        this.adminID = adminID;
        this.adminIsim = adminIsim;
        this.adminKlnAdi = adminKlnAdi;
        this.adminSifre = adminSifre;
    }
       
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminIsim() {
        return adminIsim;
    }

    public void setAdminIsim(String adminIsim) {
        this.adminIsim = adminIsim;
    }

    public String getAdminKlnAdi() {
        return adminKlnAdi;
    }

    public void setAdminKlnAdi(String adminKlnAdi) {
        this.adminKlnAdi = adminKlnAdi;
    }

    public String getAdminSifre() {
        return adminSifre;
    }

    public void setAdminSifre(String adminSifre) {
        this.adminSifre = adminSifre;
    }
    
    
}
