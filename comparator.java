package eclipse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator{

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(76);
		list1.add(54);
		list1.add(98);
		list1.add(93);
		list1.add(48);
		list1.add(34);
		
		
		Comparator<Integer> com = new comimp();
		Collections.sort(list1,com);
		for(int i : list1) {
			System.out.println(i);
		}
	}

}

