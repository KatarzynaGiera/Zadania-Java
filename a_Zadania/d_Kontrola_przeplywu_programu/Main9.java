
public class Main9 {

    public static void main(String[] args) {
int n = 3;
for (int i = 1; i <= n; i++)
{
String row = "";
for (int j = 1; j <= n; j++) 
{if (i<j)
{row+= j+ " ";}
else
{row += "* ";}
}
System.out.print(row + "\n");
}

}}
