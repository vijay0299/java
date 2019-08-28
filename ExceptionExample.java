import java.util.*;
class ExceptionExample{
public static void main(String[] args){
try{
String s="123";
int i=Integer.parseInt(s);
System.out.println(i);
}catch(NullPointerException y){System.out.println(y);}
System.out.println("rest of code...........");
}
}
