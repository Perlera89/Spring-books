package com.Rigoberto.Aplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Rigoberto.Aplication.Repository.LibrosRepository;

@Controller
public class ControladorInicio {
	// Inyecciones:
	@Autowired
	LibrosRepository LibroRepo;

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
		return "Book1";
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

	// Mapeo boton descargar libro1.
	@GetMapping("/Descargando book1")
	public String DescargarBook1(Model m) {
		var MostrarDescarga = LibroRepo.findAll();
		m.addAttribute("Libros", MostrarDescarga);
		return "";
	}

	// Mapeo boton regresar libro1.
	@GetMapping("/RegresaInicio")
	public String RegresandoInicio(Model model) {
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

	// Mapeo BOOK2.
	@GetMapping("/Book2")
	public String MostrarLibro2() {
		return "Book2";
	}

	// Mapeo de barra boton regresar al inicio BOOK2.
	@GetMapping("/INICIO")
	public String MostrarINICIO(Model model) {
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

	// Mapeo de barra boton contactos BOOK2.
	@GetMapping("/CONTACTOS")
	public String MostrarCONTACTOS() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK2.
	@GetMapping("/SINgup")
	public String MostrarSinGUP() {
		return "login";
	}

	// Mapeo boton descargar BOOK2.
	@GetMapping("/Descargando book2")
	public String DescargarBook2() {
		return "libros/Desarrollo Personal/Los 7 hábitos de la gente altamente efectiva de Stephen R. Covey .pdf";
	}

	// Mapeo boton regresar BOOK2.
	@GetMapping("/Regresando al Inicio")
	public String RegresandoINicio(Model model) {
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

	// Mapeo BOOK3.
	@GetMapping("/Book3")
	public String MostrarLibro3() {
		return "Book3";
	}

	// Mapeo de barra boton regresar al inicio BOOK3.
	@GetMapping("/Regresando Al INICIO")
	public String MostrarINICIOO(Model model) {
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

	// Mapeo de barra boton contactos BOOK3.
	@GetMapping("/CONTACTANOs")
	public String MostrarCONTACTOs() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK3.
	@GetMapping("/SIN gup")
	public String MostrarSINGUP() {
		return "login";
	}

	// Mapeo boton descargar BOOK3.
	@GetMapping("/Descargando book3")
	public String DescargarBook3() {
		return "libros/Desarrollo Personal/Los 7 hábitos de la gente altamente efectiva de Stephen R. Covey .pdf";
	}

	// Mapeo boton regresar BOOK3.
	@GetMapping("/Regresando al INicio")
	public String RegresandoINIcio(Model model) {
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

	// Mapeo BOOK4.
	@GetMapping("/Book4")
	public String MostrarLibro4() {
		return "Book4";
	}

	// Mapeo de barra boton regresar al inicio BOOK4.
	@GetMapping("/RegresandoInicio")
	public String MostrandoInicio(Model model) {
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

	// Mapeo de barra boton contactos BOOK4.
	@GetMapping("/ContactaNOS")
	public String MostrandoContactos() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK4.
	@GetMapping("/SINGUP")
	public String MostrandosSingUP() {
		return "login";
	}

	// Mapeo boton regresar BOOK4.
	@GetMapping("/RegresandoINICIO")
	public String RegresandoAlInicio(Model model) {
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

	// Mapeo BOOK5.
	@GetMapping("/Book5")
	public String MostrarLibro5() {
		return "Book5";
	}

	// Mapeo de barra boton regresar al inicio BOOK5.
	@GetMapping("/RegresandoAInicio")
	public String MostrandoINICIO(Model model) {
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

	// Mapeo de barra boton contactos BOOK5.
	@GetMapping("/Contactandonos")
	public String MostrandoAContactos() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK5.
	@GetMapping("/SING UP")
	public String MostrandoASingUP() {
		return "login";
	}

	// Mapeo boton regresar BOOK5.
	@GetMapping("/RegresandoAINICIO")
	public String RegresandoAlIniciO(Model model) {
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

}
