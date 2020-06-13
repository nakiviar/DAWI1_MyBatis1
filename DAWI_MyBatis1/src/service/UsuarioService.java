package service;

import org.apache.ibatis.session.SqlSession;

import model.Usuario;
import mybatis.MyBatisUtil;
import mybatis.mapper.UsuarioMapper;

public class UsuarioService implements UsuarioMapper{

	@Override
	public int registrarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario validarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		
		Usuario u2=null;
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsuarioMapper um= session.getMapper(UsuarioMapper.class);
			u2=um.validarUsuario(u);
		} catch (Exception e) {

			System.out.println("error en validarusuario :"+e.getMessage());
			
		} 
		finally {
			// TODO: handle finally clause
			session.close();
		}
		return u;
	}

}
