package _grup_12;

public class _Grup_12_Arac {
    int id;
    String Marka;
    String Renk;
    String Model;
    String Plaka;

    public _Grup_12_Arac(int id, String Marka, String Renk, String Model, String Plaka) {
        this.id = id;
        this.Marka = Marka;
        this.Renk = Renk;
        this.Model = Model;
        this.Plaka = Plaka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String Renk) {
        this.Renk = Renk;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getPlaka() {
        return Plaka;
    }

    public void setPlaka(String Plaka) {
        this.Plaka = Plaka;
    }
    
    
           
}
