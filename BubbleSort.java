
// Java program for implementation of Bubble Sort 
import java.util.*;
public class BubbleSort {
	public void ReDirector() {
		bHall bh = new bHall();
        String ch = br.getInputData("Do you want to coninue ? 1 - yes, 2 - No = ");
        switch (ch) {
            case "1":
                bh.push();
                break;
            default:
                bh.menu();
                break;
        }
	}
	
	List<bHallF> BHListWithoutNull = new ArrayList<>();
	bHallF arr[];
	public BubbleSort(bHallF myDBList[]) {

        for (bHallF bHallF : myDBList) {
            if (bHallF != null) {
                BHListWithoutNull.add(bHallF);
            }

        }

        // com.print(BHListWithoutNull.size());

        arr = BHListWithoutNull.toArray(new bHallF[BHListWithoutNull.size()]);

	}
	

	void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                com.print(arr[j + 1]);

                if (arr[j].nog > arr[j + 1].nog) {
                    // swap arr[j+1] and arr[i]
                    bHallF temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }


	/* Prints the array */
	void printArray() {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println("ID : " + arr[i].id + ", Name : " + arr[i].name + ", Location : " + arr[i].location + ", NOG : " + arr[i].nog);
		System.out.println();

		this.ReDirector();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort(dB.bHallArray);
		ob.bubbleSort();
		System.out.println("Sorted array");
		ob.printArray();
	}

}
