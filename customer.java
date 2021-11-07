

/**
 * customer
 */
public class customer {
    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Customer >> \n\n1 - ADD New Customer \n2 - View All Customers \n3 - Search \n4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addCustomer();
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

    int id, mob;
    String name, address, nic, email, username, password, custype;

    dashBoard _dashboard;
    public customer(){};
    public customer(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public customer(int _id, String _name, int _mob, String _address,String _nic,String _email,String _username,String _password,String _custype ) {
        this.id = _id;
        this.name = _name;
        this.mob = _mob;
        this.address = _address;
        this.nic = _nic;
        this.email = _email;
        this.username = _username;
        this.password = _password;
        this.custype = _custype;
        
    }



    public void addCustomer() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The Name : ");
        this.name = com.getInput();

        com.print_input("Enter The Mob : ");
        this.mob = com.StrToInt(com.getInput());

        com.print_input("Enter The Address : ");
        this.address = com.getInput();

        com.print_input("Enter The NIC : ");
        this.nic = com.getInput();

        com.print_input("Enter The Email : ");
        this.email = com.getInput();

        com.print_input("Enter The Username : ");
        this.username = com.getInput();

        com.print_input("Enter The Password : ");
        this.password = com.getInput();

        com.print_input("Enter The Customer Type : ");
        this.custype = com.getInput();
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

        
        dB.MyCustomerList.add(this);
        System.out.println("Data Inserted");
        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addCustomer();
                break;
            case "2":
                welcomeMessage();
                break;
        }
        
    }

    public void displayList() {

        if (dB.MyCustomerList.size() > 0) {
            for (customer row : dB.MyCustomerList) {
                com.print("ID : " + row.id + ", Name : " + row.name + ", Mobile : " + row.mob);
            }
        } else {
            com.print("Empty List");
        }

        this.ReDirector();
    }

    public void menu() {
        String ch = com.getInputData("1 - ADD\n2 - Veiw\n3 - Exit = ");
        switch (ch) {
            case "1":
                this.addCustomer();
                break;
            case "2":
                this.displayList();
                break;
            default:
                dashBoard.myDashBoard();
                break;
        }
    }

    public void ReDirector() {
        String ch = com.getInputData("Do you want to coninue ? 1 - yes, 2 - No = ");
        switch (ch) {
            case "1":
                this.addCustomer();
                break;
            default:
                this.menu();
                break;
        }
    }

    public void displayList_without_loop() {

        if (dB.MyCustomerList.size() > 0) {
            for (customer row : dB.MyCustomerList) {
                com.print("ID : " + row.id + ", Name : " + row.name + ", Mob : " + row.mob + ", Address :" + row.address+ ", NIC :" + row.nic+ ", Email :" + row.email+ ", Username :" + row.username+ ", Password :" + row.password+ ", Customer Type :" + row.custype);
            }
        } else {
            com.print("Empty List");
        }

    }

    public void display() {
        com.print("ID : " + this.id + ", Name : " + this.name + ", Mob : " + this.mob + ", Address :" + this.address+ ", NIC :" + this.nic+ ", Email :" + this.email+ ", Username :" + this.username+ ", Password :" + this.password+ ", Customer Type :" + this.custype);
    }

    public void displayAll() {
        for (customer cus : dB.MyCustomerList) {
            cus.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id + ", Name : " + this.name + ", Mob : " + this.mob + ", Address :" + this.address+ ", NIC :" + this.nic+ ", Email :" + this.email+ ", Username :" + this.username+ ", Password :" + this.password+ ", Customer Type :" + this.custype);
    }

    public customer searchAll() {
        
        customer myRet = new customer();
        for (customer cus : dB.MyCustomerList) {
            if (cus.id==id) {
                myRet =  cus;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
    public customer getCustomerObject() {
        customer myRet = null;
        this.displayList_without_loop();

        int id = com.intConvert(com.getInputData("\n Enter The ID : "));

        for (customer row : dB.MyCustomerList) {
            if (row.id == id) {
                myRet = row;
                break;
            }
        }
        com.print(myRet);
        return myRet;
    }
}