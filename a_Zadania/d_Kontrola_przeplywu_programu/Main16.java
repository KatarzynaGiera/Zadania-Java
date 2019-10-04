
public class Main16 {

    public static void main(String[] args) {
int x=420;
int y=168;
int a=x, b=y, c=0;
if (x<1 || y<1)
{System.out.print("Jeden z argumentów jest mniejszy niż 1");}
while (b != 0)
{c=a%b;
a=b;
b=c;
}
System.out.println("Dla liczb " +x+" i "+y+" GDC to: " + a);}
}
