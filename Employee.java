

/**
 * Employee
 */
public class Employee {

    int id, mob;
    String fName, address, nic, lName, username, password, custype;

    dashBoard _dashboard;
    public Employee(){};
    public Employee(dashBoard par) {
        this._dashboard = par;
        welcomeMessage();
    }

    public void welcomeMessage() {
        com.print_input("\n\n XYZ HOTEL - RS >>  Employee >> \n\n1 - ADD New Employee \n2 - View All Employees \n3 - Search \n4 - Exit \n = ");
        String ch = com.getInput();

        switch (ch) {
            case "1":
                addEmployee();
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

    public void addEmployee() {
        try {
            com.print_input("Enter The ID : ");
        this.id = com.StrToInt(com.getInput());

        com.print_input("Enter The First Name : ");
        this.fName = com.getInput();

        com.print_input("Enter The Last Name : ");
        this.lName = com.getInput();

        com.print_input("Enter The Mob : ");
        this.mob = com.StrToInt(com.getInput());

        com.print_input("Enter The Address : ");
        this.address = com.getInput();

        com.print_input("Enter The NIC : ");
        this.nic = com.getInput();

        com.print_input("Enter The Username : ");
        this.username = com.getInput();

        com.print_input("Enter The Password : ");
        this.password = com.getInput();

        com.print_input("Enter The Employee Type : ");
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
        

        dB.MyEmployeeList.add(this);

        com.print_input("Do you want To Continue ? 1 - Yes , 2 - Not ");
        String ch = com.getInput();
        switch (ch) {
            case "1":
                addEmployee();
                break;
            case "2":
                welcomeMessage();
                break;
        }
    }

    public void display() {
        com.print("ID : " + this.id + ", First Name : " + this.fName + ", Last Name :" + this.lName + ", Mob : " + this.mob + ", Address :" + this.address+ ", NIC :" + this.nic+  ", Username :" + this.username+ ", Password :" + this.password+ ", Customer Type :" + this.custype);
    }

    public void displayAll() {
        for (Employee cus : dB.MyEmployeeList) {
            cus.display();
        }

        welcomeMessage();
    }

    public void search(int id) {
        com.print("ID : " + this.id + ", First Name : " + this.fName + ", Last Name :" + this.lName + ", Mob : " + this.mob + ", Address :" + this.address+ ", NIC :" + this.nic+  ", Username :" + this.username+ ", Password :" + this.password+ ", Customer Type :" + this.custype);
    }

    public Employee searchAll() {
        Employee myRet = new Employee();
        for (Employee em : dB.MyEmployeeList) {
            if (em.id==id) {
                myRet =  em;
                break;
            }
        }

        welcomeMessage();

        return myRet;
    }
}