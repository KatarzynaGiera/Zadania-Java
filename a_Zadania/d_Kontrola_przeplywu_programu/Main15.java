
public class Main15 {

    public static void main(String[] args) {

//obliczenie silni w pętli for
int x=3;
int factorial= 1;
for (int i=1;i<=x;i++)
{factorial *= i;
}
System.out.println("Silnia "+x+"! to "+factorial+".");

//obliczenie silni w pętli while
factorial=1;
int i=1;
while (i<=x)
{factorial*=i;
i++;}
System.out.println("Silnia "+x+"! to "+factorial+".");

}

}
