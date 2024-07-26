import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts>contactList=new ArrayList<>();

    public void addContact(Contacts contact_detail){
        contactList.add(contact_detail);
        System.out.println("Contact Added successfully.\n "+contact_detail);

    }
    public Contacts searchContact(String firstname,String lastname){
        for(Contacts i:contactList){
            if(Objects.equals(i.firstName, firstname) && Objects.equals(i.lastName, lastname)){
                return i;
            }
        }
        return null;
    }
    public void editContact(String firstname, String lastname){
        Scanner s=new Scanner(System.in);
        Contacts contact=searchContact(firstname,lastname);
        if(contact==null){
            System.out.println("\nContact not exists!");
            return;
        }
        else{
            System.out.println("\n1. Edit Firstname ");
            System.out.println("2. Edit Lastname ");
            System.out.println("3. Edit Address ");
            System.out.println("4. Edit City ");
            System.out.println("5. Edit State ");
            System.out.println("6. Edit zip ");
            System.out.println("7. Edit phone number ");
            System.out.println("8. Edit Email ");

            System.out.print("Enter your Choice: ");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter New firstName");
                    String new_firstName=s.next();
                    contact.setFirstName(new_firstName);
                    break;
                case 2:
                    System.out.println("Enter New Lastname");
                    String new_lastName=s.next();
                    contact.setLastName(new_lastName);
                    break;
                case 3:
                    System.out.println("Enter New Address");
                    String new_address=s.next();
                    contact.setAddress(new_address);
                    break;
                case 4:
                    System.out.println("Enter New City");
                    String new_city=s.next();
                    contact.setCity(new_city);
                    break;
                case 5:
                    System.out.println("Enter new state");
                    String new_state=s.next();
                    contact.setState(new_state);
                    break;
                case 6:
                    System.out.println("Enter new Zip");
                    int new_zip=s.nextInt();
                    contact.setZip(new_zip);
                    break;
                case 7:
                    System.out.println("Enter new PhoneNumber");
                    String new_phno=s.next();
                    contact.setPhoneNumber(new_phno);
                    break;
                case 8:
                    System.out.println("Enter new Email");
                    String new_email=s.next();
                    contact.setEmail(new_email);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("Contact Edited.... \n"+contact);
        }

    }
    public void DeleteContact(String firstname, String lastname ){
        Scanner s=new Scanner(System.in);
        Contacts contact=searchContact(firstname,lastname);
        if(contact==null){
            System.out.println("Contact not exists!");
            return;
        }else{
            contactList.remove(contact);
            System.out.println("\nContact Removed!");
        }
    }

    public void Display_Address_Book(){
        System.out.println(contactList);

    }

}
