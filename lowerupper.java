import java.util.*;
public class lowerupper
{
public static void main(String[] args)
{
string s;
Scanner q=new Scanner(System.in);
s=q.nextLine();
char[] ch=s.toChararray();
for(int i=0;i<s.length();i++)
{
if(Character.isLowerCase(ch))
{
System.out.println(ch.toUpperCase);
}
else
{
System.out.println(ch.toLowerCase);
}
}
}
}
