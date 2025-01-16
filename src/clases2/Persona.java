package clases2;

import java.util.ArrayList;

public class Persona {
		private String Nombre; 
		private int Edad;
		private double Altura;
		private int bw; 
		private boolean veAnime; 
		private ArrayList favoriteAnimeList;
		
		
		public Persona(String nombre, int edad, double altura, int bw, boolean watchAnime) throws Exception {
			super();
			Nombre = nombre;
			if(edad < 0) {
				this.Edad = 0;
				throw new Exception("La edad no puede ser menor a 0");
			} else {
				Edad = edad;				
			}
			if(altura <= 0) {
				throw new Exception("La altura no puede ser menor o igual a 0");
			} else {
				Altura = altura;								
			} 
			if(bw <= 0) {
				throw new Exception("El peso no puede ser menor o igual a 0");
			} else {
				this.bw = bw;								
			}
			veAnime = watchAnime;
			if(veAnime) {
				this.favoriteAnimeList = new ArrayList<String>();
				this.favoriteAnimeList.add("86");
				this.favoriteAnimeList.add("Evangelion");
				this.favoriteAnimeList.add("Fate");
			}
		} 
		
		public Persona() {
			
		}
		
		public Persona(String Nombre) {
			this.Nombre = Nombre; 
			this.Edad = 18; 
			this.Altura = 1.60;
			
			
		}
		
		public void Cumpleaños(int newEdad) throws Exception {
			if(newEdad <= 0) {
				throw new Exception("No puedes cumplir 0 o menos años"); 
			} else {
				this.Edad += newEdad; 
			}
		}
		
		public void IMC () {
			if(this.bw <= 0) {
				System.out.println("No se puede calcular el imc con el peso en negativo");
			} else {
				double IMC = this.bw / Math.pow( this.Altura, 2 ); 				
				System.out.println("el IMC: " + IMC);
			}
		}
		
		public void favoriteAnime() {
			if(this.veAnime) {
				System.out.println("La lista de AnimeFavoritos es: " + this.favoriteAnimeList);
			} else {
				System.out.println("Esta persona no ve anime");
			}
		}
		
		public void train() {
			System.out.println("Yendo al gym...");
			System.out.println("*ENTRENANDO DURO*");
			this.bw += this.bw*2;
			System.out.println("Haz aumentado masa muscular: ");
			System.out.println("Peso actual: " + this.bw);
		}
		
		public void MostrarInfo() {
			System.out.println("Nombre: " + this.Nombre);
			System.out.println("Edad: " + this.Edad);
			System.out.println("Altura: " + this.Altura);
			System.out.println("Ve anime: " + this.veAnime);
		}
		
		
}
