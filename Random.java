import java.util.*;
class random
{
public static void main(String args[])
{
	Random r=new Random();
	for(int i=0;i<6;i++)
	{
System.out.println("The integer random number is"+r.nextInt(12-2));
}
System.out.println("The float random number is"+r.nextInt(12));
System.out.println("The float random number is"+r.nextFloat());
System.out.println("The double random number is"+r.nextDouble());

}
}