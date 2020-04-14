package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaAlumnosControlador {

	// Propociona el formulario
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		System.out.println("HolaAlumnosControlador::procesarFormulario - Procesando ... ");
		return "HolaAlumnosSpring";
	}

	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		
		nombre += " es el mejor alumno";

		String mensajefinal = "¿Quién es el mejor alumno? " + nombre;

		modelo.addAttribute("mensajeClaro", mensajefinal);
		System.out.println(mensajefinal);

		return "HolaAlumnosSpring";
	}
}