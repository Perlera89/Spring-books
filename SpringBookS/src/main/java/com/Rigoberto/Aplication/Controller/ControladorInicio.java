package com.Rigoberto.Aplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Rigoberto.Aplication.Repository.Libro1Repository;
import com.Rigoberto.Aplication.Repository.Libro2Repository;
import com.Rigoberto.Aplication.Repository.Libro3Repository;
import com.Rigoberto.Aplication.Repository.Libro4Repository;
import com.Rigoberto.Aplication.Repository.Libro5Repository;


@Controller
public class ControladorInicio {
	// Inyecciones de los CrudRepository
	@Autowired
	Libro1Repository Libro1Repo;
	@Autowired
	Libro2Repository Libro2Repo;
	@Autowired
	Libro3Repository Libro3Repo;
	@Autowired
	Libro4Repository Libro4Repo;
	@Autowired
	Libro5Repository Libro5Repo;

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

	// Mapeo ingresar a los contactos desde barra de navegacion.
	@GetMapping("/Contactanos")
	public String MostrarContactos(Model m) {
		return "contacto";
	}

	// Mapeo volver al inicio desde contactos barra de navegacion
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

	// Mapeo para volver al inicio desde el login.
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

	// Mapeo Book1.
	@GetMapping("/Book1")
	public String Mostralibro1(Model m) {
		var Books1 = Libro1Repo.findAll();
		m.addAttribute("Libro1",Books1 );
		return "book1";
	}

	// Mapeo regresar al inicio Book1.
	@GetMapping("/Inicio1")
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

	// Mapeo contactos Book1.
	@GetMapping("/Contactos1")
	public String MostrarContactos() {
		return "contacto";
	}

	// Mapeo iniciar sesion Book1.
	@GetMapping("/Singup1")
	public String MostrarSingUP() {
		return "login";
	}


	// Mapeo boton regresar Book1.
	@GetMapping("/Regresa1")
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
	public String MostrarLibro2(Model m) {
		var Books2 = Libro2Repo.findAll();
		m.addAttribute("Libro2",Books2 );
		return "Book2";
	}

	// Mapeo de  regresar al inicio BOOK2.
	@GetMapping("/Inicio2")
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
	@GetMapping("/Contactos2")
	public String MostrarCONTACTOS() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK2.
	@GetMapping("/Singup2")
	public String MostrarSinGUP() {
		return "login";
	}



	// Mapeo boton regresar BOOK2.
	@GetMapping("/Regresa2")
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
	public String MostrarLibro3(Model m) {
		var Books3 = Libro3Repo.findAll();
		m.addAttribute("Libro3",Books3 );
		return "Book3";
	}

	// Mapeo de barra boton regresar al inicio BOOK3.
	@GetMapping("/Inicio3")
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
	@GetMapping("/Contactos3")
	public String MostrarCONTACTOs() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK3.
	@GetMapping("/Singup3")
	public String MostrarSINGUP() {
		return "login";
	}

	// Mapeo boton regresar BOOK3.
	@GetMapping("/Regresa3")
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
	public String MostrarLibro4(Model m) {
		var Books4 = Libro4Repo.findAll();
		m.addAttribute("Libro4",Books4 );
		return "Book4";
	}

	// Mapeo de barra boton regresar al inicio BOOK4.
	@GetMapping("/Inicio4")
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
	@GetMapping("/Contactos4")
	public String MostrandoContactos() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK4.
	@GetMapping("/Singup4")
	public String MostrandosSingUP() {
		return "login";
	}

	// Mapeo boton regresar BOOK4.
	@GetMapping("/Regresa4")
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
	public String MostrarLibro5(Model m) {
		var Books5 = Libro5Repo.findAll();
		m.addAttribute("Libro5",Books5 );
		return "Book5";
	}

	// Mapeo de barra boton regresar al inicio BOOK5.
	@GetMapping("/Inicio5")
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
	@GetMapping("/Contactos5")
	public String MostrandoAContactos() {
		return "contacto";
	}

	// Mapeo de barra bton iniciar sesion BOOK5.
	@GetMapping("/Singup5")
	public String MostrandoASingUP() {
		return "login";
	}

	// Mapeo boton regresar BOOK5.
	@GetMapping("/Regresa5")
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
