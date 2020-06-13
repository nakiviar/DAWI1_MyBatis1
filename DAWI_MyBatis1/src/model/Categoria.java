package model;

public class Categoria {

	public int idcat;
	public String descripcion;
	
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [idcat=" + idcat + ", descripcion=" + descripcion + "]";
	}
}
