package service;

import org.apache.ibatis.session.SqlSession;

import model.Usuario;
import mybatis.MyBatisUtil;
import mybatis.mapper.UsuarioMapper;

public class UsuarioService implements UsuarioMapper {

	@Override
	public int registrarUsuario(Usuario u) {

		int rs = 0;
		SqlSession sqlsession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsuarioMapper um = sqlsession.getMapper(UsuarioMapper.class);
			rs = um.registrarUsuario(u);
			sqlsession.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en registrar : " + e);
		} finally {
			sqlsession.close();
		}
		return rs;
	}

	@Override
	public Usuario validarUsuario(Usuario u) {
		// TODO Auto-generated method stub

		Usuario usuarioValidado = new Usuario();
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsuarioMapper usuarioMapper = sqlSession.getMapper(UsuarioMapper.class);
			usuarioValidado = usuarioMapper.validarUsuario(u); 
			
		} catch (Exception e) {

			System.out.println("error en validarusuario - " + e.getMessage());

		} finally {
			// TODO: handle finally clause
			sqlSession.close();
			System.out.println("Bienvenido a su sesion : "+usuarioValidado.getNombre()+ " " + usuarioValidado.getApellido());
		}
		return usuarioValidado;
	}

}
