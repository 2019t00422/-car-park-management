package carpark;
import java.util.Objects;
import java.util.Scanner;

public class Main  {

    public static <string> void main(String[] args) {
        Vehicle vehicleobj = new Vehicle();

        Scanner input = new Scanner(System.in);
        int menu;
        int studentslot = 10;
        int teacherslot = 10;

        while (true){
            System.out.println("WELCOME TO PARKING");
            System.out.println("==========================");
            System.out.println("1: Park Vehicle");
            System.out.println("2: Exit Vehicle");
            System.out.println("3: Show All Vehicles List");
            System.out.println("0: Exit System");
            System.out.print("Enter your choice: ");
            menu = input.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    String JobPosition;
                    System.out.print("Are you teacher or Student in UOC : ");
                    vehicleobj.setJobPosition(input.next());
                    if (Objects.equals(vehicleobj.getJobPosition(), "student")) {
                        studentslot = studentslot - 1;
                    }
                    if (Objects.equals(vehicleobj.getJobPosition(), "teacher")){
                        teacherslot = teacherslot - 1;
                    }

                    System.out.println("Enter Vehicle Number : ");
                    vehicleobj.setVNumber(input.next());

                    System.out.println("Enter yor Name : ");
                    vehicleobj.setVName(input.next());

                    String vType;
                    System.out.println("Vehicle type");
                    System.out.println("1 = Car");
                    System.out.println("2 = Motorbike");
                    System.out.println("3 = VAN");
                    vType = input.next();

                    switch (vType) {
                        case "1" -> {
                            vehicleobj.setVType("Car");
                            break;
                        }
                        case "2" -> {
                            vehicleobj.setVType("Motorbike");
                            break;
                        }
                        case "3" -> {
                            vehicleobj.setVType("VAN");
                            break;
                        }
                    }

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    System.out.println("List of All Parked Vehicles");
                    System.out.println("==============================");

                    System.out.println("Students packing slot available : "+ studentslot);
                    System.out.println("teachers packing slot available : "+ teacherslot);

                    System.out.println("Name : "+vehicleobj.getVName());
                    System.out.println("Vehicle Number : "+vehicleobj.getVNumber());
                    System.out.println("Vehicle Type : "+vehicleobj.getVType());
                    System.out.println("Students or teacher : " + vehicleobj.getJobPosition() + "\n");

                    break;
                }

                case 0: {
                    System.out.println("\nThank you!\n");
                    Star star = new Star();
                    star.star();
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid option!\n");
                    break;
                }
            }

        }





    }
}