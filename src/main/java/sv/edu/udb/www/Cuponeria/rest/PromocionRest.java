package sv.edu.udb.www.Cuponeria.rest;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.edu.udb.www.Cuponeria.entities.Promocion;
import sv.edu.udb.www.Cuponeria.repositories.PromocionRepository;


@RestController
@RequestMapping("/api/promocion")
public class PromocionRest {

	@Autowired
	@Qualifier("PromocionRepository")
	PromocionRepository repositorio;

	@GetMapping()
	public List<Promocion> listarPromociones() {
		return repositorio.findAll();
	}

	@PostMapping()
	public ResponseEntity<?> insertarPromocion(@RequestBody @Valid Promocion promo) {
		if (!repositorio.existsById(promo.getCodigoPromocion().toString())) {
			repositorio.save(promo);
			return ResponseEntity.ok().body("Promocion insertado exitosamente");
		}
		return ResponseEntity.status(500).body("Ya existe una promocion con este codigo");

	}

	@PutMapping()
	public ResponseEntity<?> modificarPromociones(@RequestBody @Valid Promocion promo) {
		if (repositorio.existsById(promo.getCodigoPromocion().toString())) {
			repositorio.save(promo);
			return ResponseEntity.ok().body("Promocion modificada");
		}
		return ResponseEntity.status(404).body("Esta promocion no existe");

	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<?> eliminarPromocion(@PathVariable("codigo") Integer codigo) {
		try {
			if (repositorio.existsById(codigo.toString())) {
				repositorio.deleteById(codigo.toString());
				return ResponseEntity.ok().body("Promocion eliminada");
			}
			return ResponseEntity.status(404).body("No existe esta promocion");
		} catch (Exception e) {
			return ResponseEntity.status(500).body("No se puede eliminar");
		}
	}

	
}
