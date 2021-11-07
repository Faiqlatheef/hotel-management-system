

/**
 * bHall
 */
public class bHall {
    private static final int id = 0;
    public static int top = 0;
    public static BubbleSort MyBubbleSort;
    public static SelectionSort MySelectionSort;

    public void push() {

        bHallF bh = new bHallF();
        bh.setId(br.intConvert(br.getInputData("Enter The ID : ")));
        bh.setName(br.getInputData("Enter The Name : "));
        bh.setLocation(br.getInputData("Enter The Location : "));
        bh.setNOG(br.intConvert(br.getInputData("Enter The Number Of Guest : ")));

        top += 1;
        dB.bHallArray[top] = bh;
        System.out.println("Data Inserted");

        ReDirector();

    }

    public bHallF pop() {
        bHallF temp = dB.bHallArray[top];
        top -= 1;
        System.out.println("Data Deleted");

        return temp;

    }


    public void push(bHallF obj) {

        top += 1;
        dB.bHallArray[top] = obj;

    }

    public boolean isFull() {
        return top == 99;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void ReDirector() {
        String ch = br.getInputData("Do you want to coninue Adding? 1 - yes, 2 - No = ");
        switch (ch) {
            case "1":
                this.push();
                break;
            default:
                this.menu();
                break;
        }
    }

    public void displayList() {

        for (bHallF row : dB.bHallArray) {
            if (row != null) {
                bHallF getData = this.pop();
                if (getData != null) {
                    br.print("ID : " + getData.id + ", Name : " + getData.name + ", Location : " + getData.location
                            + ", Number Of Gust : " + getData.nog);
                }
            }
        }

        this.ReDirector();
    }

    public void displayList_without_loop() {

        int tempTop = top;
        for (bHallF row : dB.bHallArray) {
            if (row != null) {
                bHallF getData = this.pop();
                if (getData != null) {
                    br.print("ID : " + getData.id + ", Name : " + getData.name + ", Location : " + getData.location
                            + ", Number Of Gust : " + getData.nog);
                }
            }
        }

        top = tempTop;
    }

    public void menu() {
        String ch = br.getInputData("1 - ADD\n2 - Veiw\n3 - Bubble Sort\n4 - Selection Sort\n5 - Reset\n6 - Exit = ");
        switch (ch) {
            case "1":
                this.push();
                break;
            case "2":
                dBFakeData db = new dBFakeData(); 
                this.displayList();
                break;
            case "3":
                dBFakeData dbf = new dBFakeData();
                MyBubbleSort = new BubbleSort(dB.bHallArray);
                MyBubbleSort.bubbleSort();
                MyBubbleSort.printArray();
                break;
            case "4":
                dBFakeData dbfd = new dBFakeData(); 
                MySelectionSort = new SelectionSort(dB.bHallArray);
                MySelectionSort.sort();
                MySelectionSort.printArray();
                break;
            case "5":
                this.pop();
                break;
            default:
                dashBoard.myDashBoard();
                break;
        }
    }
    


    public bHallF getbHall() {

        bHallF myRet = null;
        this.displayList_without_loop();

        int id = br.intConvert(br.getInputData("\n Enter The ID : "));

        int tempTop = top;
        for (bHallF row : dB.bHallArray) {
            if (row != null) {
                bHallF getData = this.pop();
                if (getData != null) {
                    if (getData.id == id) {
                        myRet = getData;
                    }
                }
            }
        }

        top = tempTop;

        return myRet;
    }



}
