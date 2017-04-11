//****Implement a class that checks whether a given number is a prime using both the Thread class and Runnable interface****

import java.util.Scanner;

//Multi is a Thread extended class
class Multi extends Thread{  
public void run(){  
	System.out.println("thread is running...");
	int num;
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter the number to be checked either it is prime or not in thread extended class : ");
	
	
	    num = in.nextInt();
	
	    boolean isPrime = true;
	
	    //check to see if the numbers are prime
	    for (int j=2; j<num; j++){
	
	        if(num%j==0){
	            isPrime = false;
	            
	            break;
	        }
	    }
	    //print the number
	    if(isPrime)
	    {
	        System.out.println(num + " is a prime number. ");
	    }
	    else
		{
			System.out.println("Not a Prime number...");
		}
  
	}  
}  

// Multi3 is a Runnable implemented  Thread class

class Multi3 implements Runnable{  

	public void run(){  
		System.out.println("thread is running...");
		int num;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the number to be checked either it is prime or not in runnable implemented class : ");
		
		
		    num = in.nextInt();
		
		    boolean isPrime = true;
		
		    //check to see if the numbers are prime
		    for (int j=2; j<num; j++){
		
		        if(num%j==0){
		            isPrime = false;
		            
		            break;
		        }
		    }
		    //print the number
		    if(isPrime)
		    {
		        System.out.println(num + " is a prime number. ");
		    }
		    else
			{
				System.out.println("Not a Prime number...");
			}
		
	}
}  
// PrimeNumber class to check weather a number is prime or not....
public class PrimeNumber {

	public static void main(String args[])
	{  
		int option;
		Scanner input = new Scanner(System.in);
		
		// Runnable implemented Thread class objects creation and thread object creation
		Multi3 m1=new Multi3();  
		Thread t1 =new Thread(m1);  
		//t1.start();
		
		//  Thread Extended class objects creation and thread object creation
		Multi t2=new Multi();  
		//t2.start();
		
		System.out.println("Enter your choice :"+"\n1. Thread extended"+"\n2.Runnable implemented.");
		option = input.nextInt();
		
		// Option to execute the thread between both 
		switch(option)
		{
		case 1:
			System.out.println("thread extended method is called");
			t2.start();
			break;
		case 2:
			System.out.println("Runnable implemented method is called");
			t1.start();
			break;	
		}
		
	}  


}
