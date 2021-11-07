
/**
 * Booking
 */
public class Booking {

    int id, rID;
    String date;

    dashBoard _dashboard;
    public Booking(){};
    public Booking(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Booking >> \n\n1 - ADD New Booking \n2 - View All Booking\n3 - Search n\4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addBooking();
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

    public void addBooking() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Reserve ID : ");
        this.rID = com.StrToInt(com.getInput());

        com.print_input("Enter The Date : ");
        this.date = com.getInput();

        } catch (StringIndexOutOfBoundsException ex) {
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
        dB.MyBookingList.add(this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addBooking();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id + ", Reserve ID : " + this.rID + ", Date : " + this.date );
    }

    public void displayAll() {
        for (Booking bk : dB.MyBookingList) {
            bk.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id + ", Reserve ID : " + this.rID + ", Date : " + this.date );
    }

    public Booking searchAll() {
        Booking myRet = new Booking();
        for (Booking bk : dB.MyBookingList) {
            if (bk.id==id) {
                myRet =  bk;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}