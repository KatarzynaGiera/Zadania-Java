
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
int randNumbers[]=new int[100];
int sum=0;
for(int i=0;i<100;i++)
{		
Random generator = new Random();
randNumbers[i] = generator.nextInt(21);
System.out.print(randNumbers[i]+", ");
sum+=randNumbers[i];
}

System.out.println("\nSuma 100 losowych liczb od 0 do 20 to:"+sum);


	}

}
