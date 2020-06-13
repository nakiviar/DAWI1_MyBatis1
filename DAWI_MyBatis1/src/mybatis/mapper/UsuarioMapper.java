package mybatis.mapper;

import model.Usuario;

public interface UsuarioMapper {

	public int registrarUsuario(Usuario u);
	public Usuario validarUsuario(Usuario u);
}
