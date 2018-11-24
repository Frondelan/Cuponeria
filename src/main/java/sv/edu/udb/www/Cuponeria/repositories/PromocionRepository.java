package sv.edu.udb.www.Cuponeria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sv.edu.udb.www.Cuponeria.entities.Promocion;


@Repository("PromocionRepository")
public interface PromocionRepository extends JpaRepository<Promocion, String> {
	public abstract List<Promocion> findByTituloOferta(String tituloOferta);
	public abstract List<Promocion> findAllByOrderByTituloOferta();
	
	public abstract Promocion findByCodigoPromocion(Integer codigoPromocion);

}
	