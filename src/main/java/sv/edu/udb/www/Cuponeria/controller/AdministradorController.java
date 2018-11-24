package sv.edu.udb.www.Cuponeria.controller;

import java.util.Random;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.classmate.AnnotationConfiguration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sv.edu.udb.www.Cuponeria.entities.Empresas;
import sv.edu.udb.www.Cuponeria.entities.Promocion;
import sv.edu.udb.www.Cuponeria.entities.Rubros;
import sv.edu.udb.www.Cuponeria.entities.Usuarios;
import sv.edu.udb.www.Cuponeria.repositories.ClientesRepository;
import sv.edu.udb.www.Cuponeria.repositories.CuponesRepository;
import sv.edu.udb.www.Cuponeria.repositories.EmpresasRepository;
import sv.edu.udb.www.Cuponeria.repositories.RubrosRepository;
import sv.edu.udb.www.Cuponeria.repositories.UsuariosRepository;
//import sv.edu.udb.www.Cuponeria.utils.Correo;
//import sv.edu.udb.www.Cuponeria.utils.SecurityUtils;


@Controller
@PreAuthorize("hasAuthority('Administrador')")
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	@Qualifier("EmpresasRepository")
	EmpresasRepository empresasRepository;

	@Autowired
	@Qualifier("RubrosRepository")
	RubrosRepository rubrosRepository;

	@Autowired
	@Qualifier("UsuariosRepository")
	UsuariosRepository usuariosRepository;

	@Autowired
	@Qualifier("ClientesRepository")
	ClientesRepository clientesRepository;
	
	@Autowired
	@Qualifier("CuponesRepository")
	CuponesRepository cuponesRepository;
	
	
	@GetMapping("/inicio")
	public String inicioAdmin() {
		
		return "/administrador/principal";

	}




}
