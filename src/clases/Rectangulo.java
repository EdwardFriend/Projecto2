package clases;

public class Rectangulo{
	Coordenada vector []=new Coordenada[4];
	public Rectangulo() {
		for(int i=0;i<vector.length;i++) {
			
			vector[i]=new Coordenada();
		}
	}

	public Rectangulo(int base, int altura) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=new Coordenada();
		}
		vector[1].desplazarDerecha(base);
		vector[2].desplazarArriba(altura);
		vector[3].desplazarDerecha(base);
		vector[3].desplazarArriba(altura);
	}
	public void mostrar() {
		for(int i=0;i<vector.length;i++) {
			vector[i].mostrar();
		}
	}
}