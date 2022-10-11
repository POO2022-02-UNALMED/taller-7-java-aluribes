package comunicacion;

public class Alfabeto extends Pictograma {
	private String interpretacion;
	private String[] letras;
	
	// Constructor
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	// Get y Set
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	// Métodos

	public int cantidadLetras(){
		return letras.length;
	}

	@Override
	public String interpretacion(){
		return getInterpretacion();
	}

	public String toString(){
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}
}