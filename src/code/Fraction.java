package code;

public class Fraction
{
    private int num, denom;

    public Fraction(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
    }
    public Fraction(int num)
    {
        this.num=num;
        denom = 1;
    }
    public Fraction(Fraction other)
    {
        num = other.num;
        denom = other.denom;
    }

    public String toString()
    {
        return num + "/" + denom;
    }
    public Fraction inverse()
    {
       if(num == 0) return null;
       return new Fraction(denom,num);
    }
    public Fraction multiply(Fraction stephen)
    {
        return new Fraction(num* stephen.num, denom*stephen.denom);
    }

}
