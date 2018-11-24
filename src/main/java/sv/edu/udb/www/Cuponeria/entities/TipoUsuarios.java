package sv.edu.udb.www.Cuponeria.entities;
// Generated 11-23-2018 05:14:17 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TipoUsuarios generated by hbm2java
 */
@Entity
@Table(name="tipo_usuarios"
    ,catalog="lacuponera"
)
public class TipoUsuarios  implements java.io.Serializable {


     private Integer id;
     private String descripcion;

    public TipoUsuarios() {
    }

    public TipoUsuarios(String descripcion) {
       this.descripcion = descripcion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="descripcion", nullable=false, length=150)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}

