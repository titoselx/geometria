/**
 * Clase rectángulo
 * @author Aarón Titos Checa
 * @version 1.2
 */
public class Rectangulo_ATC extends FiguraGeometrica_ATC {
	private double l1;
	private double l2;
	
	/**
	 * Asigna la longitud de los lados
	 * @param tipoFigura Tipo de la figura
	 * @param lG Lado 1
	 * @param lP Lado 2
	 */
	public Rectangulo_ATC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}


	@Override
	public double area() {
		return l1 * l2;
	}
/**
 * 
 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
