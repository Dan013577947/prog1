/*
DANILO E ALVARO JR
BETCPET 1D-NS
MAAM KAREN FORONDA
ACTIVITY 1
*/

package alvarocpet;

//this is for the use of Math.pow for exponents
import java.lang.Math;
//this is for the use of Input data
import java.util.Scanner;

public class alvarocpet 
{
	
	public static void main(String[] args)
	{
		//num1();
		//num2();
		//num3();
		//num4();
		//num5();
		
		
	}
	//static syntax is needed otherwise it won't work
	static void num1() 
	{
		//assign variable i and j as int type
		int i,j;
		
		//this first for loop is for creating the row levels of our 2d plane
		for(i=0;i<4;i++) 
		{
			//this second for loop is for creating the column levels of our 2d plane
			for(j=0;j<25;j++) 
			{
				//I created letter J here
				if(i==0&&j==3) System.out.print("J");
				else if(i==1&&j==3) System.out.print("J");
				else if((i==2&&j==3) || (i==2&&j==0))System.out.print("J");
				else if((i==3&&j==1)||(i==3&&j==2)) System.out.print("J");
				
				//I created letter A here
				else if(i==0&&j==8) System.out.print("A");
				else if((i==1&&j==7)||(i==1&&j==9)) System.out.print("A");
				else if((i==2&&j>=6)&&(i==2&&j<=10)) System.out.print("A");
				else if((i==3&&j==5)||(i==3&&j==11))System.out.print("A");
				
				//I created letter V here
				else if((i==0&&j==12)||(i==0&&j==18)) System.out.print("V");
				else if((i==1&&j==13)||(i==1&&j==17)) System.out.print("V");
				else if((i==2&&j==14)||(i==2&&j==16)) System.out.print("V");
				else if(i==3&&j==15)System.out.print("V");
				
				//I created letter A here
				else if(i==0&&j==21) System.out.print("A");
				else if((i==1&&j==20)||(i==1&&j==22)) System.out.print("A");
				else if((i==2&&j>=19)&&(i==2&&j<=23)) System.out.print("A");
				else if((i==3&&j==18)||(i==3&&j==24))System.out.print("A");
				
				//this prints blank spaces if the condition is not meet, it has no ln so it 
				//won't create new line
				else System.out.print(" ");
				
			}
			//this works when the run of the pre-for loop is done
			//it will print new line 
			System.out.println();
		}
			
			
	}


	static void num2(){
		//float is much better because the given have decimals
		float ans;
		
		ans = (float)((25.5*3.5-3.5*3.5)/(40.5-4.5));
		System.out.println(ans);
	}
	
	static void num3(){
		//double is much better because float won't run
		double ans;
		
		ans = (double) 4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
		System.out.println(ans);
	}
	
	static void num4(){
		
		//I assigned data for radius in int type
		int radius = 4;
		//I used Math.pow to square the radius instead of radius*radius(more knowledge much better)
		int radius_squared = (int) Math.pow(radius, 2);
		//so the Area obviously will become in decimal so I made the variable float
		float Area = (float)3.1415*radius_squared;
		System.out.println(Area);
		
		//if float won't work then make it double
		double Para = (float)2*3.1415*radius;
		System.out.println(Para);
		
		
	}
	
	static void num5(){
		//I just assigned 3 int numbers and one for answer as ans
		int num1,num2,num3;
		int ans; 
		//I made a scanner named in
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Enter first number: ");
		//the in.nextInt() syntax scans and stores the input data and pass iit to the variable at the left
		num1 = in.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = in.nextInt();
		
		System.out.print("Enter third number: ");
		num3 = in.nextInt();
		
		//all data are int, so (int) is not necessary, this computes for the average
		ans = (num1+num2+num3)/3;
		
		//here is the display for average
		System.out.println("The average is: " + ans);
	}	
}

