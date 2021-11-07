
public class dBFakeData {
    public dBFakeData() {
        this.add_BanquetHall();
        this.add_Customer();
    }

    public void add_Customer() {
        dB.MyCustomerList.add(new customer(1, "Faiq", 75, "KKY", "1236542V", "faiq@gmail.com", "Faiq", "23652", "Gold"));
        dB.MyCustomerList.add(new customer(2, "Ahamed", 75, "CMB", "1236502E", "ahmd@gmail.com", "Ahmed", "12305", "Silver"));
        dB.MyCustomerList.add(new customer(3, "Farhan", 77, "KAL", "2136527V", "farahan@gmail.com", "Farhan", "fir13", "Gold"));
        dB.MyCustomerList.add(new customer(4, "Firnas", 78, "BATTI", "9315367V", "firnas@gmail.com", "Firnas", "023698", "Platinum"));
        dB.MyCustomerList.add(new customer(5, "Nuzair", 76, "Kandy", "2365153V", "nuzair@gmail.com", "Nuzair", "023654", "Gold"));
        dB.MyCustomerList.add(new customer(6, "Nuhman", 65, "AKP", "3624638V", "nuhman@gmail.com", "Nuhman", "96325", "Gold"));
    }

    public void add_BanquetHall() {
        bHall s = new bHall();

        bHallF h1 = new bHallF();
        h1.setId(1);
        h1.setName("hall - 1");
        h1.setLocation("Batticaloa");
        h1.setNOG(6);
        s.push(h1);

        bHallF h2 = new bHallF();
        h2.setId(2);
        h2.setName("hall - 2");
        h2.setLocation("kky");
        h2.setNOG(5);
        s.push(h2);

        bHallF h3 = new bHallF();
        h3.setId(3);
        h3.setName("hall - 3");
        h3.setLocation("Colombo");
        h3.setNOG(2);
        s.push(h3);

        bHallF h4 = new bHallF();
        h4.setId(4);
        h4.setName("hall - 4");
        h4.setLocation("Kalmunai");
        h4.setNOG(8);
        s.push(h4);

    }
}