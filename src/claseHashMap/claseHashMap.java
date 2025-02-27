package claseHashMap;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class claseHashMap {

	public static void main(String[] args) {
		HashMap<String, Number> dicc = new HashMap<>();
		String frase = "Hola buenos dias";
		Number Counter = 0;
		List<String> key = new ArrayList<>();
		dicc.keySet();
		
		for (int i = 0; i < frase.length(); i++) {
			String value = frase.charAt(i) + "";
			key.add(value);
		}
		
		System.out.println(key);
		
		for (String aux : key) {
			
		}
	}

}
