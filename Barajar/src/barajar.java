import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class barajar {
	
	static Random rand = new Random();
	
	public static void main(String[] args) {
		
		
		ArrayDeque<String> ad = new ArrayDeque<>();
		
		
		
		ad.add("1");
		ad.add("2");
		ad.add("3");
		ad.add("4");
		ad.add("5");
		ad.add("6");
		ad.add("7");
		ad.add("8");
		ad.add("9");
		ad.add("10");
		
		
		ad=barajar(ad);
		
		System.out.println(ad);
		
	}

	private static ArrayDeque<String> barajar(ArrayDeque<String> ad) {
		ArrayList<String> as = new ArrayList<>();
		ArrayList<String> as2 = new ArrayList<>();
		as.addAll(ad);
		as2.addAll(ad);
		for(int i=0;i<as2.size();i++) {
			as.remove(as2.get(i));
			as.add(rand.nextInt(ad.size()),as2.get(i));
			
		}
		
		ad.clear();
		ad.addAll(as);
		
		return ad;
		
	}

}
