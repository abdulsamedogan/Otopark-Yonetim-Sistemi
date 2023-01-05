package _grup_12;

public class _Grup_12_ActiveAdmin {
    int adminNo;
    String adminIsim;
    String adminKlnAdi;
    String adminSifre;
    boolean activity;

    public _Grup_12_ActiveAdmin(int adminNo, String adminIsim, String adminKlnAdi, String adminSifre, boolean activity) {
        this.adminNo = adminNo;
        this.adminIsim = adminIsim;
        this.adminKlnAdi = adminKlnAdi;
        this.adminSifre = adminSifre;
        this.activity = activity;
    }

    public _Grup_12_ActiveAdmin() {
    }
    
    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
    
    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
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
