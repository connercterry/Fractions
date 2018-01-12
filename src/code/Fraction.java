package code;

public class Fraction {
    private int num, denom;

    public Fraction(int num, int denom)
    {
        if(denom ==0)
        {
            throw new IllegalArgumentException("No you dummy. Fractions cannot have a zero in the denominator.");
        }
        else
        {
        this.num = num;
        this.denom = denom;
        simplify();
        }
    }
    public static int gcf(int a, int b)
    {
        int min = Math.min(a,b);
        for(int x = min; x> 0; x--)
        {
            if(a%x ==0 && b%x==0) return x;

        }
        return 1;
    }

    public Fraction(int num) {
        this.num = num;
        denom = 1;
    }

    public Fraction(Fraction other) {
        num = other.num;
        denom = other.denom;
    }

    public String toString() {
        return num + "/" + denom;
    }

    public Fraction inverse() {
        if (num == 0) return null;
        return new Fraction(denom, num);
    }

    public Fraction multiply(Fraction stephen) {
        return new Fraction(num * stephen.num, denom * stephen.denom);

    }

    public Fraction divide(Fraction f)
    {
        return new Fraction(num * f.denom, denom * f.num);
    }
    private void simplify()
    {
        int factor = gcf(num,denom);
        num/= factor;
        denom/= factor;

    }


}
