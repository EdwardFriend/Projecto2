package clases;
import java.util.Scanner;
/**
 * Esta es la clase Rectangulo en la que se instancia la clase Coordenada
 * @author MARIO LUZARDO
 *
 */
public class Rectangulo{
	
	Coordenada vector []=new Coordenada[4];/*se instancia la clase Coordenada con un vector que nos
	                                        *permitira manejar bien los vertices para crear un rectangulo*/

	public Rectangulo() {
		/*se crea un constructor vacio en el que crearemos los rectangulos
		 * partiendo de sus vertices
		 */
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
		/*se crea un constructor parametrico para formar el rectangulo
		 *usando la base y altura del mismo
		 */
		for(int i=0;i<vector.length;i++) {
			vector[i]=new Coordenada();
		}
		vector[1].desplazarDerecha(base);
		vector[2].desplazarArriba(altura);
		vector[3].desplazarDerecha(base);
		vector[3].desplazarArriba(altura);
	}
	public void mostrar() {
		/*el metodo mostrar nos permite visualizar los pares ordenados que
		 * conforman los vertices de nuestro rectangulo
		 */
		for(int i=0;i<vector.length;i++) {
			vector[i].mostrar();
		}
	}
	public void validacion() {
		/*el metodo validacion nos permite analizar que los valores ingresados para cada par ordenado
		 * formen realmente un rectangulo, de otro modo estos se encuentran formando cualquier otro poligono
		 */
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
		/*este metodo nos permite calcular el area del rectangulo que hemos creado*/
		System.out.println((vector[1].getX().getPuntoa())*vector[3].getX().getPuntob());
	}
	public void calcularPerimetro() {
		/*este metodo nos permite calcular el perimetro del rectangulo que hemos creado*/
		System.out.println(2*(vector[1].getX().getPuntoa())+2*(vector[3].getX().getPuntob()));
	}
	public void desplazarRectanguloderecha(int a) {
		/*con este metodo podemos desplazar el rectangulo a la derecha en el plano cartesiano*/
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarDerecha(a);
		}
	}
	public void desplazarRectanguloizquierda(int a) {
		/*con este metodo podemos desplazar el rectangulo a la izquierda en el plano cartesiano*/
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarIzquierda(a);
		}
	}
	public void desplazarRectanguloarriba(int a) {
		/*con este metodo podemos desplazar el rectangulo hacia arriba en el plano cartesiano*/
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarArriba(a);
		}
	}
	public void desplazarRectanguloabajo(int a) {
		/*con este metodo podemos desplazar el rectangulo hacia abajo en el plano cartesiano*/
		for(int i=0;i<vector.length;i++) {
			vector[i].desplazarAbajo(a);
		}
	}
}