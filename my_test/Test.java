import java.util.*;
import java.io.*;
class Test{
int a;
double b;
Test(){
Scanner scan = new Scanner(System.in);
  a = scan.nextInt();
  b = scan.nextDouble();
 
}
void pro(){
if(this.a%5==0&&(a+.50)<b){
double tot;
tot=(b-((double)a+.50));
System.out.println(tot);
}
else{
System.out.println(b);
}
}
public static void main(String[] args){
 	Test t = new Test();
	t.pro();
 	
}
}