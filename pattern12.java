class Program12
{
public static void main(String[]args)
{
int n=5;
int k=1;
char ch='a';
for(int i=0;i<=n-1;i++)
{
for(int j=0;j<=n-1;j++)
{
if(i+j>=n-1)
{ 
if(i%2==0)
{
System.out.print(k++ +" ");
}
else
System.out.print(ch++ +" ");
}
//else
//System.out.print(" ");
} 
System.out.println( ); 
}
}
}