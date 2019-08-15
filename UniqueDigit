class UniqueDigit{
public void count(int num){
int rem=0;
int arr[]=new int[10];

while(num>0){

rem=num%10;
arr[rem]++;
num=num/10;
}
int count=0;
for(int i=0;i<arr.length;i++){

if(arr[i]>0){
count++;
}
}
System.out.println("the unique digit is"+count);
}
public static void main(String[] args){
int n=756562;
UniqueDigit U=new UniqueDigit();
U.count(n);
}
}
