

/**
 * reservationQueue
 */
public class reservationQueue {

    int first, last;

    public reservationQueue() {
        this.first = this.last = -1;
    }

    public void menu() {
        customer cusObj = new customer();
        customer getCustomerObj = cusObj.searchAll();
        bHall bh = new bHall();
        bHallF getBanquetHallObj = bh.getbHall();
    }

    public boolean isEmpty() {
        return (first == -1);
    }

    public boolean isFull() {
        return (first == 0 && last == 99);
    }

    public void enQueue(Object o) {
        if (!isFull()) {
            if (first == -1) {
                first = 0;

                // last = (last + 1) % size;
                // storage[last] = o;
            }
        }
    }
    public void deQueue(Object o) {
        if (!isFull()) {
            if (last == 0) {
                last = (last + 1) ;

            }
        }
    }
}