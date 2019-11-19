
import javax.swing.JOptionPane;


public class RationalLab02 
{
	public static void main (String args[])
	{   
		String strNum1 = JOptionPane.showInputDialog("Enter Numerator 1"); 
		String strDen1 = JOptionPane.showInputDialog("Enter Denominator 1");
		String strNum2 = JOptionPane.showInputDialog("Enter Numerator 2"); 
		String strDen2 = JOptionPane.showInputDialog("Enter Denominator 2");
		
		int num1 = Integer.parseInt(strNum1);
		int den1 = Integer.parseInt(strDen1);
		int num2 = Integer.parseInt(strNum2);
		int den2 = Integer.parseInt(strDen2);

		Rational r1 = new Rational(num1,den1);
		Rational r2 = new Rational(num2,den2);
		Rational r3 = new Rational();
		
		r3.multiply(r1,r2);
		String mul = r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced();
		r3.divide(r1,r2);
		String div = r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced();		
		r3.add(r1,r2);
		String add = r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced();
		r3.subtract(r1,r2);
		String sub = r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced();
		
		String output = mul + "\n" + div + "\n" + add + "\n" + sub;
		
		JOptionPane.showMessageDialog(null,output);
          
		System.exit(0);
	}
}

class Rational
{
	private int num;		//  numerator
	private int den;		//  denominator
	
	public Rational()
	{
		num = 0;
		den = 1;
	}

	public Rational(int n, int d)
	{
		num = n;
		den = d;
	}
	
	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	}

	private void reduce()  //optional
	{

	}
	
	
	public String getReduced() 
	{ 
		int pp = getGCF(num, den);
		int dd = num/pp;
		int cc = den/pp;
		String abcd = dd + "/" + cc;
		return abcd;
	}
	
	public String getOriginal()
	{
		String ab = num + "/" + den;
		return ab;
	}
	
	public void multiply(Rational r1, Rational r2)
	/** we can do r1.num, because its using the rational class, and we have access **/
	{
		num = r1.num * r2.num;
		den = r1.den * r2.den;
	}

	public void divide(Rational r1, Rational r2)
	{
		/** reciprocal the second rational then multiply **/
		num = r1.num * r2.den;
		den = r1.den * r2.num;
	}
	
	public void add(Rational r1, Rational r2)
	{
		/** first cross multiply. eg 1/3 + 2/5, 1(5)=5 and 3(2)=6
		 *then add results to get numerator 5+6 = 11.
		 *then multiply both denominators to get denominator 3(5)=15 **/
		 num = (r1.num * r2.den) + (r1.den * r2.num);
		 den = r2.den * r1.den;
	}
	
	public void subtract(Rational r1, Rational r2)
	{
		/** hopefully same as additon, just minus instead **/
		 num = (r1.num * r2.den) - (r1.den * r2.num);
		 den = r2.den * r1.den;
	}
 
}



	







	

 


