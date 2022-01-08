package Week3.Day1;

public class Calculator {
public void add(int a, int b)
{
	System.out.println("Addition of two integers");
	System.out.println(a+ " + " +b+ " = "+(a+b));
	}
public void add(int a, int b, int c)
{
	System.out.println("Addition of three integers");
	System.out.println(a+ " + " +b+ " + "+c+" = "+(a+b+c));
	}
public void multiply(int a, int b)
{
	System.out.println("Product of two integers");
	System.out.println(a+ " * " +b+ " = "+(a*b));}
public void multiply(int a, double b)
{
	System.out.println("Product of 1 int and 1 double");
	System.out.println(a+ " * " +b+ " = "+(a*b));}
public void subtract(int a, int b)
{
	System.out.println("Difference between two integers");
	System.out.println(a+ " - " +b+ " = "+(a-b));}
public void subtract(double a, double b)
{
	System.out.println("Difference between two double");
	System.out.println(a+ " - " +b+ " = "+(a-b));}
public void divide(int a, int b)
{
	System.out.println("Division of int by int");
	System.out.println(a+ " / " +b+ " = "+(a/b));}
public void divide(double a, int b)
{
	System.out.println("Division of double by int");
	System.out.println(a+ " / " +b+ " = "+(a/b));}
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.add(10, 20);
	calc.add(10, 30, 40);
	calc.subtract(10023.25, 25.750);
	calc.subtract(10,80);
	calc.multiply(10, 0.25);
	calc.multiply(10, 20);
	calc.divide(25.99, 3);
	calc.divide(200, 100);
}
}
