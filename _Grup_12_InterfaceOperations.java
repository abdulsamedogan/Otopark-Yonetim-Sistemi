package _grup_12;
import java.util.regex.Pattern;

public class _Grup_12_InterfaceOperations {
    private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
    //İSİM SOY İSİM ++
    // TC ++
    //MAİL ++
    //Telefon ++
    
    public boolean isNameAndSurname(String name)
    {
        boolean result = true;
        for(int i = 0; i<name.length(); i++)
        {
            char c = name.charAt(i);
            if(Character.isDigit(c))
            {
                result = false;
            }   
        }
        if(name.length()<=2 || name.length()>=16)
        {
            result = false;
        }
        return result;
    }
    public boolean isTelefon(String telefon)
    {
        boolean result = true;
        for(int i = 0; i<telefon.length(); i++)
        {
            char c = telefon.charAt(i);
            if(Character.isDigit(c) == false)
            {
                result = false;
            }   
        }
        if(telefon.charAt(0) != 0 && telefon.length() != 11)
        {
            return false;
        }
        return result;
    }
    
    public boolean isTC(String TC)
    {
        boolean result = true;
        for(int i = 0; i<TC.length(); i++)
        {
            char c = TC.charAt(i);
            if(Character.isDigit(c) == false)
            {
                result = false;
            }   
        }
        if(TC.length() != 11)
        {
            return false;
        }
        return result;
    }
    
    //Kullanıcıdan alınan email'in doğruluğunu kontrol eden fonksiyon //Test +
    public boolean isEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email).find(); 
    } 
    
    public boolean kullaniciKaydiKontrol(boolean isim,boolean soyisim,boolean telefon,boolean TC,boolean mail)
    {
        boolean result = true;
        if(isim != true || soyisim != true || telefon != true || TC != true || mail != true)
        {
            result = false;
        }
        return result;
    }
}
