package workshop2.Fraction;

public class Fraction {

    private int numer;
    private int denom;

    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public int getDenom() {
        return denom;
    }

    public int getNumer() {
        return numer;
    }

    Fraction add(Fraction x) {
        Fraction result;

        if (this.denom == x.denom) {
            result = new Fraction(x.numer + this.numer, this.denom);
        } else {
            int den = this.denom * x.getDenom();
            int num = this.numer * x.getNumer();
            num = num + x.getNumer() * denom;
            result = new Fraction(num, den);
        }

        return result;

    }

    Fraction subtract(Fraction x) {
        Fraction result;

        if (this.denom == x.denom) {
            result = new Fraction(x.numer - this.numer, this.denom);
        } else {
            int den = this.denom * x.getDenom();
            int num = this.numer * x.getNumer();
            num = num - x.getNumer() * denom;
            result = new Fraction(num, den);
        }

        return result;

    }

    Fraction multiply(Fraction x) {
        return new Fraction(this.getNumer() * x.getNumer(), this.getDenom() * x.getDenom());
    }

    Fraction divide(Fraction x) {
        return new Fraction(this.getNumer() * x.getDenom(), this.getDenom() * x.getNumer());
    }

    // @Override
    public boolean equals(Fraction x) {
        boolean result = false;
        if (this.numer == x.numer && this.denom == x.denom) {
            result = true;
        }
        return result;
    }

    public String toString() {
        return (Integer.toString(numer) + "/" + Integer.toString(denom));
    }

}
