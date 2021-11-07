

/**
 * Features
 */
public class Features {

    int id, fee;
    String name;

    dashBoard _dashboard;
    public Features(){};
    public Features(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Features >> \n\n1 - ADD New Feature \n2 - View All Features\n3 - Search \n4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addFeatures();
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

    public void addFeatures() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Name : ");
        this.name = com.getInput();

        com.print_input("Enter The Fee : ");
        this.fee = com.StrToInt(com.getInput());
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
        

        dB.MyFeaturesList.add(this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addFeatures();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id +  ", Name : " + this.name + ", Fee : " + this.fee  );
    }

    public void displayAll() {
        for (Features bk : dB.MyFeaturesList) {
            bk.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id +  ", Name : " + this.name + ", Fee : " + this.fee  );
    }

    public Features searchAll() {
        Features myRet = new Features();
        for (Features ft : dB.MyFeaturesList) {
            if (ft.id==id) {
                myRet =  ft;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}