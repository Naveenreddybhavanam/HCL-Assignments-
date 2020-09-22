import java.util.Scanner;
class Adding {

public static void main(String args[]) {
int number,sum=0;
Scanner s=new Scanner(System.in);
number=s.nextInt();
s.close();
for(int i=1;i<=number;i++)
{
sum=sum+i;
System.out.println( sum);
}
}
}