import java.util.Scanner;
import java.util.Date; 
public class Reservation {
    //dataMembers
    String GuestID,Name,NIC; 
    int days,Price,TotBill;

    Scanner scan = new Scanner(System.in);
    //composition relationship
    public Guest guest;
    //Aggragation relationship
    public Apartments apt;

    

    //functions
    Guest guestInfo = new Guest();
    public Reservation()
    {
        this.guest = new Guest();
        
        System.out.println("\t1.New Guest: ");
        System.out.println("\t2.Existing Guest: ");
        System.out.println("\t3.View Guest:");
        System.out.print("\nEnter Selection: ");
        int selection = scan.nextInt();

        
        switch(selection)
        {
            case 1:
                guestInfo = guest.addGuest();
                Bill();
                Main.sleep(10);
                break;
            case 2:
                boolean found = true;
                while (found == true) {
                    guestInfo = guest.exisistingGuest();
                    if (guestInfo != null) {
                        found = false;
                        Bill();
                        Main.sleep(4);
                        break;

                    } else {
                        System.out.println("Guest not found.");
                        Main.sleep(4);
                        Main.clear();
                    }
                }
            case 3:
                guest.viewGuest();
                Main.sleep(5);
                Main.clear();                
        }       
    }


    private void Bill()
    {
        CalculateBill();
        Main.clear();
        System.out.println("\t----------------------------------------------------------- ");
        System.out.println("\t                            Bill                            ");
        System.out.println("\t----------------------------------------------------------- ");
        System.out.println("\tHotel ID              : " + Main.Hotel_ID);
        System.out.println("\tGuest ID              : " + guestInfo.guestId);
        System.out.println("\tApartment NO          : " + apt.apartmentNo);
        System.out.println("\tName                  : " + guestInfo.name);
        System.out.println("\tNIC                   : " + guestInfo.NIC);
        System.out.println("\tDate                  : " + new Date());
        System.out.println("\tTotal Bill Amount     : " + TotBill);
        System.out.println("\t----------------------------------------------------------- ");

    }
    private void CalculateBill()
    {
        System.out.print("Number of Days Stayed : ");
        days = scan.nextInt();
        System.out.print("Price per Day : ");
        Price = scan.nextInt();
        
        this .apt = new Apartments();
        this.apt = apt.apartmentNo();
        
        TotBill=days * Price;
    }
}
