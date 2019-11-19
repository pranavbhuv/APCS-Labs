// RationalLab01.java
// The Rational Class Program I
// This is the student, starting version of the RationalLab01 assignment.


import javax.swing.JOptionPane;


public class RationalLab01
{
	public static void main (String args[])
	{
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator ");
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num,den);
		JOptionPane.showMessageDialog(null,r.getOriginal() + " equals " + r.getDecimal() + "\n and reduces to " + r.getReduced());


		System.exit(0);
	}
}
class Rational
{
	int num, den;
	int rednum, redden;

//	Rational
	public Rational( int a, int b)
	{
		num = rednum = a;
		den = redden = b;

	}

//	getNum
	public int getNum()
	{
		return 1;
	}

//	getDen

//	getDecimal
	public double getDecimal()
	{
		double num1 = num;
		double den1 = den;
		double dw = num1/den1;
		return dw;
	}

//	getOriginal
	public String getOriginal()
	{
		String astring = num + "/" + den;
		return astring;
	}

//  getReduced
	public String getReduced()
	{
		int pp = getGCF(num, den);
		int dd = num/pp;
		int cc = den/pp;
		String abcd = dd + "/" + cc;
		return abcd;
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
}








