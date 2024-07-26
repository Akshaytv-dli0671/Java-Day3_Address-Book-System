import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Map<String, AddressBook> addressbookMap=new HashMap<>();
        Scanner s=new Scanner(System.in);

        System.out.printf("Welcome to Address Book!\n");


        do{
            System.out.println("\n1. Add Address Book\n2. Select an AddressBook\n3. Display AddressBook\n4. Exit");
            System.out.println("Enter your choice:");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter AddressBook Name");
                    String AddressName=s.next();
                    AddressBook addressBook=new AddressBook();
                    addressbookMap.put(AddressName,addressBook);
                    break;
                case 2:
                    System.out.println("Enter AddressBook name");
                    String AddressBook_name=s.next();
                    System.out.println("Checking....\n");
                    if(addressbookMap.containsKey(AddressBook_name)) {
                        System.out.println("Welcome to " + AddressBook_name + " Address Book");
                        AddressBook addressBook2=addressbookMap.get(AddressBook_name);
                        int option;
                        do {

                            System.out.println("\n1. Add a new Contact");
                            System.out.println("2. Edit existing contact");
                            System.out.println("3. Delete a contact");
                            System.out.println("4. Add Multiple Contacts");
                            System.out.println("5. Exit");
                            System.out.println("Enter Your option:");

                            option = s.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("Enter First Name:");
                                    String firstName = s.next();
                                    System.out.println("Enter Last Name:");
                                    String lastName = s.next();
                                    System.out.println("Enter Address:");
                                    String address = s.next();
                                    System.out.println("Enter City:");
                                    String city = s.next();
                                    System.out.println("Enter Zip:");
                                    int zip = s.nextInt();
                                    System.out.println("Enter State:");
                                    String state = s.next();
                                    System.out.println("Enter Phonenumber:");
                                    String phno = s.next();
                                    System.out.println("Enter Email:");
                                    String email = s.next();

                                    Contacts contacts = new Contacts(firstName, lastName, address, city, zip, state, phno, email);
                                    addressBook2.addContact(contacts);
                                    break;
                                case 2:
                                    System.out.println("Enter first name: ");
                                    String first = s.next();
                                    System.out.println("Enter last name: ");
                                    String last = s.next();
                                    addressBook2.editContact(first, last);
                                    break;
                                case 3:
                                    System.out.println("Enter first name: ");
                                    String first1 = s.next();
                                    System.out.println("Enter last name: ");
                                    String last1 = s.next();
                                    addressBook2.DeleteContact(first1, last1);
                                    break;

                                case 4:
                                    System.out.println("Enter Count: ");
                                    int count = s.nextInt();
                                    for (int i = 0; i < count; i++) {
                                        System.out.println("Enter First Name:");
                                        String firstNameM = s.next();
                                        System.out.println("Enter Last Name:");
                                        String lastNameM = s.next();
                                        System.out.println("Enter Address:");
                                        String addressM = s.next();
                                        System.out.println("Enter City:");
                                        String cityM = s.next();
                                        System.out.println("Enter Zip:");
                                        int zipM = s.nextInt();
                                        System.out.println("Enter State:");
                                        String stateM = s.next();
                                        System.out.println("Enter Phonenumber:");
                                        String phnoM = s.next();
                                        System.out.println("Enter Email:");
                                        String emailM = s.next();

                                        Contacts contactsM = new Contacts(firstNameM, lastNameM, addressM, cityM, zipM, stateM, phnoM, emailM);
                                        addressBook2.addContact(contactsM);
                                        System.out.println();
                                    }
                                    break;

                                case 5:
                                    break;
                                default:
                                    System.out.println("Enter valid input");
                                    break;

                            }

                        } while (option != 5);
                    }
                    else{
                        System.out.println("Address Book not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter AddressBook name");
                    String AddressBook_display=s.next();
                    System.out.println("Fetching data....\n");
                    AddressBook addressBook1=addressbookMap.get(AddressBook_display);
                    addressBook1.Display_Address_Book();

                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter valid choice");
                    break;

            }

        }while(true);




    }
}