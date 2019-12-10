/**
 * 
 */
package principal;
import clases.Rectangulo;
/**
 * Esta es la clase principal
 * @author MARIO LUZARDO
 *
 */
public class Principal {

	/**
	 * Este es el metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rec = new Rectangulo(5,4);/**aqui instanciamos la clase Rectangulo*/
		rec.mostrar();
		rec.validacion();
		rec.calcularArea();
		rec.calcularPerimetro();
		rec.desplazarRectanguloarriba(1);
		rec.desplazarRectanguloderecha(1);
		rec.mostrar();

	}
}
