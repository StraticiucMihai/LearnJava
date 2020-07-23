package PreviousImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    /*   private enum MenuOptions
       {
           Quit (6),
           PrintAllContacts(1),
           AddNewContact(2),
           UpdateContact(3),
           RemoveContact(4),
           SearchContact(5);

           MenuOptions(int i) {
           }

       }*/
    public static Scanner scanner= new Scanner(System.in);
    public static ArrayList<Contacts> ListOfContacts = new ArrayList<Contacts>();
    public static void main(String[] args )
    {

        int Command;
        PrintMenu();
        while((Command= scanner.nextInt())!= 6 )
        {

            System.out.println("Command read is : "+Command);
            switch (Command)
            {
                case 1:/*Print All PreviousImplementation.Contacts*/
                {
                    if(ListOfContacts.isEmpty() != true) {
                        for (Contacts contacts : ListOfContacts) {
                            System.out.println("Name:" + contacts.getName() + " PreviousImplementation.Phone number:" + contacts.getPhoneNr());
                        }
                    }
                    else System.out.println("PreviousImplementation.List is empty");
                }
                break;
                case 2:/*Add a new Contact*/
                {
                    System.out.println("Enter the name:");
                    String Name = scanner.next();
                    System.out.println("Enter the PreviousImplementation.Phone Number:");
                    String PhoneNumber = scanner.next();
                    System.out.println("Name: "+Name+" PreviousImplementation.Phone: "+PhoneNumber);
                    Contacts NewContact = new Contacts(Name,PhoneNumber);
                    ListOfContacts.add(NewContact);
                }
                break;
                case 3:/*Update an existing Contact*/
                {
                    String Name;
                    String PhoneNumber;
                    int Option;
                    int IndexOfObject;
                    System.out.println("Please enter the name of the contact:");
                    Name = scanner.next();
                     if(-1 < (IndexOfObject=SearchContact(Name)))
                     {
                         //System.out.println("Contact Exist and its index is: "+ IndexOfObject);
                         System.out.println("What do you want to change?\n" +
                                 "1.Name\n" +
                                 "2.PreviousImplementation.Phone Number");
                         Option =scanner.nextInt();
                         switch (Option)
                         {
                             case 1:
                             {
                                 System.out.println("Enter new name:");
                                 Name = scanner.next();
                                 Contacts contacts =ListOfContacts.get(IndexOfObject);
                                  contacts.setName(Name);
                             }
                             break;
                             case 2:
                             {
                                 System.out.println("Enter new phone number:");
                                 PhoneNumber= scanner.next();
                                 Contacts contacts =ListOfContacts.get(IndexOfObject);
                                 contacts.setPhoneNr(PhoneNumber);
                             }
                             break;
                             default:
                             {}
                             break;
                         }
                     }
                     else
                     {
                         System.out.println("Contact Don't Exist");
                     }

                }
                break;
                case 4:/*Remove an existing Contact*/
                {
                    String Name;
                    int IndexOfObject;
                    System.out.println("Please enter the name of the contact:");
                    Name = scanner.next();
                    if(-1 < (IndexOfObject=SearchContact(Name)))
                    {
                        ListOfContacts.remove(IndexOfObject);
                    }
                    else System.out.println("Contact don't exist");
                }
                break;
                case 5:/*Search for a specific Contact*/
                {
                    String Name;
                    int IndexOfObject;
                    System.out.println("Please enter the name of the contact:");
                    Name = scanner.next();
                    if(-1 < (IndexOfObject=SearchContact(Name)))
                    {
                          Contacts contacts= ListOfContacts.get(IndexOfObject);
                          System.out.println("Name is : "+ contacts.getName()+ "PreviousImplementation.Phone number is:"+contacts.getPhoneNr());
                    }
                    else System.out.println("Contact don't exist");
                }
                break;
                case 6:/*Quit*/
                {}
                break;
                default:
                {
                    System.out.println("A wrong command was entered:"+Command);
                    PrintMenu();
                }
                break;
            }
            PrintMenu();
        }
    }

    public static void PrintMenu()
    {
        System.out.println("Menu of commands available:\n" +
                "1.Print All PreviousImplementation.Contacts\n" +
                "2.Add a new Contact\n" +
                "3.Update an existing Contact\n" +
                "4.Remove an existing Contact\n" +
                "5.Search for a specific Contact\n" +
                "6.Quit\n" +
                "Select an option:");
    }
    public static int SearchContact(String Name)
    {
        for(Contacts i: ListOfContacts)
        {
            if(i.getName().equals(Name))
            {
                return ListOfContacts.indexOf(i);
            }
        }
        return -1;
    }
}
