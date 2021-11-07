

/**
 * reservationNode
 */
public class reservationNode {

    int rID,rBasicAmount,rNOG,rQueNo;
    String rStartDate,rEnddate,rDate;
    customer cusinfo;
    bHall bh;
    reservationNode next;

    public reservationNode(int rID, String rDate, int rBasicAmount, int rNOG, int rQueNo,String rStartDate,String rEnddate,customer cusinfo,bHall bh)
    {
        this.rID= rID;
        this.rDate=rDate;
        this.rBasicAmount=rBasicAmount;
        this.rNOG=rNOG;
        this.rQueNo=rQueNo;
        this.rStartDate=rStartDate;
        this.rEnddate=rEnddate;
        this.cusinfo=cusinfo;
        this.bh=bh;

    }
    public void Display(){
        com.print("ID : " + this.rID + "Date : " + this.rDate + "Basic Amount : " + this.rBasicAmount + "Number of Guests : " + this.rNOG + "Queue Number : " + this.rQueNo + "Start Date : " + this.rStartDate + "End Date : " + this.rEnddate + "Customer : " + this.cusinfo + "Banquet Hall : " + this.bh );
    }

    

}

