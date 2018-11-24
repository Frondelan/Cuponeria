package sv.edu.udb.www.Cuponeria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sv.edu.udb.www.Cuponeria.entities.Promocion;
import sv.edu.udb.www.Cuponeria.repositories.PromocionRepository;


@Controller
@RequestMapping("/promocion")
public class PromocionController {

	@Autowired
	@Qualifier("PromocionRepository")
	PromocionRepository promocionRepository;
	
	
	@GetMapping("/list")
	public String listarPromocion(Model model) {
		model.addAttribute("lista",  promocionRepository.findAllByOrderByTituloOferta());
		return "administrador/listaPromociones";
	
	}
	
	@PreAuthorize("hasAuthority('ADMIN') OR hasAuthority('USER')")
	@GetMapping("/new")
	public String nuevoEditorial(Model model) {
		model.addAttribute("promo", new Promocion());
		
		return "adminEmpresa/registrarPromocion";
		
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping("/new")
	public String insertarPromocion(
			@Valid @ModelAttribute("promo") Promocion promo,
			BindingResult result, Model model,
			RedirectAttributes atributos) {
		
		if(result.hasErrors()) {
			model.addAttribute("promo", promo);
			return "adminEmpresa/registrarPromocion";
		}
		else {
			if(promocionRepository.existsById(promo.getCodigoPromocion().toString())) {
				return null;
			}
			else {
				promocionRepository.save(promo);
				atributos.addFlashAttribute("exito", "Promocion Guardada");
				return "redirect:/adminEmpresa/listaPromociones";
			}
			
		}
		
	}
	
	
	
	
}
