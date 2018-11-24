package sv.edu.udb.www.Cuponeria.entities;
// Generated 11-23-2018 05:14:17 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EstadoOferta generated by hbm2java
 */
@Entity
@Table(name="estado_oferta"
    ,catalog="lacuponera"
)
public class EstadoOferta  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set<Promocion> promocions = new HashSet<Promocion>(0);

    public EstadoOferta() {
    }

	
    public EstadoOferta(String descripcion) {
        this.descripcion = descripcion;
    }
    public EstadoOferta(String descripcion, Set<Promocion> promocions) {
       this.descripcion = descripcion;
       this.promocions = promocions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="Descripcion", nullable=false, length=100)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estadoOferta")
    public Set<Promocion> getPromocions() {
        return this.promocions;
    }
    
    public void setPromocions(Set<Promocion> promocions) {
        this.promocions = promocions;
    }




}


