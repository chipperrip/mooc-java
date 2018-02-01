
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
//        int cents = this.cents + added.cents;
//        int euros = this.euros + added.euros;

        return new Money(this.euros + added.euros, this.cents + added.cents);

    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        return this.euros == compared.euros && this.cents < compared.cents;
    }

    public Money minus(Money decremented) {

        int euroTemp = this.euros - decremented.euros;
        int centsTemp = this.cents - decremented.cents;

        
        //check if cents go under 0
        if (centsTemp < 0) {
            euroTemp -= 1;
            centsTemp = 100 + centsTemp;
        }

        //check if money reaches 0
        if (euroTemp < 0) {
            euroTemp = 0;
            centsTemp = 0;
        }

        return new Money(euroTemp, centsTemp);

    }
}
