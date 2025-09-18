import java.util.*;
class Palindrome{
public static void main(String args[]){
String s,r="";
System.out.println("Enter a string:");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
int l=s.length();
int i;
for(i=l-1;i>=0;i--){
r=r+s.charAt(i);
}
if(s.equalsIgnoreCase(r)){
System.out.println("Palindrome");
}
else{
System.out.println("Not a Palindrome");
}
}
}
