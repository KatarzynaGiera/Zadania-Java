
public class Main5 {

	public static void main(String[] args) {
int numbers[]={-923,-239,-548,-139,-93,-854,-299,-30,-8,-91};
int max = numbers[0];
for(int i=0; i<10; i++)
{if(max<numbers[i])
{max=numbers[i];}
}
System.out.println("Największa liczba to: "+max);
	}

}
