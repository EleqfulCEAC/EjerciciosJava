package ArrayListEjemplos;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEjemplos {

	public static void main(String[] args) {
			List<Integer> lst = new ArrayList<>();
			lst.add(1);
			lst.add(2);
			lst.add(6);
			lst.add(1);
			lst.add(8);
			lst.add(1);
			lst.add(5);
			lst.add(1);
			lst.add(4);
			System.out.println(lst);
		
			int first  = lst.indexOf(1);
			lst.remove(first);
			int last = lst.lastIndexOf(1);
			lst.remove(last);
			System.out.println(lst);
			
			for (Integer integer : lst) {
				if(integer == 1) {
					lst.remove(integer);
					break;
					
				}
			}
			
			System.out.println(lst);
		
	}

}
