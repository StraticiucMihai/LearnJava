package PreviousImplementation;

public class Contacts
{

    private String Name;
    private String PhoneNr;

    public Contacts(String Name, String Phone){
        try{
        this.Name = Name;
        this.PhoneNr =Phone;
        }
        catch (Exception e)
        {
            System.out.println("Something is wrong with creating an object");
        }
    }
    public String getName() {
        return this.Name;
    }

    public String getPhoneNr() {
        return this.PhoneNr;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPhoneNr(String phoneNr) {
        PhoneNr = this.PhoneNr;
    }

}
