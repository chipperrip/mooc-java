
/*
 * @author Christopher
 *
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        if ((this.value) < this.upperLimit) {

            this.value++;
        } else {

            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (this.value < 10) {

            return "0" + this.value;
        }
        return "" + this.value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        }
    }
}
