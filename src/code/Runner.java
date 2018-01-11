package code;

public class Runner
{
    public static void main(String[] args)
    {
      Fraction myFraction = new Fraction(2, 3);
      Fraction otherFraction = new Fraction(5);
      Fraction thatFraction = new Fraction(myFraction);
      Fraction stephens = myFraction.multiply(otherFraction);
      Fraction goebel = new Fraction(0,21);
      System.out.print(goebel.inverse());
      goebel.multiply(goebel.inverse());
      //System.out.println(stephens);
      // System.out.println(myFraction);
     // System.out.println(otherFraction);
     // System.out.println(thatFraction);

    }




}
