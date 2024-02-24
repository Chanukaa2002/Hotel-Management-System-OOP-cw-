import java.util.ArrayList;
import java.util.Scanner;
public class Hotel {
    
       
    // composition relationship
    private Apartments apt;
    private Employee emp;

    

    //dataMembers
    private String HotelID,Name,Telephone,Location;

    //constractor
    ArrayList<Hotel> hotelList = new ArrayList<>();
    public Hotel()
    {
        this.apt = new Apartments();
        this.emp = new Employee();

    }

    //functions
    public  void HotelMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\t1.Employee ");
        System.out.println("\t2.Apartments ");
        System.out.println("\t3.Reservation\n");
        System.out.println("\t4.Back");
        int Option;
        while (true) {
            System.out.print("\nEnter Selection: ");
            Option = scan.nextInt();  
            if (Option == 1 || Option == 2 || Option == 3 || Option==4) {
                break;
            } else {
                System.out.println("Invalid Selection");
                Main.sleep(2);
                Main.clear();
            } 
        }
        switch (Option) {
            case 1:
                Main.clear();
                
                emp.EmployeeMenu();
                break;
            case 2:
                Main.clear();
                
                apt.ApartmentsMenu();
                break;
            case 3:
                Main.clear();
                Reservation res = new Reservation();
                break;
            case 4:
                Main.clear();
                Main.MainMenu();
                break;
            default:
                Main.clear();
                HotelMenu();
                break;
        }
    }
    public void addHotel(){

        Hotel hotel = new Hotel();

        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHotel ID        : ");
        String HotelID = scan.nextLine();
        System.out.print("\nHotel Name      : ");
        String Name = scan.nextLine();
        System.out.print("\nHotel Telephone : ");
        String Telephone = scan.nextLine();
        System.out.print("\nHotel Location  : ");
        String Location = scan.nextLine();
        Main.sleep(2);
        Main.clear();

        hotel.HotelID = HotelID;
        hotel.Name = Name;
        hotel.Telephone = Telephone;
        hotel.Location = Location;
        hotelList.add(hotel);

        System.out.println("\n\tHotel added successfully!\n");
        Main.sleep(2);
        Main.clear();
    }

    
    public void existingHotel(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hotel ID: ");
        String id = scan.nextLine();
        Main.sleep(2);
        Main.clear();

        boolean found = false;
        for (Hotel hotel : hotelList) 
        {   
            if (hotel.HotelID.equals(id))
            {
                System.out.println("\n\tHotel ID found\n");
                System.out.print("Hotel ID : " + hotel.HotelID);
                System.out.println("\tHotel Name : " + hotel.Name);

                Main.Hotel_ID=hotel.HotelID;

                found = true;
                Main.sleep(2);
               // Main.clear();
                break;
            }
            else
            {
                System.out.println("Hotel ID not found");
                existingHotel();
                

            }
        }
              
    }
    
    public void viewHotel()
    {
        Main.sleep(4);
        Main.clear();
        System.out.println("\t::List of Hotels::");

        for(Hotel hotel : hotelList)
        {   
            System.out.println("-----------------------------------------\n\n");        
            System.out.println("Hotel ID: " + hotel.HotelID);
            System.out.println("Hotel Name: " + hotel.Name);
            System.out.println("Hotel Telephone: " + hotel.Telephone);
            System.out.println("Hotel Location: " + hotel.Location);
            System.out.println("-----------------------------------------\n\n");
            
        }
    }
}
