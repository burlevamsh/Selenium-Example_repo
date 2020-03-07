import java .util.*;
class Prime{
 public static void main(String [] args){

int a,b,i,j,count=0;
Scanner sc=new Scanner(System.in);

System.out.println("first limit");
a=sc.nextInt();
System.out.println("last limit");
b=sc.nextInt();

System.out.println("prime numbers are");
for(i=a;i<=b;i++){
count=0;
	for(j=1;j<=i;j++){
		if(i%j==0){
			count++;
		}
	}
	if(count==2){
		System.out.println(""+i);
	}
}
}}