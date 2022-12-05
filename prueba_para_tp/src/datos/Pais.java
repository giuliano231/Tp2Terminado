package datos;

public class Pais {
	
	
	private String nombre;
	private boolean clasificado;
	private char grupo;
	public Selección selección;
	private int posibilidades;
	private String abreviación;
	
		
	public Pais(String nombre, boolean clasificado, char grupo, Selección selección, int posibilidades, String abreviación) {
		super();
		this.nombre = nombre;
		this.clasificado = clasificado;
		this.grupo = grupo;
		this.selección = selección;
		this.posibilidades = posibilidades;
	    this.abreviación = abreviación;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isClasificado() {
		return clasificado;
	}
	public void setClasificado(boolean clasificado) {
		this.clasificado = clasificado;
	}
	public  char getGrupo() {
		return grupo;
	}
	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	public Selección getSelección() {
		return selección;
	}
	public void setSelección(Selección selección) {
		this.selección = selección;
	}

	public int getPosibilidades() {
		return posibilidades;
	}
	public void setPosibilidades(int posibilidades) {
		this.posibilidades = posibilidades;
	}
	

	public String getAbreviación() {
		return abreviación;
	}

	public void setAbreviación(String abreviación) {
		this.abreviación = abreviación;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", clasificado=" + clasificado + ", grupo=" + grupo + ", selección="
				+ selección + ", posibilidades=" + posibilidades + ", abreviación=" + abreviación + "]";
	}


	
	
	
	
	
}
