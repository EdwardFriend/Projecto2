/**
 * 
 */
package clases;

/**
 * Esta es la clase Linea
 * @author MARIO LUZARDO
 *
 */
public class Vertice {
	private int puntoA;//Este es el atributo puntoA de tipo entero
	private int puntoB;//Este es el atributo puntoB de tipo entero
	public Vertice() {
		//Este es un constructor vacio en el que se inicializan los atributos con valor 0
		puntoA=0;
		puntoB=0;
	}
	public Vertice(int puntoA, int puntoB) {
		//Este es un constructor parametrico para darle valores a los atributos
		this.puntoA=puntoA;
		this.puntoB=puntoB;
	}
	public int getPuntoa() {
		//El getter getPuntoa me permite acceder al atributo puntoA
		//para mostrarlo por pantalla
		return this.puntoA;
	}
	public void setPuntoa(int puntoA) {
		//El setter getPuntoa me permite acceder al atributo puntoA
		//para modificar su valor
		this.puntoA=puntoA;
	}
	public int getPuntob() {
		//El getter getPuntob me permite acceder al atributo puntoB
		//para mostrarlo por pantalla
		return this.puntoB;
	}
	public void setPuntob(int puntoB) {
		//El setter getPuntob me permite acceder al atributo puntoB
		//para modificar su valor
		this.puntoB=puntoB;
	}
}