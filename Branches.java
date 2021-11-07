

/**
 * Branches
 */
public class Branches {

    int id, mob;
    String name, email, address, location ;

    dashBoard _dashboard;
    public Branches(){};
    public Branches(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Branches >> \n\n1 - ADD New Branch \n2 - View All Branches \n3 - Search n\4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addBranch();
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

    public void addBranch() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Name : ");
        this.name = com.getInput();

        com.print_input("Enter The Mobile : ");
        this.mob = com.StrToInt(com.getInput());

        com.print_input("Enter The Email: ");
        this.email = com.getInput();

        com.print_input("Enter The Address : ");
        this.address = com.getInput();

        com.print_input("Enter The Location : ");
        this.location = com.getInput();
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
        

        dB.MyBranchesList.add (this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addBranch();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id + ", Name : " + this.name + ", Mobile : " + this.mob + ", Email :" + this.email+ ", Address :" + this.address+ ", Location :" + this.location);
    }

    public void displayAll() {
        for (Branches br : dB.MyBranchesList) {
            br.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id + ", Name : " + this.name + ", Mobile : " + this.mob + ", Email :" + this.email+ ", Address :" + this.address+ ", Location :" + this.location);
    }

    public Branches searchAll() {
        Branches myRet = new Branches();
        for (Branches br : dB.MyBranchesList) {
            if (br.id==id) {
                myRet =  br;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}