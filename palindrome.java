class Palindrome {
public static void main(String[] args) {
int num=6,rev=0,temp=num;
for(;num>0;num/=10)
{
int rem=num%10;
rev=rev*10+rem;
}
if(temp==rev)
{
System.out.println(temp +" palindrome");
}
}
}	
