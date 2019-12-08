package clases;
import java.util.Scanner;
public class Rectangulo{
	
	Coordenada vector []=new Coordenada[4];

	public Rectangulo() {
		Scanner in = new Scanner(System.in);
		int x=0;
		int y=0;
		for(int i=0;i<vector.length;i++) {
			System.out.println("Ingrese el valor de x para la coordenada "+(i+1)+" :");
		    x=in.nextInt();
		    System.out.println("Ingrese el valor de y para la coordenada "+(i+1)+" :");
		    y=in.nextInt();
			vector[i]=new Coordenada(x,y);
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
	public void validacion() {
		if((vector[2].getX().getPuntob())==(vector[3].getX().getPuntob())) {
			if((vector[1].getX().getPuntoa())==(vector[3].getX().getPuntoa())) {
				if((vector[0].getX().getPuntoa())==(vector[2].getX().getPuntoa())) {
					if((vector[0].getX().getPuntob())==(vector[1].getX().getPuntob())) {
						if((vector[1].getX().getPuntoa())!=(vector[2].getX().getPuntob())) {
							System.out.println("es un rectangulo");
						}
						else {
							System.out.println("es un cuadrado");
						}
					}
					else {
						System.out.println("es un poligono indefinido");
					}
				}
				else {
					System.out.println("es un poligono indefinido");
				}
			}
			else {
				System.out.println("es un poligono indefinido");
			}
		}
		else {
			System.out.println("es un poligono indefinido");
		}
	}
	public void calcularArea() {
		System.out.println((vector[1].getX().getPuntoa())*vector[3].getX().getPuntob());
	}
	public void calcularPerimetro() {
		System.out.println(2*(vector[1].getX().getPuntoa())+2*(vector[3].getX().getPuntob()));
	}
	public void desplazarRectanguloderecha(int a) {
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarDerecha(a);
		}
	}
	public void desplazarRectanguloizquierda(int a) {
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarIzquierda(a);
		}
	}
	public void desplazarRectanguloarriba(int a) {
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarArriba(a);
		}
	}
	public void desplazarRectanguloabajo(int a) {
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarAbajo(a);
		}
	}
}