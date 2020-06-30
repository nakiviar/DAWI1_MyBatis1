package service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import model.Categoria;
import model.Producto;
import mybatis.MyBatisUtil;
import mybatis.mapper.ProductoMapper;

public class ProductoService implements ProductoMapper{

	@Override
	public ArrayList<Categoria> listarCategorias() {

		ArrayList<Categoria> listarCategorias= null; // Default value
		/**    [PLANTILLA]   **/
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			listarCategorias = productoMapper.listarCategorias();
			
		}catch (Exception e) {
			System.out.println("Error en listarCategorias - "+ e.getMessage());
		}finally {
			sqlSession.close();
		}
		/**    [   FIN   ]   **/
		return listarCategorias;
	}

	@Override
	public ArrayList<Categoria> filtrarCategorias(String texto) {

		ArrayList<Categoria> filtrado= null; // Default value
		/**    [PLANTILLA]   **/
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			filtrado = productoMapper.filtrarCategorias(texto);
			
		}catch (Exception e) {
			System.out.println("Error en filtrarCategorias - "+ e.getMessage());
		}finally {
			sqlSession.close();
		}
		/**    [   FIN   ]   **/
		return filtrado;
	}

	@Override
	public ArrayList<Producto> listarProductos() {

		ArrayList<Producto> listaProductos= null; // Default value
		/**    [PLANTILLA]   **/
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ProductoMapper productoMapper = sqlSession.getMapper(ProductoMapper.class);
			listaProductos = productoMapper.listarProductos();
			
		}catch (Exception e) {
			System.out.println("Error en listarProductos - "+ e.getMessage());
		}finally {
			sqlSession.close();
		}
		/**    [   FIN   ]   **/
		return listaProductos;
	}

	@Override
	public int registrarProducto(Producto p) {
		int rs = 0;
		SqlSession sqlsession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ProductoMapper pm = sqlsession.getMapper(ProductoMapper.class);
			rs = pm.registrarProducto(p);
			sqlsession.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en registrar : " + e);
		} finally {
			sqlsession.close();
		}
		return rs;
	}
}
