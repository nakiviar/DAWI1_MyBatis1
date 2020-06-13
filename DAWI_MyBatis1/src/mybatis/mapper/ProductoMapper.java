package mybatis.mapper;

import java.util.ArrayList;

import model.Categoria;
import model.Producto;
import model.Usuario;

public interface ProductoMapper {
	
	public ArrayList<Categoria> listarCategorias();
	
	public ArrayList<Categoria> filtrarCategorias(String texto);

	public ArrayList<Producto> listarProductos();
	
	public int registrarProducto(Producto p);
	
}
