A duck number is any number that contains atleast one 0 in it but not at the beginning.
example:101, 508, 7098, etc.
This java program takes a number as  input and checks if it is a Duck number by examining each digit, if 
any digit is 0(excluding the 1st digit) it prints "It Is A Duck Number" otherwise, it prints "Not A Duck Number".


import java.util.Scanner;

public class duckno{
    public static void main(String args[]){
    int num;
    int d;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    num=sc.nextInt();
    while(num!=0){
      d=num%10;
      if(d==0){
          System.out.println("It Is A Duck Number");
        break;
      }
      
      
      num=num/10;
       }
      if(num==0){
          System.out.println("Not A Duck Number");
      }
    }   
          
      }
    
    
        
    
    
    
