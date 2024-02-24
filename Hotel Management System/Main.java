import java.util.Scanner;
public class Main {
    public static String Hotel_ID;
    

    public static void main(String[] args) {
     clear();   
        
        MainMenu();
        main(args);
                
    }

    public  static void MainMenu() {
        
        clear();
        Hotel hotel = new Hotel();

        while (true) {
            clear();
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n\n\nMain Menu");
            System.out.println("\t1. Add Hotel");
            System.out.println("\t2. Exixting Hotel");
            System.out.println("\t3. View Hotel");

            System.out.print("\nEnter Selection ==> ");
            int Option = scan.nextInt();
            if (Option == 1 || Option == 2 || Option == 3) {
                
                switch (Option) {
                    case 1:
                        hotel.addHotel();
                        break;
                    case 2:
                        hotel.existingHotel();
                        hotel.HotelMenu();
                        break;
                    case 3:
                        hotel.viewHotel();
                        sleep(4);
                        break;
                
                }     
            }else{
                System.out.println("Invalid Selection");
                sleep(3);
                clear();
            }
            
        }
       
    }

    /*public static void HotelMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\t1.Employee ");
        System.out.println("\t2.Apartments ");
        System.out.println("\t3.Reservation\n");
        System.out.println("\t4.Back");
        int Option;
        while (true) {
            System.out.print("\nEnter Selection: ");
            Option = scan.nextInt();  
            if (Option == 1 || Option == 2 || Option == 3) {
                break;
            } else {
                System.out.println("Invalid Selection");
                sleep(2);
                clear();
            } 
        }
        switch (Option) {
            case 1:
                clear();
                Employee emp = new Employee();
                emp.EmployeeMenu();
                break;
            case 2:
                clear();
                Apartments apt = new Apartments();
                apt.ApartmentsMenu();
                break;
            case 3:
                clear();
                Reservation res = new Reservation();
                break;
            case 4:
                clear();
                MainMenu();
                break;
            default:
                clear();
                HotelMenu();
                break;
        }
    }*/
    


    public static void clear()
    {
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E)
		{
			System.out.println(E);
		}
    }

    public static void sleep(int value) 
    {
        try {
            Thread.sleep(value*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}