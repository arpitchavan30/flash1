import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any roman number :");
		String s=sc.next();
		int sum=0;
		switch(s.charAt(0))
		{
		case 'I':
			sum += 1; 
			break;

		case 'V': 
			sum+=5;    
			break;

		case 'X':               
			sum+=10;               
			break;   

		case 'L':                  
			sum+=50;   
			break;

		case 'C':
			sum+=100;    
			break;

		case 'D':
			sum+=500;         
			break; 

		case 'M':
			sum+=1000; 
			break;   
		}    

		int i=1;
		while(i<s.length())
		{
			switch(s.charAt(i))
			{
			case 'I':
				sum += 1;
				i++; 
				break;

			case 'V': 

				if(s.charAt(i-1)=='I')
					sum+=3;
				else
					sum+=5;    

				i++; 
				break;

			case 'X':
				if(s.charAt(i-1)=='I')
					sum+=8;
				else
					sum+=10;   

				i++; 
				break;   

			case 'L':
				if(s.charAt(i-1)=='X')
					sum+=30;
				else
					sum+=50;   

				i++; 
				break;

			case 'C':
				if(s.charAt(i-1)=='X')
					sum+=80;
				else
					sum+=100; 

				i++; 
				break;

			case 'D':
				if(s.charAt(i-1)=='C')
					sum+=300;
				else
					sum+=500; 

				i++; 
				break; 

			case 'M':
				if(s.charAt(i-1)=='C')
					sum+=800;
				else
					sum+=1000; 

				i++;
				break;    

			}
			//System.out.println(sum);
		}
		//System.out.println(sum);
	}

}
