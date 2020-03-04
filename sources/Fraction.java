import java.util.*;
import java.lang.*;

public class Fraction
{
	public int numerator;
	public int denominator;
	
	public Fraction()
	{
	}
	
	public Fraction(int a, int b)
	{
		numerator = a;
		denominator = b;
	}
	
	public Fraction(Fraction source)
	{
		numerator = source.numerator;
		denominator = source.denominator;
	}
	public void setNumerator(int a)
	{
		numerator = a;
	}

	public void setDenominator(int b)
	{
		denominator = b;
	}
		
	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}
	
	public void Print()
	{
		System.out.println(getNumerator()+"/"+getDenominator());
	}


	public static Fraction add(Fraction f1, Fraction f2)
    {
		Fraction f3 = new Fraction(((f1.getNumerator() * f2.getDenominator()) + (f1.getDenominator() * f2.getNumerator())), (f1.getDenominator() * f2.getDenominator()));
        return f3;
	}
	
	public static Fraction subtract(Fraction f1, Fraction f2)
    {
        Fraction f3 = new Fraction(((f1.getNumerator() * f2.getDenominator()) - (f1.getDenominator() + f2.getNumerator())), (f1.getDenominator() * f2.getDenominator()));
        return f3;
    }

    public static Fraction multiply(Fraction f1, Fraction f2)
    {
        Fraction f3 = new Fraction((f1.getNumerator() * f2.getNumerator()), (f1.getDenominator() * f2.getDenominator()));
        return f3;
    }
	
	public static Fraction divide(Fraction f1, Fraction f2)
    {
        if (f2.getNumerator() != 0)
        {
            Fraction f3 = new Fraction((f1.getNumerator() * f2.getDenominator()), (f1.getDenominator() * f2.getNumerator()));
            return f3;
        }
        else throw new IllegalArgumentException("Division by Zero");
    }
	
	public static int GCD(Fraction f1, Fraction f2)
	 {
        int num1 = f1.getDenominator();
        int num2 = f2.getDenominator();
        while (num1 != num2) 
        {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num2;
    }

	public static int LCM(Fraction f1, Fraction f2)
	{
		int num1 = f1.getDenominator();
        int num2 = f2.getDenominator();
		int y = GCD(f1,f2);
		int x=(num1*num2)/y;
        return x;
    }
	
	
	public static void int Simplify(Fraction f1, Fraction f2)
	{
		int num1 = f1.getNumerator();
        int num2 = f1.getDenominator();
		int y = GCD(f1,f2);
		int x=(num1/y)+"/"+(num2/y);
        return x;
    }
	
	
	
	public static void main(String []args)
	{
		System.out.println("The sum, product, product, division are as follows:");
		
		Fraction f1 = new Fraction(3,6);
		Fraction f2 = new Fraction(1,2);
			
		Fraction fractionSum = Fraction.add(f1, f2);
        System.out.println(fractionSum);
		
		Fraction fractionDif = Fraction.subtract(f1, f2);
        System.out.println(fractionDif);

        Fraction fractionProd = Fraction.multiply(f1, f2);
        System.out.println(fractionProd);
		
		Fraction fractionDividend = Fraction.divide(f1, f2);
        System.out.println(fractionDividend);
		
		int gcd = GCD(f1,f2);
		System.out.println("gcd ="+gcd);
		
		int lcm = LCM(f1,f2);
		System.out.println("lcm ="+lcm);
		
		string simplify = Simplify(f1,f2);
		System.out.println("simplify ="+simplify);		
	}
	
	public String toString()
    {  
		return (numerator + "/" + denominator);
		
	}
}