/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airlinereservationsystem;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.util.Scanner;
/**
 *
 * @author Soft Laptop
 */
public class AirlineReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Airports []arrAirports  = new Airports[1000] ;
        FlightDescription []arrFlightDescription = new FlightDescription[1000];
        ScheduledFlight []arrScheduledFlight = new ScheduledFlight[1000];
        Passenger []arrPassenger = new Passenger[1000];
        Reservations []arrReservations = new Reservations[1000];
        String name , City , Country ;
        LocalDateTime now = LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        Scanner str_input = new Scanner(System.in);
        int indexAirports = 3 ,indexFlightDescription = 4 , indexScheduledFlight = 3 ;
        boolean condition = true , flag  =true;
        int indexPassenger = 4 , indexReservations = 4 , choice , i , flightChoice , id , capacityChoice;
        int flightdescNo = 4 , flightscheNo = 3;
       /*
        arrAirports[0].setAirportName("Cairo Airport"); arrAirports[0].setCountry("Egypt"); arrAirports[0].setCity("Cairo");
        arrFlightDescription[0].setAirportName("Cairo Airport"); arrFlightDescription[0].setCapacity(4000);arrFlightDescription[0].setCity("Cairo");
        arrFlightDescription[0].setCountry("egypt");  arrFlightDescription[0].setFlightArrival(now.plusYears(1).plusMonths(1).plusHours(1).plusMinutes(10).plusSeconds(15));
        arrFlightDescription[0].setFlightDeparture(now.plusYears(1).plusMonths(1).plusHours(3).plusMinutes(40).plusSeconds(50));
        */
        arrAirports[0] = new Airports("Cairo Airport","Cairo","Egypt");
        arrAirports[1] = new Airports("Borg El-Arab Airport","Alexandria","Egypt");
        arrAirports[2] = new Airports("Dubai Airport","Dubai","UAE");
        arrAirports[2] = new Airports("Cascblanca Airport","Casablanca","Morroco");
        arrFlightDescription[0] = new FlightDescription("Cairo Airport", "Cairo", "Egypt", "Egypt", "UAE", now.plusYears(1).plusMonths(1).plusHours(1).plusMinutes(10).plusSeconds(15) ,now.plusYears(1).plusMonths(1).plusHours(3).plusMinutes(40).plusSeconds(50), 4000,0);
        arrFlightDescription[1] = new FlightDescription("Dubai Airport","Dubai","UAE","UAE","Egypt",now.plusYears(1).plusMonths(1) .plusDays(2).plusHours(1).plusMinutes(10).plusSeconds(15),now.plusYears(1).plusMonths(1) .plusDays(2).plusHours(3).plusMinutes(40).plusSeconds(50),4000,1);
        arrFlightDescription[2] = new FlightDescription("Cairo Airport", "Cairo", "Egypt", "Egypt", "Morroco", now.plusYears(1).plusMonths(2).plusHours(4).plusMinutes(30).plusSeconds(15) ,now.plusYears(1).plusMonths(2).plusHours(6).plusMinutes(50).plusSeconds(50), 1500,2);
        arrFlightDescription[3] = new FlightDescription("Dubai Airport","Dubai","UAE","UAE","Morroco",now.plusYears(1).plusMonths(4) .plusDays(12).plusHours(11).plusMinutes(10).plusSeconds(15),now.plusYears(1).plusMonths(4) .plusDays(12).plusHours(16).plusMinutes(40).plusSeconds(50),1000,3);
        arrScheduledFlight[0] = new ScheduledFlight("Cairo Airport", "Cairo", "Egypt", "Egypt", "UAE", now.plusYears(1).plusMonths(1).plusHours(1).plusMinutes(10).plusSeconds(15) ,now.plusYears(1).plusMonths(1).plusHours(3).plusMinutes(40).plusSeconds(50), 4000,now.plusYears(1).plusMonths(1).minusHours(1).plusMinutes(10).plusSeconds(15),0);
        arrScheduledFlight[1] = new ScheduledFlight("Dubai Airport","Dubai","UAE","UAE","Egypt",now.plusYears(1).plusMonths(1) .plusDays(2).plusHours(1).plusMinutes(10).plusSeconds(15),now.plusYears(1).plusMonths(1) .plusDays(2).plusHours(3).plusMinutes(40).plusSeconds(50),4000,now.plusYears(1).plusMonths(1) .plusDays(2).minusHours(2).plusMinutes(10).plusSeconds(15),1);
        arrScheduledFlight[2] = new ScheduledFlight("Cairo Airport", "Cairo", "Egypt", "Egypt", "Morroco", now.plusYears(1).plusMonths(2).plusHours(4).plusMinutes(30).plusSeconds(15) ,now.plusYears(1).plusMonths(2).plusHours(6).plusMinutes(50).plusSeconds(50), 1500,now.plusYears(1).plusMonths(2).plusHours(2).plusMinutes(30).plusSeconds(15),2);
        arrPassenger[0] = new Passenger("Giza", "Egypt", "Mohamed Ali",0);
        arrPassenger[1] = new Passenger("Cairo", "Egypt", "Mohamed Ahmed",0);
        arrPassenger[2] = new Passenger("Dubai", "UAE", "yousef Ashraf",1);
        arrPassenger[3] = new Passenger("Menofia", "Egypt", "Taha Ahmed",2);
        arrReservations[0] = new Reservations("Cairo Airport", "Cairo", "Egypt", "Egypt", "UAE", now.plusYears(1).plusMonths(1).plusHours(1).plusMinutes(10).plusSeconds(15) ,now.plusYears(1).plusMonths(1).plusHours(3).plusMinutes(40).plusSeconds(50), 4000,now.plusYears(1).plusMonths(1).minusHours(1).plusMinutes(10).plusSeconds(15),now,0);
        arrReservations[1] = new Reservations("Cairo Airport", "Cairo", "Egypt", "Egypt", "UAE", now.plusYears(1).plusMonths(1).plusHours(1).plusMinutes(10).plusSeconds(15) ,now.plusYears(1).plusMonths(1).plusHours(3).plusMinutes(40).plusSeconds(50), 4000,now.plusYears(1).plusMonths(1).minusHours(1).plusMinutes(10).plusSeconds(15),now.plusDays(2).plusHours(3),0);
        arrReservations[2] = new Reservations("Dubai Airport","Dubai","UAE","UAE","Egypt",now.plusYears(1).plusMonths(1) .plusDays(2).plusHours(1).plusMinutes(10).plusSeconds(15),now.plusYears(1).plusMonths(1) .plusDays(2).plusHours(3).plusMinutes(40).plusSeconds(50),4000,now.plusYears(1).plusMonths(1) .plusDays(2).minusHours(2).plusMinutes(10).plusSeconds(15),now.minusWeeks(1),1);
        arrReservations[3] = new Reservations("Cairo Airport", "Cairo", "Egypt", "Egypt", "Morroco", now.plusYears(1).plusMonths(2).plusHours(4).plusMinutes(30).plusSeconds(15) ,now.plusYears(1).plusMonths(2).plusHours(6).plusMinutes(50).plusSeconds(50), 1500,now.plusYears(1).plusMonths(2).plusHours(2).plusMinutes(30).plusSeconds(15),now,2);
        
        
        System.out.println(" =====================================");
        System.out.println(" Welcome to Airline Reservation System");
        System.out.println(" =====================================\n");
        
        while(condition)
        {
            
            System.out.println(" Choose number of the following :");
            System.out.println(" 1- Display all Flights\n 2- Display Active Flights");
            System.out.println(" 3- Reservation a Flight\n 4- Enquery about Passenger");
            System.out.println(" 5- Add new Flight\n 6- Add Active Flight");
            System.out.println(" 7- Display all Airports\n 8- Add new Airport");
            System.out.println(" 9- Exit");
            System.out.print(" choice : ");
            choice = input.nextInt();
            System.out.println("\n\n");
            switch(choice)
            {
                case 1:
                    System.out.println(" All Flights");
                    for ( i = 0 ; i  < indexFlightDescription ; i++)
                    {
                        System.out.println(" -----");
                        System.out.println(" Flight " + (i+1) + ": ");
                        System.out.println(arrFlightDescription[i].toString());
                        
                    }
                    break;
                case 2:
                    
                    System.out.println(" All active Flights");
                    for ( i = 0 ; i  < indexScheduledFlight ; i++)
                    {
                        System.out.println(" -----");
                        System.out.println(" Flight " + (i+1) + ": ");
                        System.out.println(arrScheduledFlight[i].toString());   
                    }
                    break;
                case 3:
                    System.out.println(" The available Flight are :");
                    for ( i = 0 ; i  < indexScheduledFlight ; i++)
                    {
                        System.out.println(" -----");
                        System.out.println(" Flight " + (i+1) + ": ");
                        System.out.println(arrScheduledFlight[i].toString());   
                    }
                    System.out.print(" chooce flight number : ");
                    flightChoice = input.nextInt();
                    flightChoice--;
                    if( flightChoice < indexScheduledFlight)
                    {  
                        System.out.print(" Please enter your name: ");
                        name = str_input.nextLine();
                        System.out.print(" Please enter your country: ");
                        Country = str_input.nextLine();
                        System.out.println(" Please enter your city: ");
                        City = str_input.nextLine();
                        arrPassenger[indexPassenger] = new Passenger(City,Country,name,flightChoice);
                        System.out.println(" Your ID is : "+arrPassenger[indexPassenger].ID);
                        for( i  = 0 ; i < indexScheduledFlight ; i++)
                        {
                            if(flightChoice == i)
                            {
                                arrReservations[indexReservations] = new Reservations(arrScheduledFlight[i].getAirportName(),arrScheduledFlight[i].getCity(),arrScheduledFlight[i].getCountry(),arrScheduledFlight[i].getFlightFrom(),arrScheduledFlight[i].getFlightTo(),arrScheduledFlight[i].getFlightDeparture(),arrScheduledFlight[i].getFlightArrival(),arrScheduledFlight[i].getCapacity(),arrScheduledFlight[i].getDate(),now,flightChoice);   
                            }
                        }
                        indexPassenger++;
                        indexReservations++;
                        System.out.println(" Successful reservation :)"); 
                    }
                    else
                    {
                        System.out.println(" Wrong flight number ! , Try again");
                    }
                    break;
                case 4:
                    System.out.print(" Enter ID of Passenger: ");
                    id = input.nextInt();
                    if ( id <= arrPassenger[indexPassenger-1].ID && id >= arrPassenger[0].ID)
                    {
                        for( i  = 0 ; i < indexPassenger ; i++)
                        {
                            if ( id == arrPassenger[i].ID)
                            {
                                System.out.println(" Passenger data: ");
                                System.out.println(arrPassenger[i].toString());
                                System.out.println(" Passenger flight");
                                System.out.println(arrScheduledFlight[arrPassenger[i].getFlightNo()].toString());
                            }
                        }
                    }
                    else 
                        System.out.println(" There is no passenger with ID= " +id+ "! , Try again");
                    
                    break;
                case 5:
                    System.out.println(" Adding new Flight ...");
                    arrFlightDescription[indexFlightDescription]= new FlightDescription(flightdescNo);
                    System.out.print(" Enter flight capacity: ");
                    capacityChoice = input.nextInt();
                    System.out.print(" Enter Airport name: ");
                    name = str_input.nextLine();
                    arrFlightDescription[indexFlightDescription].setAirportName(name);
                    System.out.print(" Enter Airport city: ");
                    name = str_input.nextLine();
                    arrFlightDescription[indexFlightDescription].setCity(name);
                    System.out.print(" Enter Airport country: ");
                    name = str_input.nextLine();
                    arrFlightDescription[indexFlightDescription].setCountry(name);
                    System.out.print(" Enter flight from: ");
                    name = str_input.nextLine();
                    arrFlightDescription[indexFlightDescription].setFlightFrom(name);
                    System.out.print(" Enter Flight to: ");
                    name = str_input.nextLine();
                    arrFlightDescription[indexFlightDescription].setFlightTo(name);
                    System.out.println(" Flight date will be choosen now");
                    arrFlightDescription[indexFlightDescription].setFlightArrival(now.plusYears(0).plusMonths(2) .plusDays(15).plusHours(3).plusMinutes(40).plusSeconds(15));
                   
                    arrFlightDescription[indexFlightDescription].setFlightDeparture(now.plusYears(0).plusMonths(2) .plusDays(15).plusHours(5).plusMinutes(40).plusSeconds(15));
                    System.out.println(" Flight arrival is : "+ arrFlightDescription[indexFlightDescription].getFlightArrival() );
                    System.out.println(" Flight departure is : "+ arrFlightDescription[indexFlightDescription].getFlightDeparture());
                    arrFlightDescription[indexFlightDescription].setCapacity(capacityChoice);
                    flightdescNo++;
                    indexFlightDescription++;
                    System.out.println(" Successful adding new flight");
                    
                    break;
                case 6:
                    System.out.println(" all flights ");
                    for ( i = 0 ; i  < indexFlightDescription ; i++)
                    {
                        System.out.println(" -----");
                        System.out.println(" Flight " + (i+1) + ": ");
                        System.out.println(arrFlightDescription[i].toString());
                        
                    }
                    System.out.println("\n all active (scheduled) flights ");
                    for ( i = 0 ; i  < indexScheduledFlight ; i++)
                    {
                        System.out.println(" -----");
                        System.out.println(" Flight " + (i+1) + ": ");
                        System.out.println(arrScheduledFlight[i].toString());   
                    }
                    System.out.print("\n Enter flight number to be active: ");
                    flightChoice = input.nextInt();
                    flightChoice--;
                    for ( i = 0 ; i < indexScheduledFlight ; i++)
                    {
                        if( flightChoice == arrScheduledFlight[i].getFlightNo())
                        {
                             System.out.println(" The flight number you have entered is already active !");
                             flag = false;
                             break;
                        }       
                    }
                    if( flightChoice > flightdescNo-1)
                    {
                        System.out.println(" Add this flight first then add it`s flight number then activate  it ");
                        flag=false;
                    }
                    if(flag == true)
                    {
                        arrScheduledFlight[indexScheduledFlight]= new ScheduledFlight(arrFlightDescription[flightChoice].getAirportName(),arrFlightDescription[flightChoice].getCity(),arrFlightDescription[flightChoice].getCountry(),arrFlightDescription[flightChoice].getFlightFrom(),arrFlightDescription[flightChoice].getFlightTo(),arrFlightDescription[flightChoice].getFlightDeparture(),arrFlightDescription[flightChoice].getFlightArrival(),arrFlightDescription[flightChoice].getCapacity(),now,flightChoice);
                        indexScheduledFlight++;
                        System.out.println(" The flight is activated successfully");
                    }
                    
                    
                    break;
                case 7:
                    for ( i = 0 ; i  < indexAirports ; i++)
                    {
                        System.out.println(" -----");
                        System.out.println(" Airport " + (i+1) + ": ");
                        System.out.println(arrAirports[i].toString());   
                    }
                    break;
                case 8:
                    System.out.print(" Enter Airport name: ");
                    name = str_input.nextLine();
                    System.out.print(" Enter Airport city: ");
                    City = str_input.nextLine();
                    System.out.print(" Enter Airport country: ");
                    Country = str_input.nextLine();
                    arrAirports[indexAirports] = new Airports(name, City, Country);
                    indexAirports++;
                    System.out.println(" Successfully adding new airport :)");
                    break;
                case 9:
                    System.out.println(" GoodBye , See you soon :)");
                    condition = false;
                    break;
                default:
                    System.out.println(" Wrong choice number ! , try again");
                    break; 
            }
            System.out.println("\n ===================================================="); 
        }
        
    }
    
}
