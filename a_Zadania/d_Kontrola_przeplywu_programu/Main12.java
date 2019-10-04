
public class Main12 {

    public static void main(String[] args) {
int a = 4;
int b = 5;
int c = 6;
String tak = "Z podanych boków można zbudować trójkąt";
String nie = "Z podanych boków nie można zbudować trójkąta";
if(a+b<c)
{System.out.println(nie);}
else if (c+b<a)
{System.out.println(nie);}
else if (a+c<b)
{System.out.println(nie);}
else
{System.out.println(tak);}

    }

}
