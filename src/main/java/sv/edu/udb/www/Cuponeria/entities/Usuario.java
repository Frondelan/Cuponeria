package sv.edu.udb.www.Cuponeria.entities;
// Generated 11-23-2018 05:14:17 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="lacuponera"
)
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private Empresa empresa;
     private Roles roles;
     private String nombre;
     private String apellido;

    public Usuario() {
    }

	
    public Usuario(Roles roles, String nombre, String apellido) {
        this.roles = roles;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Usuario(Empresa empresa, Roles roles, String nombre, String apellido) {
       this.empresa = empresa;
       this.roles = roles;
       this.nombre = nombre;
       this.apellido = apellido;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_empresa")
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_roles", nullable=false)
    public Roles getRoles() {
        return this.roles;
    }
    
    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    
    @Column(name="Nombre", nullable=false, length=100)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="Apellido", nullable=false, length=100)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




}

