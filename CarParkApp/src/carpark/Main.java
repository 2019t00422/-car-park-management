package carpark;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        //CarParkManager myCarPark = new CarParkManager();
        Vehicle vehicle = new Vehicle();

        Scanner input = new Scanner(System.in);
        int menu;
        String model;

        do {
            System.out.println("WELCOME TO PARKING MANAGEMENT");
            System.out.println("1: To Park Vehicle");
            System.out.println("2: To Departure");
            System.out.println("3: Show All Perked Vehicles");
            System.out.println("0: To Exit");

            System.out.print("Enter your choice: ");

            menu = input.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    String vType;

                    System.out.println("Please choose The Vehicle type");
                    System.out.println("C = Car");
                    System.out.println("B = Motorbike");
                    System.out.println("V = VAN");
                    vType = input.next();

                    if (vType.equals("C")) {
                        vehicle.setVType("Car");

                        System.out.println("Enter VNumber");
                        String VNumber = input.next();
                        vehicle.setVNumber(VNumber);

                        System.out.println(" Enter VName");
                        String VName = input.next();
                        vehicle.setVName(VName);

                    } else if (vType.equals("B")) {
                        vehicle.setVType("Motorbike");

                        System.out.println("Enter VNumber");
                        String VNumber = input.next();
                        vehicle.setVNumber(VNumber);

                        System.out.println(" Enter VName");
                        String VName = input.next();
                        vehicle.setVName(VName);

                    } else if (vType.equals("V")) {
                        vehicle.setVType("VAN");

                        System.out.println("Enter VNumber");
                        String VNumber = input.next();
                        vehicle.setVNumber(VNumber);

                        System.out.println(" Enter VName");
                        String VName = input.next();
                        vehicle.setVName(VName);

                    }

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    System.out.println("List of All Parked Vehicles : ");
                    //myCarPark.printParkedVehicleDetails();
                   System.out.println(vehicle.getVName());
                    System.out.println(vehicle.getVNumber());
                    System.out.println(vehicle.getVType());

                    break;
                }

                case 0: {
                    System.out.println("\nThank you!\n");
                    break;
                }
                default: {
                    System.out.println("Invalid option!\n");
                    break;
                }
            }
        } while (menu != 0);

    }
}