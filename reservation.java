

/**
 * reservation
 */
public class reservation {

    reservationNode Front,Rear;

    public reservation(){
        this.Front= this.Rear=null;
    }
    
    public void enque(int rID, String rDate, int rBasicAmount, int rNOG, int rQueNo,String rStartDate,String rEnddate,customer cusinfo,bHall bh){
        reservationNode rnObj = new reservationNode (rID, rDate, rBasicAmount, rNOG, rQueNo, rStartDate, rEnddate,cusinfo,bh);
        if(this.Front==null){
            this.Front=this.Rear=rnObj;
            this.Front.next=null;
        }
        else{
            this.Rear.next=rnObj;
            this.Rear=rnObj;
        }
        
    }
    public reservationNode deque(){
        reservationNode temp=null;
        if(this.Front!=null){
            temp=this.Front;
            this.Front=this.Front.next;
            return temp;
        }
        else{
            System.out.println("Queue is Empty");
        }
        return temp;
    }

}
