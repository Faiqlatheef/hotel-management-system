// Java program for implementation of Selection Sort 
import java.util.*;
	public class SelectionSort {
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
    public SelectionSort (bHallF myDBList[]) {

        for (bHallF bHallF : myDBList) {
            if (bHallF != null) {
                BHListWithoutNull.add(bHallF);
            }

        }

        // com.print(BHListWithoutNull.size());

        arr = BHListWithoutNull.toArray(new bHallF[BHListWithoutNull.size()]);

    }

    void sort() {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].nog < arr[min_idx].nog)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            bHallF temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray() {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println("ID : " + arr[i].id + ", Name : " + arr[i].name + ", Location : " + arr[i].location + ", NOG : " + arr[i].nog);
        System.out.println();

        this.ReDirector();
    }

    // // Driver code to test above
    // public static void main(String args[]) {
    //     SelectionSort ob = new SelectionSort();

    //     System.out.println("before sort array");
    //     ob.printArray(dB.bHallArray);

    //     ob.sort(dB.bHallArray);
    //     System.out.println("Sorted array");
    //     ob.printArray(dB.bHallArray);
    // }
}
