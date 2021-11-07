

/**
 * dashBoard
 */
public class dashBoard {

    static String getChoice = null;
    public static customer C = new customer();
    public static reservationQueue rq = new reservationQueue();

    public dashBoard() {
        myDashBoard();
    }

    public static void myDashBoard() {
        com.print("XYZ HOTEL - RS\n-----------------");
        com.print("1 - Benquet hall ");
        com.print("2 - Customer ");
        com.print("3 - Reservation ");
        com.print("4 - Booking ");
        com.print("5 - Payment ");
        com.print("6 - Branches ");
        com.print("7 - Employee ");
        com.print("8 - Features ");
        com.print("9 - Reservation Packages ");
        com.print("10 - Logout ");

        com.print_input("What is your choice ? ");
        getChoice = com.getInput();

        switch (getChoice) {
            case "1":
                banquetHallFun();
                break;

            case "2":
                C.menu();
                break;

            case "3":
                rq.menu();
                break;

            case "4":
                bookingFun();
                break;

            case "5":
                paymentFun();
                break;

            case "6":
                branchesFun();
                break;

            case "7":
                employeeFun();
                break;

            case "8":
                featuresFun();
                break;

            case "9":
                reservationPackagesFun();
                break;

            case "10":
                com.print("bye..!");
                break;

        }

    }

    public static void banquetHallFun() {
        com.print_input(
                "\n\n XYZ HOTEL - RS >>  Banquet Hall >> \n\n1 - Benquet Hall \n2 - Exit \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.menu();
                break;
        }
    }



    public static void reservationFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Reservation >> \n\n1 - Reserve Hall \n2- View Reserved Hall \n = ");
        String ch = com.getInput();
        reservationQueue rq = new reservationQueue();
        switch (ch) {
            case "1":
                rq.menu();
                break;
            case "2":
                rq.menu();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }

    public static void bookingFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Booking >> \n\n1 - Book Hall \n2- View Booked Hall \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.push();
                break;
            case "2":
                bh.displayList();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }

    public static void paymentFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Payment >> \n\n1 - Add Payment \n2- View All Payments \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.push();
                break;
            case "2":
                bh.displayList();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }

    public static void branchesFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Branches >> \n\n1 - Add Branche \n2- View All Branches \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.push();
                break;
            case "2":
                bh.displayList();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }

    public static void employeeFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Employee >> \n\n1 - Add Employee \n2- View All Employees \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.push();
                break;
            case "2":
                bh.displayList();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }

    public static void featuresFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Features >> \n\n1 - Add Feature \n2- View All Features \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.push();
                break;
            case "2":
                bh.displayList();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }

    public static void reservationPackagesFun() {
        com.print_input("\n\n XYZ HOTEL - RS >>  ReservationPackages >> \n\n1 - Add Reservation Packages \n2- View All Reservation Packages \n = ");
        String ch = com.getInput();
        bHall bh = new bHall();
        switch (ch) {
            case "1":
                bh.push();
                break;
            case "2":
                bh.displayList();
                break;
            case "3":
                myDashBoard();
                break;
        }
    }
}