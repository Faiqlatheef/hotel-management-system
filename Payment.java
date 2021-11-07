

/**
 * Payment
 */
public class Payment {

    int id, amount, bID, discount, disAmount;
    String pType ;

    dashBoard _dashboard;
    public Payment(){};
    public Payment(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Payment >> \n\n1 - ADD New Payment \n2 - View All Payments \n3- Search \n4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addPayment();
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

    public void addPayment() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Amount : ");
        this.amount = com.StrToInt(com.getInput());

        com.print_input("Enter The Payment Type : ");
        this.pType = com.getInput();

        com.print_input("Enter The Discount Per: ");
        this.discount = com.StrToInt(com.getInput());

        com.print_input("Enter The Discount Amount : ");
        this.disAmount = com.StrToInt(com.getInput());

        com.print_input("Enter The Booking ID : ");
        this.bID = com.StrToInt(com.getInput());
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

        dB.MyPaymentList.add (this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addPayment();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id + ", Amount : " + this.amount + ", Payment Type : " + this.pType + ", Discount Per :" + this.discount+ ", Discount Amount :" + this.disAmount+ ", Booking ID :" + this.bID);
    }

    public void displayAll() {
        for (Payment pay : dB.MyPaymentList) {
            pay.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id + ", Amount : " + this.amount + ", Payment Type : " + this.pType + ", Discount Per :" + this.discount+ ", Discount Amount :" + this.disAmount+ ", Booking ID :" + this.bID );
    }

    public Payment searchAll() {
        Payment myRet = new Payment();
        for (Payment py : dB.MyPaymentList) {
            if (py.id==id) {
                myRet =  py;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}