import java.util.Scanner;
class RollnoGen{
public static void main(String[]args){
String name="VIJAYRAJ";
String dob="02-07-1999";
String dept="EC"E;
String clg="JEPPIAAR";
String Rollno= name.substring(0,1)+ dob.substring(0,2)+ dept.substring(0,2)+ dob.substring(3,5)+ clg.substring(0,2);
System.out.println(Rollno);
}
}
