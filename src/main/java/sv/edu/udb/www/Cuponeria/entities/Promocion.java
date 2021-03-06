package sv.edu.udb.www.Cuponeria.entities;
// Generated 11-23-2018 08:10:27 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Promocion generated by hbm2java
 */
@Entity
@Table(name="promocion"
    ,catalog="lacuponera"
)
public class Promocion  implements java.io.Serializable {


     private Integer codigoPromocion;
     private Empresas empresas;
     private String tituloOferta;
     private long precioRegular;
     private long precioOferta;
     private Date fechaInicio;
     private Date fechaFin;
     private Date fechaLimiteCupon;
     private int cantidadCupones;
     private String descripcion;
     private String url;
     private boolean estado;
     private Set<Cupones> cuponeses = new HashSet<Cupones>(0);

    public Promocion() {
    }

	
    public Promocion(Empresas empresas, String tituloOferta, long precioRegular, long precioOferta, Date fechaInicio, Date fechaFin, Date fechaLimiteCupon, int cantidadCupones, String descripcion, String url, boolean estado) {
        this.empresas = empresas;
        this.tituloOferta = tituloOferta;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaLimiteCupon = fechaLimiteCupon;
        this.cantidadCupones = cantidadCupones;
        this.descripcion = descripcion;
        this.url = url;
        this.estado = estado;
    }
    public Promocion(Empresas empresas, String tituloOferta, long precioRegular, long precioOferta, Date fechaInicio, Date fechaFin, Date fechaLimiteCupon, int cantidadCupones, String descripcion, String url, boolean estado, Set<Cupones> cuponeses) {
       this.empresas = empresas;
       this.tituloOferta = tituloOferta;
       this.precioRegular = precioRegular;
       this.precioOferta = precioOferta;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.fechaLimiteCupon = fechaLimiteCupon;
       this.cantidadCupones = cantidadCupones;
       this.descripcion = descripcion;
       this.url = url;
       this.estado = estado;
       this.cuponeses = cuponeses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="codigo_promocion", unique=true, nullable=false)
    public Integer getCodigoPromocion() {
        return this.codigoPromocion;
    }
    
    public void setCodigoPromocion(Integer codigoPromocion) {
        this.codigoPromocion = codigoPromocion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_empresa", nullable=false)
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    
    @Column(name="titulo_oferta", nullable=false, length=50)
    public String getTituloOferta() {
        return this.tituloOferta;
    }
    
    public void setTituloOferta(String tituloOferta) {
        this.tituloOferta = tituloOferta;
    }

    
    @Column(name="precio_regular", nullable=false, precision=10, scale=0)
    public long getPrecioRegular() {
        return this.precioRegular;
    }
    
    public void setPrecioRegular(long precioRegular) {
        this.precioRegular = precioRegular;
    }

    
    @Column(name="precio_oferta", nullable=false, precision=10, scale=0)
    public long getPrecioOferta() {
        return this.precioOferta;
    }
    
    public void setPrecioOferta(long precioOferta) {
        this.precioOferta = precioOferta;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_inicio", nullable=false, length=10)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_fin", nullable=false, length=10)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_limite_cupon", nullable=false, length=10)
    public Date getFechaLimiteCupon() {
        return this.fechaLimiteCupon;
    }
    
    public void setFechaLimiteCupon(Date fechaLimiteCupon) {
        this.fechaLimiteCupon = fechaLimiteCupon;
    }

    
    @Column(name="cantidad_cupones", nullable=false)
    public int getCantidadCupones() {
        return this.cantidadCupones;
    }
    
    public void setCantidadCupones(int cantidadCupones) {
        this.cantidadCupones = cantidadCupones;
    }

    
    @Column(name="descripcion", nullable=false, length=65535)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="url", nullable=false, length=100)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name="estado", nullable=false)
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="promocion")
    public Set<Cupones> getCuponeses() {
        return this.cuponeses;
    }
    
    public void setCuponeses(Set<Cupones> cuponeses) {
        this.cuponeses = cuponeses;
    }




}


