import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook=new AddressBook();
        System.out.printf("Welcome to Address Book!");
        do{
            System.out.print("Enter Your option:");
            System.out.println("1. Add a new Contact");
            System.out.println("2. Edit existing contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Add Multiple Contacts");
            System.out.println("5. ");
            System.out.println("6. Exit");
            Scanner s=new Scanner(System.in);
            int option=s.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter First Name:");
                    String firstName=s.next();
                    System.out.println("Enter Last Name:");
                    String lastName=s.next();
                    System.out.println("Enter Address:");
                    String address=s.nextLine();
                    System.out.println("Enter City:");
                    String city=s.next();
                    System.out.println("Enter Zip:");
                    int zip=s.nextInt();
                    System.out.println("Enter State:");
                    String state=s.next();
                    System.out.println("Enter Phonenumber:");
                    String phno=s.next();
                    System.out.println("Enter Email:");
                    String email=s.next();

                    Contacts contacts=new Contacts(firstName,lastName,address,city,zip,state,phno,email);
                    addressBook.addContact(contacts);
                    break;
            }

        }while(true);


    }
}