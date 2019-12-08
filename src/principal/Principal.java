/**
 * 
 */
package principal;
import clases.Rectangulo;
/**
 * @author ALICIA FIERRO
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rec = new Rectangulo(5,4);
		rec.mostrar();
		rec.validacion();
		rec.calcularArea();
		rec.calcularPerimetro();
		rec.desplazarRectanguloarriba(1);
		rec.desplazarRectanguloderecha(1);
		rec.mostrar();
		//Rectangulo rec2 = new Rectangulo();
		//rec2.mostrar();
		//rec2.validacion();
	}
}
