
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);
//dodanie 1 do a (2) i wypisanie na ekranie a
		System.out.println(a++);
//wypisanie na ekranie a (2) i dodanie 1 do a (3)
		System.out.println(a);
//wypisanie na ekranie a (3)
		b=a++;
//przypisanie do b a (3) i dodanie 1 do a (4)
		System.out.println(b);
//wypisanie na ekranie b (3)
		b=++a;
//dodanie do a 1 (5) i przypisanie do b (5)
		System.out.println(++a);
//dodanie do a 1 (6) i wypisanie a na ekranie (6)
	}

}
