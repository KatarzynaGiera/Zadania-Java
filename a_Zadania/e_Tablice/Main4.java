
public class Main4 {

	public static void main(String[] args) {
int numbers[]={293,130,203,10,495,15,294,3,430,129};
int sumodd=0;
for (int i=0; i<10; i++)
{
if (numbers[i]%2==0)
{System.out.println(numbers[i]);}
else
{sumodd+=numbers[i];}
}
System.out.println("Suma liczb nieparzystych to: " + sumodd);
	}

}
