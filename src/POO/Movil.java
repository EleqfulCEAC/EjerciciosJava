package POO;

import java.util.ArrayList;
import java.util.List;

public class Movil {
		public String Marca; 
		public String Modelo; 
		public int NmroSerie; 
		public String SO; 
		public boolean tactil;
		public String Color; 
		
		public List<String> Funcionaliades; 
		
		public Movil() {
			this.Marca = "";
			this.Modelo = "";
			this.NmroSerie = 0;
			this.Funcionaliades = new ArrayList<>();
			this.SO = "No tiene"; 
			System.out.println("Creamos un movil nuevo");
		}

		public Movil(String marca, String modelo, int nmroSerie, String sO, boolean tactil, String color,
				List<String> funcionaliades) {
			super();
			Marca = marca;
			Modelo = modelo;
			NmroSerie = nmroSerie;
			SO = sO;
			this.tactil = tactil;
			Color = color;
			Funcionaliades = funcionaliades;
		}

		
		}
		
		
		

