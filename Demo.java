package Assignment;

class Demo
{
public static void main(String[] args)
{
Demo demo = new Demo();
int result = demo.add(10,20);
demo.multiply(result);
System.out.println(result);
}
int add(int no1, int no2)    // changed return type from void to int, as it is returning added value
{
return no1+no2;
}

void multiply (int no1)        // created this method as it is being called from main()
{
	System.out.println("Multiply method");
}
}