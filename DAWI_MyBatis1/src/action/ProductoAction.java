package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import model.Categoria;
import model.Producto;
import service.ProductoService;

public class ProductoAction extends ActionSupport {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private ArrayList<Categoria> listaCategorias;
	private ArrayList<Producto> listaProducto;
	private String filtroCat, mensaje;
	private Producto p;

	// PRODUCTOS
	
	public String registrarProducto() {
		
		int i = new ProductoService().registrarProducto(p);

		if (i == 0) {
			mensaje = "No se pudo registrar";
			addActionError("No se registro correctamente");
			return "error";
		} else {
			mensaje = "Registro exitoso";
			addActionMessage(mensaje);
		}

		return "ok";
	}

	public String listadoProductos() {
		listaProducto = new ProductoService().listarProductos();
		return "ok";
	}

	// CATEGORIA

	public String listadoCategoriasXfiltro() {
		listaCategorias = new ProductoService().filtrarCategorias(filtroCat);

		return "ok";
	}

	public String listadoCategorias() {
		listaCategorias = new ProductoService().listarCategorias();

		return "ok";
	}

	// GETTERS AND SETTERS
	
	public ArrayList<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public String getFiltroCat() {
		return filtroCat;
	}

	public void setFiltroCat(String filtroCat) {
		this.filtroCat = filtroCat;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}
}
