package com.Rigoberto.Aplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Rigoberto.Aplication.Repository.UsuarioRepository;

@Controller
public class ControladorInicio {
	// Iyecciones:
	@Autowired
	UsuarioRepository UsuarioRepo;

	// URL raiz de la aplicacion web.
	@GetMapping("/")
	public String MostrarHome(Model model) {
		// Datos de tipo dinamicos con th.
		model.addAttribute("Mensaje", "Spring Books");
		model.addAttribute("inicio", "Inicio");
		model.addAttribute("Contactos", "Contactanos");
		model.addAttribute("SingUp", "Iniciar Sesion");
		model.addAttribute("mejores", "Los mejores libros");
		model.addAttribute("para", "Para tus estudios");
		model.addAttribute("gratis", "Libros gratis para todos");
		model.addAttribute("publicamos", "Publicamos nuevos cada semana");
		model.addAttribute("busca", "Busca el libro que deseas");
		model.addAttribute("no", "No te preocupes por el pago");
		model.addAttribute("todos", "Todos los libros");
		return "index";
	}

	// Mapeo para regresar al incio, desde la barra de navegacion.
	@GetMapping("/Inicio")
	public String MostrarInicio(Model model) {
		// Datos de tipo dinamicos con th.
		model.addAttribute("Mensaje", "Spring Books");
		model.addAttribute("inicio", "Inicio");
		model.addAttribute("Contactos", "Contactanos");
		model.addAttribute("SingUp", "Iniciar Sesion");
		model.addAttribute("mejores", "Los mejores libros");
		model.addAttribute("para", "Para tus estudios");
		model.addAttribute("gratis", "Libros gratis para todos");
		model.addAttribute("publicamos", "Publicamos nuevos cada semana");
		model.addAttribute("busca", "Busca el libro que deseas");
		model.addAttribute("no", "No te preocupes por el pago");
		model.addAttribute("todos", "Todos los libros");
		return "index";
	}

	// Mapeo ingresar a los contactos.
	@GetMapping("/Contactanos")
	public String MostrarContactos(Model m) {
		return "contacto";
	}

	// Mapeo volver al inicio, luego de haber ingresado a contactos.
	@GetMapping("/Volver a inicio")
	public String Volver(Model model) {
		// Datos dinamicos con th.
		model.addAttribute("Mensaje", "Spring Books");
		model.addAttribute("inicio", "Inicio");
		model.addAttribute("Contactos", "Contactanos");
		model.addAttribute("SingUp", "Iniciar Sesion");
		model.addAttribute("mejores", "Los mejores libros");
		model.addAttribute("para", "Para tus estudios");
		model.addAttribute("gratis", "Libros gratis para todos");
		model.addAttribute("publicamos", "Publicamos nuevos cada semana");
		model.addAttribute("busca", "Busca el libro que deseas");
		model.addAttribute("no", "No te preocupes por el pago");
		model.addAttribute("todos", "Todos los libros");
		return "index";
	}

	// Mapeo ingresar al login.
	@GetMapping("/Login")
	public String MostrarLogin(Model m) {
		return "login";
	}

	// Mapeo del boton login ingresar.
	@GetMapping("/Redirigiendo")
	public String MostrarRedirigir(Model m) {
		return "index";
	}

	// Mapeo para volver al inicio despues de haber ingresado al login.
	@GetMapping("/Volver al inicio")
	public String VolverInicio(Model model) {
		// Datos dinamicos con th.
		model.addAttribute("Mensaje", "Spring Books");
		model.addAttribute("inicio", "Inicio");
		model.addAttribute("Contactos", "Contactanos");
		model.addAttribute("SingUp", "Iniciar Sesion");
		model.addAttribute("mejores", "Los mejores libros");
		model.addAttribute("para", "Para tus estudios");
		model.addAttribute("gratis", "Libros gratis para todos");
		model.addAttribute("publicamos", "Publicamos nuevos cada semana");
		model.addAttribute("busca", "Busca el libro que deseas");
		model.addAttribute("no", "No te preocupes por el pago");
		model.addAttribute("todos", "Todos los libros");
		return "index";
	}

	// Mapeo de libro1.
	@GetMapping("/Book1")
	public String Mostralibro1() {
		return "book1";
	}

	// Mapeo regresar al inicio Libro1.
	@GetMapping("/inicio")
	public String Mostrarinicio(Model model) {
		// Datos dinamicos con th.
		model.addAttribute("Mensaje", "Spring Books");
		model.addAttribute("inicio", "Inicio");
		model.addAttribute("Contactos", "Contactanos");
		model.addAttribute("SingUp", "Iniciar Sesion");
		model.addAttribute("mejores", "Los mejores libros");
		model.addAttribute("para", "Para tus estudios");
		model.addAttribute("gratis", "Libros gratis para todos");
		model.addAttribute("publicamos", "Publicamos nuevos cada semana");
		model.addAttribute("busca", "Busca el libro que deseas");
		model.addAttribute("no", "No te preocupes por el pago");
		model.addAttribute("todos", "Todos los libros");
		return "index";
	}

	// Mapeo contactos libro1.
	@GetMapping("/contactos")
	public String MostrarContactos() {
		return "contacto";
	}

	// Mapeo iniciar sesio libro1.
	@GetMapping("/SingUP")
	public String MostrarSingUP() {
		return "login";
	}
	
	//Mapeo boton descargar libro1.
	@GetMapping("/Descargando book1")
	public String DescargarBook1 () {
		return"Los 7 hábitos de la gente altamente efectiva de Stephen R. Covey.pdf";
	}
}
