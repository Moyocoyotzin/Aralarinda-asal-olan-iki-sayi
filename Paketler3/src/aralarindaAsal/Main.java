package aralarindaAsal;
import java.util.Scanner;

public class  Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz : ");
		int sayi1 = sc.nextInt();
		int sayma = 0;
		System.out.println("Ikinci sayiyi giriniz : ");
		int sayi2 = sc.nextInt();
		
		
		for (int i = 2; i < sayi1; i++) 
		{
			if(sayi1%i==0)
			{
				for (int j = 2; j < sayi2; j++) {
					if(sayi2%i==0)
					{
						sayma++;
					}
				}
			}
			
		}
	
		if(sayma==0)
		{
			System.out.println("Bu sayilar aralarinda asaldir");
		}
		else
		{
			System.out.println("Bu sayilar aralarinda asal degildir");
			
		}
	   }
	}

		    
		









        
  
