

/**
 * Reservationform
 */
public class Reservationform {

    int id,rBasicAmount,rNOG,rQueNo ;
    String cusinfo, bHall, rStartDate,rEnddate,rDate;

    dashBoard _dashboard;
    public Reservationform(){};
    public Reservationform(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Reservation >> \n\n1 - ADD New Reservation \n2 - View All Reservations \n3 - Search \n4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addReservation();
                break;
            case "2":
                displayAll();
                break;
            case "3":
                searchAll();
                break;
            case "4":
                dashBoard.myDashBoard();
                break;

        }
    }

    public void addReservation() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Reservation Date : ");
        this.rDate = com.getInput();
        
        com.print_input("Enter The Start Date : ");
        this.rStartDate = com.getInput();

        com.print_input("Enter The End Date : ");
        this.rEnddate = com.getInput();

        com.print_input("Enter The Basic Amount : ");
        this.rBasicAmount = com.StrToInt(com.getInput());

        com.print_input("Enter The Number of Guests : ");
        this.rNOG = com.StrToInt(com.getInput());

        com.print_input("Enter The Queue Number : ");
        this.rQueNo = com.StrToInt(com.getInput());

        com.print_input("Enter The Customer : ");
        this.cusinfo = com.getInput();
        } 
        catch (StringIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage()); 
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage()); 
        }
        catch (NullPointerException ex) {
            System.out.println(ex.getMessage()); 
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage()); 
        }

        dB.MyReservationList.add(this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addReservation();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id + "Date : " + this.rDate + "Basic Amount : " + this.rBasicAmount + "Number of Guests : " + this.rNOG + "Queue Number : " + this.rQueNo + "Start Date : " + this.rStartDate + "End Date : " + this.rEnddate + "Customer : " + this.cusinfo );
    }

    public void displayAll() {
        for (Reservationform res : dB.MyReservationList) {
            res.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id + "Date : " + this.rDate + "Basic Amount : " + this.rBasicAmount + "Number of Guests : " + this.rNOG + "Queue Number : " + this.rQueNo + "Start Date : " + this.rStartDate + "End Date : " + this.rEnddate + "Customer : " + this.cusinfo);
    }

    public Reservationform searchAll() {
        Reservationform myRet = new Reservationform();
        for (Reservationform rf : dB.MyReservationList) {
            if (rf.id==id) {
                myRet =  rf;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}