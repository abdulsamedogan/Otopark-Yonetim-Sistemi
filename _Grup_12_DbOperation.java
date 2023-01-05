package _grup_12;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class _Grup_12_DbOperation {
    _Grup_12_DbHelper helper = new _Grup_12_DbHelper();
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet;
    CallableStatement myStm = null;
    
    //Adminlerin veri tabanındaki bütün bilgileri tutması için oluşturulmuş boş ArrayList
    ArrayList<_Grup_12_Admins> admins = new ArrayList<_Grup_12_Admins>();
    
    //Kullanıcıların veri tabanındaki bütün bilgileri tutması için oluşturulmuş boş ArrayList
    ArrayList<_Grup_12_User> users = new ArrayList<_Grup_12_User>();
    
    //Kullanıcıların iletişim veri tabanındaki bütün bilgileri tutması için oluşturulmuş boş ArrayList
    ArrayList<_Grup_12_Iletisim> iletisims = new ArrayList<_Grup_12_Iletisim>();
    
    //Kullanıcıların araç tabanındaki bütün bilgileri tutması için oluşturulmuş boş ArrayList
    ArrayList<_Grup_12_Arac> cars = new ArrayList<_Grup_12_Arac>();
    
    //Otopark bilgilerini veri tabanından çektikten sonra tutacağımız boş arraylist
    ArrayList<_Grup_12_Otopark> otopark = new ArrayList<_Grup_12_Otopark>();
    
    //kln_iletisim_arac boş liste
    ArrayList<_Grup_12_kln_iletisim_arac> grup_12_kln_iletisim_aracs = new ArrayList<_Grup_12_kln_iletisim_arac>();
    
    //fis bilgileri listesi
    ArrayList<_Grup_12_fis> fiss = new ArrayList<>();
    
    //Aktif kullanıcı nesnesi
    _Grup_12_ActiveAdmin activeAdmin;
    
    public void setConnection()
    {
        try {
            connection = helper.getConnection();
            //System.out.println("Bağlantı oluştu!");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }    
    }
    
    //Adminleri arraylist e atan fonksiyon
    public void setArrayListAdmins()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        admins.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from admin");
            while(resultSet.next())
            {
                admins.add(new _Grup_12_Admins(
                        resultSet.getInt("adminID"),
                        resultSet.getString("adminIsim"),
                        resultSet.getString("adminKlnAdi"),
                        resultSet.getString("adminSifre")
                ));   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
    }
    
    //Kullanıcıları arraylist e atan fonksiyon
    public void setArrayListUsers()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        users.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from kullanicilar");
            while(resultSet.next())
            {
                users.add(new _Grup_12_User(
                        resultSet.getInt("idkullanıcılar"),
                        resultSet.getString("kullanıcılarIsim"),
                        resultSet.getString("kullanıcılarSoyIsim"),
                        resultSet.getString("kullanıcılarTc"))
                        
                );   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
    }
    
    //Kullanıcıları arraylist e atan fonksiyon
    public void setArrayListCars()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        cars.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from aracBilgisi");
            while(resultSet.next())
            {
                cars.add(new _Grup_12_Arac(
                        resultSet.getInt("idaracBilgisi"),
                        resultSet.getString("aracBilgisiMarka"),
                        resultSet.getString("aracBilgisiRenk"),
                        resultSet.getString("aracBilgisiModel"),
                        resultSet.getString("aracBilgisiPlaka"))      
                );   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
    }
    
    //Kullanıcıları arraylist e atan fonksiyon
    public void setArrayListIletims()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        iletisims.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from kullanici_iletisim");
            while(resultSet.next())
            {
                iletisims.add(new _Grup_12_Iletisim(
                        resultSet.getInt("idkullanıcıİletisim"),
                        resultSet.getString("kullanici_iletisimTelefon"),
                        resultSet.getString("kullanici_iletisimMail"))
                );   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
    }
    
    //Admin girişini kontrol eden fonksiyon
    public String controlLogin(String klnAd,String sifre)
    {
        boolean var = false;
        int a = 1;
        int b = 1;
        setArrayListAdmins();
        String dbIsim = "";
        for(int i =0; i < admins.size();i++)
        {
            //System.out.println(userses.get(i).getKlnAdi());
            String dbklnAdi = admins.get(i).getAdminKlnAdi();
            String dbSifre = admins.get(i).getAdminSifre();
            
            dbSifre = dbSifre.replace(" ","");
            dbSifre = dbSifre.trim();
           
            dbklnAdi = dbklnAdi.replace(" ","");
            dbklnAdi = dbklnAdi.trim();
            a=dbklnAdi.compareTo(klnAd);
            if(a == 0)
            {   
                b=dbSifre.compareTo(sifre);
                if(b == 0)
                {
                    dbIsim = admins.get(i).getAdminIsim();
                    var = true;
                    activeAdmin = new _Grup_12_ActiveAdmin(
                            admins.get(i).adminID,
                            admins.get(i).adminIsim,
                            admins.get(i).adminKlnAdi,
                            admins.get(i).adminSifre,
                            true);
                    break;
                }
            } 
        }
        return dbIsim;
        
    }
    
    //Adminleri arraylist e atan fonksiyon
    public void setArrayListOtopark()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        otopark.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from otopark");
            while(resultSet.next())
            {
                otopark.add(new _Grup_12_Otopark(
                        resultSet.getInt("idotopark"),
                        resultSet.getInt("otoparkKat"),
                        resultSet.getInt("otoparkNo"),
                        resultSet.getBoolean("otoparkDoluluk")      
                ));   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
    }
    
    //Kullanıcıyı veri tabanına ekleyen fonksiyon
    public void insert_kullanici
        (
            String isim,
            String soyisim,
            String tc,
            String telefon,
            String mail,
            String marka,
            String renk,
            String model,
            String plaka
        )
    {
        setConnection();
        try {
            myStm =  connection.prepareCall(
                    "{call insert_kullanici(?,?,?)}");
                    myStm.setString(1,isim);
                    myStm.setString(2,soyisim);
                    myStm.setString(3,tc);
                    myStm.execute();
                    myStm.close();
                    myStm = null;
            myStm = connection.prepareCall(
                    "{call insert_kullanici_iletisim(?,?)}");
                    myStm.setString(1,telefon);
                    myStm.setString(2,mail);
                    myStm.execute();
                    myStm.close();
                    myStm = null;
            myStm = connection.prepareCall(
                    "{call insert_aracBilgisi(?,?,?,?)}");
                    myStm.setString(1,marka);
                    myStm.setString(2,renk);
                    myStm.setString(3,model);
                    myStm.setString(4,plaka);
                    myStm.execute();
                    myStm.close();
                    sonEklenenKullanıcıID();
                    } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
        public void sonEklenenKullanıcıID() throws SQLException
        {
            setArrayListUsers();
            setArrayListCars();
            setArrayListIletims();
            preparedStatement = connection.prepareStatement("insert into kln_iletisim_arac(IDKln,IDİletisim,IDArac) values(?,?,?);");
            preparedStatement.setInt(1, users.get(users.size()-1).getId());
            preparedStatement.setInt(2, iletisims.get(iletisims.size()-1).getId());
            preparedStatement.setInt(3, cars.get(cars.size()-1).getId());
            preparedStatement.execute();
            
        }
        
    public void deleteUser(int klnID)
    {
        setConnection();
        try {
            myStm =  connection.prepareCall(
                    "{call _delete_kullanıcı(?)}");
                    myStm.setInt(1,klnID);
                    myStm.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setArrayListkln_iletisim_arac()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        grup_12_kln_iletisim_aracs.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from kln_iletisim_arac");
            while(resultSet.next())
            {
                grup_12_kln_iletisim_aracs.add(new _Grup_12_kln_iletisim_arac(
                resultSet.getInt("idkln_iletisim_arac"),
                resultSet.getInt("IDKln"),
                resultSet.getInt("IDİletisim"),
                resultSet.getInt("IDArac")
                ));   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
        
    }
    public int search_kln_iletisim_arac_klnID(int klnID)
    {
        setConnection();
        setArrayListkln_iletisim_arac();
        int ID = 0;
        for(int i=0;i<grup_12_kln_iletisim_aracs.size();i++)
        {
            if(grup_12_kln_iletisim_aracs.get(i).getKlnID() == klnID)
            {
                ID = grup_12_kln_iletisim_aracs.get(i).getID();
            }
        }
        return ID;
    }
    public void updateArac(int id,String marka,String model,String renk,String plaka)
    {
        setConnection();
        try {
            myStm =  connection.prepareCall(
                    "{call update_kullanıcı_aracBilgisi(?,?,?,?,?)}");
                    myStm.setInt(1,id);
                    myStm.setString(2,marka);
                    myStm.setString(3,renk);
                    myStm.setString(4,model);
                    myStm.setString(5,plaka);
                    myStm.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateIletisim(int id,String telefon,String mail)
    {
        setConnection();
        try {
            myStm =  connection.prepareCall(
                    "{call update_kullanıcı_iletisim(?,?,?)}");
                    myStm.setInt(1,id);
                    myStm.setString(2,telefon);
                    myStm.setString(3,mail);
                    myStm.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Fiş bilgilerini arraylist e atan fonksiyon
    public void setArrayListFiss()
    {
        //Kod tekrar tekrar çağırıldığında aynı veriler tekrarlamasın diye başta arraylist sıfırlanıyor
        fiss.clear();
        setConnection();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from fis");
            while(resultSet.next())
            {
                fiss.add(new _Grup_12_fis(
                        resultSet.getInt("idfiş"),
                        resultSet.getInt("fisKln_iletisim_arac"),
                        resultSet.getInt("fisOtoparkid"),
                        resultSet.getString("fişSüre"),
                        resultSet.getString("fişUcret")) 
                );   
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
    }
    public void deleteFis(int id)
    {
        setConnection();
        try {
            preparedStatement = connection.prepareStatement("delete from fis where idfiş = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
                    } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void otoparkDolulukDeğiştirme(int doluluk, int otoparkId)
    {
        setArrayListOtopark();
        try {
            preparedStatement = connection.prepareStatement("update set otoparkDoluluk= ? where idotopark = ?");
            preparedStatement.setInt(1, doluluk);
            preparedStatement.setInt(2, otoparkId);
            preparedStatement.execute(); 
        } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fisOlusturma(int kln_iletisim_arac,int otoparkID,String sure,String fisUcret)
    {
        setConnection();
        try {
            preparedStatement = connection.prepareStatement(
                    "insert into fis(fisKln_iletisim_arac,fisOtoparkid,fişSüre,fişUcret) values(?,?,?,?);");
            preparedStatement.setInt(1,kln_iletisim_arac);
            preparedStatement.setInt(2,otoparkID);
            preparedStatement.setString(3,sure);
            preparedStatement.setString(4,fisUcret);
            preparedStatement.execute();
            } catch (SQLException ex) {
            Logger.getLogger(_Grup_12_DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int plakaKontrol(String plaka)
    {
        int sonuc = 0;
        setArrayListCars();
        for(int i = 0; i<cars.size();i++)
        {
            if(cars.get(i).getPlaka().equals(plaka))
            {
                sonuc = cars.get(i).getId();
            }
        }
        return sonuc;
    }
    
    public int arac_kontrol(int aracID)
    {
        int sonuc = 0;
        setArrayListkln_iletisim_arac();
        for(int i = 0;i<grup_12_kln_iletisim_aracs.size();i++)
        {
            if(grup_12_kln_iletisim_aracs.get(i).getAracId() == aracID)
            {
                sonuc = grup_12_kln_iletisim_aracs.get(i).getID();
            }
        }
        return sonuc;
    }
    
    void insert_kullanici(JTextField txt_Isim, JTextField txt_SoyIsim, JTextField txt_TC, JTextField txt_Telefon, JTextField txt_Mail, JTextField txt_Marka, JTextField txt_Renk, JTextField txt_Model, JTextField txt_Plaka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
