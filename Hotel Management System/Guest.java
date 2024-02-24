import java.util.ArrayList;
import java.util.Scanner;
public class Guest {

    Scanner scan = new Scanner(System.in);
   

    //dataMembers
    public String guestId,name,NIC;

    
    private ArrayList<Guest> guestList = new ArrayList<>();

    
    //functions
    public Guest addGuest()
    {
        System.out.print("\tEnter Guest ID : ");
        guestId = scan.nextLine();
        System.out.print("\tEnter Name     : ");
        name = scan.nextLine();
        System.out.print("\tEnter NIC      : ");
        NIC = scan.nextLine();

        Guest guest = new Guest();
        guest.guestId = guestId;
        guest.name=name;
        guest.NIC=NIC;
        guestList.add(guest);

        System.out.println("\nGuest added successfully!\n");
        return guest;
    }
    public Guest  exisistingGuest(){
        System.out.print("Enter Guest ID: ");
        String id = scan.nextLine();

        boolean found = false;
        for (Guest guest : guestList) 
        {
            if (guest.guestId.equals(id))
            {
                System.out.println("\n\nGuest found:");
                System.out.println("\tGuest ID : " + guest.guestId);
                System.out.println("\tName     : " + guest.name);
                System.out.println("\tNIC      : " + guest.NIC);
                found = true;
                return guest;
            }
            else
            {
                System.out.println("Error");
            }
            
        }
        
        return null;    
        
    }
    public void viewGuest()
    {
        System.out.println("\n\nList of Guests::\n");

        for(Guest gst : guestList)
        {           
            System.out.println("Guest ID: " + gst.guestId);
            System.out.println("Name    : " + gst.name);
            System.out.println("NIC     : " + gst.NIC);       
        }
    }
    
}
