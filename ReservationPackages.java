

/**
 * ReservationPackages
 */
public class ReservationPackages {

    int id, amount;
    String name;

    dashBoard _dashboard;
    public ReservationPackages(){};
    public ReservationPackages(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Reservation Packages >> \n\n1 - ADD New Reservation Package \n2 - View All Reservation Packages\n3 - Search \n4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addReservationPackages();
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

    public void addReservationPackages() {
        com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Name : ");
        this.name = com.getInput();

        com.print_input("Enter The Amount : ");
        this.amount = com.StrToInt(com.getInput());

        dB.MyReservationPackagesList.add(this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addReservationPackages();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id +  ", Name : " + this.name + ", Amount : " + this.amount  );
    }

    public void displayAll() {
        for (ReservationPackages bk : dB.MyReservationPackagesList) {
            bk.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id +  ", Name : " + this.name + ", Amount : " + this.amount  );
    }

    public ReservationPackages searchAll() {
        ReservationPackages myRet = new ReservationPackages();
        for (ReservationPackages rp : dB.MyReservationPackagesList) {
            if (rp.id==id) {
                myRet =  rp;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}