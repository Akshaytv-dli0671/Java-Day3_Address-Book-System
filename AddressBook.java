import java.util.ArrayList;
import java.util.Objects;

public class AddressBook {
    ArrayList<Contacts>contact=new ArrayList<>();

    public void addContact(Contacts contact_detail){
        contact.add(contact_detail);
        System.out.println(contact);

    }
}
