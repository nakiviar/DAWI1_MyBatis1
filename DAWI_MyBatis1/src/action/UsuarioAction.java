package action;

import com.opensymphony.xwork2.ActionSupport;

import mantenimientos.GestionUsuario;

import java.util.logging.*;
import model.Usuario;

public class UsuarioAction extends ActionSupport {

	/**
	 * Aqui se pondran los metodos que usaremos para manejar la logica del login El
	 * ActionSuport es para pode usar los ActionMessage
	 */
	private static final long serialVersionUID = 1L;

	private final static Logger LOGGER = Logger.getLogger("action.UsuarioAction");

	private String mensaje, usuario, clave;

	private Usuario u;

	// EXECUTE
	public String login() {
		if (usuario.isEmpty()) {
			addActionError("usuario vacio");

		}
		if (!usuario.matches("[a-zA-Z0-9_Ò—]+@peru\\.com")) {//-@gg.ez
			addActionError("Formato de correo no valido");

		}
		// backslash paara caracteres especiales usadas en pattern
		Usuario u2 = new Usuario();
		u2.setUsuario(usuario);
		u2.setClave(clave);

		GestionUsuario gu = new GestionUsuario();

		Usuario u = gu.validarUsuario(u2);
		
		if (u != null) {
			mensaje = "Credenciales correctos";
			addActionMessage("Bienvenid(a)"+u.getNombre());
			LOGGER.log(Level.INFO, mensaje);
			return "Bienvenido";
		} else {
			mensaje = "Usuario o clave incorrecto";
			addActionError(mensaje);
			LOGGER.log(Level.WARNING, mensaje);
			return "Error";
		}

	}

	// TAREA 1: Validar los datos del registro
	public String registrar() {
		System.out.println(u);
		/* Llamamos al metodo registrar */
		int i = new GestionUsuario().registrarUsuario(u);

		if (i == 0) {
			addActionError("No se registro correctamente");
		} else {
			addActionMessage("Usuario Registrado");
		}

		mensaje = "Registro exitoso";
		return "ok";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

}
