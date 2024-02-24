import java.util.ArrayList;
import java.util.Scanner;
public class Apartments {
    //dataMembers
    
    private String size,status;
    public String apartmentNo;
    private double price;

    ArrayList<Apartments> apartmentList = new ArrayList<>();

    //constractor
    public void ApartmentsMenu(){
        Scanner scan = new Scanner(System.in);
        Main.clear();
        System.out.println("\n\t1.Add Apartment");
        System.out.println("\t2.Back   ");

        int Option;
        while (true) {
            System.out.print("\nEnter Selection: ");
            Option = scan.nextInt();  
            if (Option == 1 || Option == 2 ) {
                break;
            } else {
                Main.clear();
                System.out.println("Invalid Selection");
                Main.sleep(3);
            } 
        }
        switch (Option) {
            case 1:
                Main.clear();
                addApt();
                break;
        
            case 2:
                Main.clear();
                Hotel hotel =new Hotel();
                hotel.HotelMenu();
                break;
        }
    }

    //functions
    private void addApt( )
    {
        Main.clear();
        Scanner scan = new Scanner(System.in);
        System.out.print("\tApartment No                : ");
         apartmentNo = scan.nextLine();
        System.out.print("\tApartment Size [S/M/L]      : ");
         size = scan.nextLine();
        System.out.print("\tApartment Status [AC/non-AC]: ");
         status = scan.nextLine();
        System.out.print("\tApartment Price             : ");
         price = scan.nextDouble();

        Apartments apartment = new Apartments();

        apartment.apartmentNo = apartmentNo;
        apartment.size=size;
        apartment.status=status;
        apartment.price=price;
        apartmentList.add(apartment);
        
        Main.clear();
        System.out.println("\n\nApartment Added Succesfully");
        Main.sleep(3);
        Main.clear();

    }

    public Apartments apartmentNo(){
        Apartments apt1 =new Apartments();
        Scanner scan = new Scanner(System.in);
        System.out.println("Available Apartments: \n\tA001\n\tA002\n\tA003");
        System.out.print("Enter Apartment No:");
        apt1.apartmentNo= scan.nextLine();

        return apt1;
    }
    
}
