import java.util.*;
public class Iterable {

	public static void main(String[] arg) {
	
		List<Integer> listaInt = new ArrayList<>();
	listaInt.add(100);
	listaInt.add(50);
	listaInt.add(234);
	listaInt.add(1243);
	
	Iterator i = listaInt.listIterator();
	//wyœwietlanie listy od góry
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	//wyœwietlanie listy od do³u
	while(((ListIterator)i).hasPrevious()) {
		System.out.println(((ListIterator)i).previous());
	}
	
	
	}
}
