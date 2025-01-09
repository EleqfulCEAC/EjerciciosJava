package POO;

import java.util.ArrayList;
import java.util.List;

public class TemaClases {

	public static void main(String[] args) {
		Movil movil1 = new Movil(); 
		
		System.out.println(movil1.SO);
		System.out.println(movil1.Funcionaliades);
		movil1.Funcionaliades.add("llamar");
		System.out.println(movil1.Funcionaliades);
		
		List IphoneFuncionalidades = new ArrayList<>();
		
		IphoneFuncionalidades.add("tomar fotos");
		IphoneFuncionalidades.add("Apple pay");
		IphoneFuncionalidades.add("Facetime");
		
		Movil movil2 = new Movil("Iphone", "ProMax", 52414, "IOS", true, "Black", IphoneFuncionalidades );
		
		System.out.println(movil2.Color);
		System.out.println(movil2.Funcionaliades);
		System.out.println(movil1.Marca.toUpperCase());
		System.out.println(movil1.tactil);
		
		for (Object object : IphoneFuncionalidades) {
			
		}

	}

}
