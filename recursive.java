import java.util.*;
class recursive
{
 
int add(int s)
{
if(s==0) 
return 0;
else if(s==1)
	return 1;
else
return add(s-1)+add(s-2);

}
public static void main(String args[])
{
	int s;
Scanner sc=new Scanner(System.in);
int sum=0;
recursive re=new recursive();
System.out.println("enter the value of s");
s=sc.nextInt();


for(int i=0;i<=s;i++)
{
	sum=re.add(s);
System.out.println(re.add(i));
}
}
}
