package _grup_12;

public class _Grup_12 {

    public static void main(String[] args) {
        _Grup_12_DbOperation n1 = new _Grup_12_DbOperation();
        _Grup_12_InterfaceOperations n2 = new _Grup_12_InterfaceOperations();
        n1.setConnection();
        n1.setArrayListAdmins();
        //n1.fisOlusturma(3, 4, "3 saat", "5tl");
        n1.deleteFis(40);
        //n1.updateArac(34, "Fiat", "Tempra", "Mavi", "34 SRH 37");
        //n1.insert_kullanici("ad", "ad", "ad", "ad", "ad", "ad", "ad", "ad", "ad");
        //System.out.println(n1.admins.get(0).adminSifre);
        System.out.println(n2.isEmail("furkan"));
        System.out.println(n2.isEmail("furkankafali@gmail.com"));
    }
    
}
