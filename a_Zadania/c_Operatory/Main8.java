
public class Main8 {

	public static void main(String[] args) {
int black =16;
int white =15;
boolean blackOrWhite = black<white;
//blackOrWhite ma wartość false ponieważ 16 nie jest mniejsze niż 15
boolean good = true;
boolean bad = false;
boolean goodOrBad = good || bad;
//goodOrBad ma wartość true, ponieważ przynajmniej jedna (good) ma wartość true
boolean comparison = blackOrWhite && goodOrBad;
//comparison ma wartość false, ponieważ nie każda ze stron jest prawdą
System.out.println(blackOrWhite);
System.out.println(goodOrBad);
System.out.println(comparison);

	}

}
