import java.util.*;

public class AirportScheduler {

    static void airportMenu() {
        System.out.println("======== AIRPORT FLIGHT SCHEDULER =======");
        System.out.println();
        System.out.println("[1] - View Flight Board ");
        System.out.println("[2] - Book Flight  ");
        System.out.println("[3] - Search Flight ");
        System.out.println("[4] - Schedule Flight ");
        System.out.println("[5] - Update Flight Status");
        System.out.println("[6] - Exit The Menu ");
        System.out.println();
        System.out.println("=========================================");
        System.out.print("Please Select An Option From The Above : ");

    }

    static void viewFlightBoard() {
        System.out.println(
                "==============================================================================================");
        System.out.println(
                "                                         FLIGHT BOARD                                         ");
        System.out.println(
                "==============================================================================================");
        System.out.println();
        System.out
                .println("FLIGHT NO    FROM           TO          DEPARTURE TIME    ARRIVAL TIME    GATE       STATUS");
        System.out.println(
                "----------------------------------------------------------------------------------------------");
        System.out.println(
                "  AI101      DELHI        HYDERABAD      10:30 AM         01:00 PM          5       BOARDING");
        System.out
                .println("  6E205      MUMBAI       CHENNAI        11:15 AM         02:45 PM          8       ON TIME");
        System.out
                .println("  EK105      HYDERABAD    QATAR          12:30 AM         09:45 AM          9       DELAYED");
        System.out.println(
                "  UK308      BANGLORE     KERLA          01:45 PM         03:00 PM          4       CANCELLED");
        System.out.println(
                "==============================================================================================");

    }

    static void updateFlight() {
        System.out.println(
                "==============================================================================================");
        System.out.println(
                "                                         FLIGHT BOARD                                         ");
        System.out.println("                                  *** AVAILABLE FLIGHTS ***                         ");
        System.out.println(
                "==============================================================================================");
        System.out.println();
        System.out
                .println("FLIGHT NO    FROM           TO          DEPARTURE TIME    ARRIVAL TIME    GATE       STATUS");
        System.out.println(
                "----------------------------------------------------------------------------------------------");
        System.out.println(
                "  AI101      DELHI        HYDERABAD      10:30 AM         01:00 PM          5       BOARDING");
        System.out
                .println("  6E205      MUMBAI       CHENNAI        11:15 AM         02:45 PM          8       ON TIME");
        System.out
                .println("  EK105      HYDERABAD    QATAR          12:30 AM         09:45 AM          9       DELAYED");
        System.out.println(
                "==============================================================================================");
    }

    static void invalidDisplay() {
        System.out.println("-----------------------------------------");
        System.out.println("          *** InValid Option ***          ");
        System.out.println("           Please Select Again           ");
        System.out.println("-----------------------------------------");

    }

    static void flightnumbers() {
        System.out.println("------------------------------------");
        System.out.println("     Choose Your Flight Number     ");
        System.out.println("------------------------------------");
        System.out.println("[1] - AI-102 - [AIR INDIA]");
        System.out.println("[2] - 6E-541 - [INDIGO]");
        System.out.println("[3] - EK-527 - [EMIRATES]");
        System.out.println("[4] - SQ-518 - [SINGAPORE AIRLINES]");
        System.out.println("[5] - QR-501 - [QATAR AIRWAYS]");
        System.out.println("[6] - BA-256 - [BRITISH AIRWAYS]");
        System.out.println("[7] - EY-275 - [ETIHAD AIRWAYS]");
        System.out.println("====================================");
        System.out.println();
        System.out.print("Please Choose An Option From The Above : ");
    }

    static void selectClass() {
        System.out.println("===================================");
        System.out.println("           SELECT A CLASS          ");
        System.out.println("===================================");
        System.out.println("[1] - Economy");
        System.out.println("[2] - Premium Economy");
        System.out.println("[3] - Business");
        System.out.println("[4] - First Class");
        System.out.println();
        System.out.println("===================================");

    }

    static void flightStatus(int statusno) {
        String[] status = { "Scheduled", "On-Time", "Delayed", "Boarding" };

        int statusindex = statusno;
        System.out.println("Status         : " + status[statusindex]);
    }

    static void ticketHeading() {
        System.out.println("===============================================");
        System.out.println("                 FLIGHT TICKET                 ");
        System.out.println("===============================================");
    }

    static void displaySeats() {
        System.out.println("===================================");
        System.out.println("           SEATS AVAILABLE         ");
        System.out.println("===================================");
        System.out.println("         [A][B][C]     [D][E][F]");
        System.out.println();
        System.out.println("Row-1 : [1A][1B][1C]  [1D][1E][1F]");
        System.out.println("Row-2 : [2A][2B][2C]  [2D][2E][2F]");
        System.out.println("Row-3 : [3A][3B][3C]  [3D][3E][3F]");
        System.out.println("Row-4 : [4A][4B][4C]  [4D][4E][4F]");
        System.out.println("Row-5 : [5A][5B][5C]  [5D][5E][5F]");
        System.out.println();
        System.out.println("===================================");
        System.out.println("        A/F = Window   C/D = Aisle  ");
        System.out.println("===================================");
    }

    static void searchFlight(int terminalno, int gateno, int statusno) {
        System.out.println("From           : Hyderabad");
        System.out.println("To             : Azerbaijan");
        System.out.println("Date           : 24-09-2026");
        System.out.println("Departure Time : 10:30 AM");
        System.out.println("Arrival Time   : 12:45 PM");
        System.out.println("Terminal       : " + terminalno);
        System.out.println("Gate           : " + gateno);
        flightStatus(statusno);

    }

    static void displayTicket(String name, String origin, String destination, String date, String seatno,
            int classchoice, int terminalno, int gateno, int statusno) {

        System.out.println("Passenger Name : " + name);
        System.out.println("From           : " + origin);
        System.out.println("To             : " + destination);
        System.out.println("Date           : " + date);
        System.out.println("Departure Time : 10:30 AM");
        System.out.println("Arrival Time   : 11:00 PM");
        System.out.println();

        switch (classchoice) {
            case 1:
                System.out.println("Class          : Economy");
                break;

            case 2:
                System.out.println("Class          : Premium Economy");
                break;

            case 3:
                System.out.println("Class          : Business");
                break;

            case 4:
                System.out.println("Class          : First Class");
                break;
        }
        System.out.println("Seat           : " + seatno);
        System.out.println("Terminal       : " + terminalno);
        System.out.println("Gate           : " + gateno);
        flightStatus(statusno);
        System.out.println("-----------------------------------------------");
        System.out.println("           *** BOOKING CONFIRMED ***           ");
        System.out.println("===============================================");
    }

    static void scheduleflight(int flightnumberchoice2, String origin, String destination, String date,
            String departuretime, String arrivaltime, int terminalno, int gateno) {

        String[] flightnames2 = { "AI-102 - [AIR INDIA]", "6E-541 - [INDIGO]", "EK-527 - [EMIRATES]",
                "SQ-518 - [SINGAPORE AIRLINES]", "QR-501 - [QATAR AIRWAYS]", "BA-256 - [BRITISH AIRWAYS]",
                "EY-275 - [ETIHAD AIRWAYS]" };

        System.out.println("===============================================");
        System.out.println("                 FLIGHT DETAILS                 ");
        System.out.println("===============================================");

        System.out.println("Flight Number  : " + flightnames2[flightnumberchoice2 - 1]);
        System.out.println("From           : " + origin);
        System.out.println("To             : " + destination);
        System.out.println("Date           : " + date);
        System.out.println("Departure Time : " + departuretime);
        System.out.println("Arrival Time   : " + arrivaltime);
        System.out.println("Terminal       : " + terminalno);
        System.out.println("Gate           : " + gateno);
        System.out.println("Status         : Scheduled");
        System.out.println("-----------------------------------------------");
        System.out.println("      *** FLIGHT SCHEDULED SUCCESSFULLY ***     ");
        System.out.println("===============================================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int terminalno = random.nextInt(1, 11);
        int gateno = random.nextInt(1, 26);
        int statusno = random.nextInt(1, 3);
        String origin;
        String destination;
        String date;

        System.out.println("===================================");
        System.out.println("      WELCOME TO ALOHA AIRPORT    ");
        System.out.println("===================================");
        System.out.println();

        System.out.println("*** Enter Passenger Name ***");
        String name = sc.nextLine();
        System.out.println();

        airportMenu();

        int option = sc.nextInt();
        System.out.println();

        switch (option) {

            case 1:

                viewFlightBoard();

                break;

            case 2:

                System.out.println("====================================");
                System.out.println("           BOOK A FLIGHT            ");
                System.out.println("====================================");
                flightnumbers();

                int flightnumberchoice = sc.nextInt();
                System.out.println();

                if (flightnumberchoice > 7) {
                    invalidDisplay();
                    sc.close();
                    return;

                }

                System.out.println("*** Enter Origin ***");
                origin = sc.next();

                System.out.println("*** Enter Destination ***");
                destination = sc.next();

                System.out.println("*** Enter Date ***");
                date = sc.next();

                selectClass();
                System.out.println("*** Choose A Class ***");
                int classchoice = sc.nextInt();

                if (classchoice > 4) {
                    invalidDisplay();
                    sc.close();
                    return;
                }

                displaySeats();
                System.out.println("*** Choose A Seat ***");
                String seatno = sc.next();

                switch (flightnumberchoice) {
                    case 1:

                        ticketHeading();
                        System.out.println("Flight Name    : AI-102 - [AIR INDIA]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;

                    case 2:

                        ticketHeading();
                        System.out.println("Flight Name    : 6E-541 - [INDIGO]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;

                    case 3:

                        ticketHeading();
                        System.out.println("Flight Name    : EK-527 - [EMIRATES]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;

                    case 4:

                        ticketHeading();
                        System.out.println("Flight Name    : SQ-518 - [SINGAPORE AIRLINES]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;

                    case 5:

                        ticketHeading();
                        System.out.println("Flight Name    : QR-501 - [QATAR AIRWAYS]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;

                    case 6:

                        ticketHeading();
                        System.out.println("Flight Name    : BA-256 - [BRITISH AIRWAYS]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;

                    case 7:

                        ticketHeading();
                        System.out.println("Flight Name    : EY-275 - [ETIHAD AIRWAYS]");
                        displayTicket(name, origin, destination, date, seatno, classchoice, terminalno, gateno,
                                statusno);

                        break;
                }
                break;

            case 3:

                String[] flightnames = { "AI-102", "6E-541", "EK-527", "SQ-518", "QR-501", "BA-256", "EY-275" };

                System.out.println("*** Enter The Flight Number ***");
                String flightno = sc.next();
                boolean isFound = false;

                for (int i = 0; i < flightnames.length; i++) {

                    if (flightnames[i].equals(flightno)) {
                        System.out.println("==================================================");
                        System.out.println("               *** Flight Found ***               ");
                        System.out.println("==================================================");
                        isFound = true;

                        switch (i) {
                            case 0:
                                System.out.println("Flight Name    : AI-102 - [AIR INDIA]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Premium Economy, Business");
                                System.out.println("==================================================");
                                break;

                            case 1:
                                System.out.println("Flight Name    : 6E-541 - [INDIGO]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Premium Economy, Business");
                                System.out.println("==================================================");
                                break;

                            case 2:
                                System.out.println("Flight Name    : EK-527 - [EMIRATES]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Premium Economy, Business, First");
                                System.out.println("==================================================");
                                break;

                            case 3:
                                System.out.println("Flight Name    : SQ-518 - [SINGAPORE AIRLINES]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Premium Economy, Business, First");
                                System.out.println("==================================================");
                                break;

                            case 4:
                                System.out.println("Flight Name    : QR-501 - [QATAR AIRWAYS]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Premium Economy, Business, First");
                                System.out.println("==================================================");
                                break;

                            case 5:
                                System.out.println("Flight Name    : BA-256 - [BRITISH AIRWAYS]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Economy, Premium Economy");
                                System.out.println("==================================================");
                                break;

                            case 6:
                                System.out.println("Flight Name    : EY-275 - [ETIHAD AIRWAYS]");
                                searchFlight(terminalno, gateno, statusno);
                                System.out.println("Classes        : Premium Economy, Business, First");
                                System.out.println("==================================================");
                                break;

                        }
                        break;
                    }
                }

                if (!isFound) {
                    System.out.println("================================");
                    System.out.println("    *** Flight Not Found ***    ");
                    System.out.println("================================");
                }
                break;

            case 4:

                System.out.println("====================================");
                System.out.println("          SCHEDULE A FLIGHT         ");
                System.out.println("====================================");
                flightnumbers();

                int flightnumberchoice2 = sc.nextInt();
                System.out.println();

                if (flightnumberchoice2 > 7) {
                    invalidDisplay();
                    sc.close();
                    return;

                }

                System.out.println("*** Enter Origin ***");
                origin = sc.next();

                System.out.println("*** Enter Destination ***");
                destination = sc.next();

                System.out.println("*** Enter Date ***");
                date = sc.next();
                sc.nextLine();

                System.out.println("*** Enter Departure Time ***");
                String departuretime = sc.nextLine();

                System.out.println("*** Enter Arrival Time ***");
                String arrivaltime = sc.nextLine();
                System.out.println();

                scheduleflight(flightnumberchoice2, origin, destination, date, departuretime, arrivaltime, terminalno,
                        gateno);

                break;

            case 5:

                updateFlight();
                System.out.println();

                String[][] flights = { { "AI-101", "DELHI", "HYDERABAD", "10:30 AM", "01:00 PM", "5", "BOARDING" },
                        { "6E-205", "MUMBAI", "CHENNAI", "11:15 AM", "02:45 PM", "8", "ON TIME" },
                        { "EK-105", "HYDERABAD", "QATAR", "12:30 AM", "09:45 AM", "9", "DELAYED" }
                };

                System.out.println("*** Enter The Row Number To Be Updated For ***");
                int row = sc.nextInt();

                System.out.println("*** Enter The Column Number To Be Updated For ***");
                int column = sc.nextInt();
                sc.nextLine();

                System.out.println("*** What Would You Like To Update Instead *** ");

                flights[row - 1][column - 1] = sc.nextLine();

                System.out.println();

                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        System.out.println(
                                "==============================================================================================");
                        System.out.println(
                                "                                         FLIGHT BOARD                                         ");
                        System.out.println(
                                "==============================================================================================");
                        System.out.println();
                        System.out
                                .println(
                                        "FLIGHT NO    FROM           TO          DEPARTURE TIME    ARRIVAL TIME    GATE       STATUS");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------");

                    }
                    for (int j = 0; j < 7; j++) {

                        System.out.print(flights[i][j] + "       ");

                    }
                    System.out.println();
                    if (i == 2) {

                        System.out.println(
                                "----------------------------------------------------------------------------------------------");
                        System.out.println(
                                "                            *** FLIGHT DETAILS UPDATED SUCCESSFULLY ***                           ");

                        System.out.println(
                                "==============================================================================================");
                    }

                }

            case 6:
                System.out.println("*** You Have Exited Succesfully ***");
                sc.close();
                return;

            default:

                invalidDisplay();

        }

        sc.close();
    }
}
