package _grup_12;

public class _Grup_12_Iletisim {
    int id;
    String telefon;
    String mail;

    public _Grup_12_Iletisim(int id, String telefon, String mail) {
        this.id = id;
        this.telefon = telefon;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
