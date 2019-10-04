
public class Main13 {

    public static void main(String[] args) {
int points = 73;
if (points <0)
{System.out.println("Liczba punktów mniejsza niż 0");}
else if (points>100)
{System.out.println("Liczba punktów większa niż 100");}

String ocena;
if (points<40)
{ocena = "niedostateczna";}
else if (points<55)
{ocena = "dopuszczająca";}
else if (points<70)
{ocena = "dostateczna";}
else if (points<85)
{ocena = "dobra";}
else if (points<99)
{ocena = "bardzo dobra";}
else 
{ocena = "celująca";}
System.out.println("Wynik: ocena "+ocena);

    }

}
