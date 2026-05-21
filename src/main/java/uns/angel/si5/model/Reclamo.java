package uns.angel.si5.model;

import java.util.Date;

@Entity
@Table(name = "reclamos")
public class Reclamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReclamo;

    @Column(nullable = false)
    private String tipoReclamo;

    @Column(nullable = false, length = 300)
    private String descripcion;

    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @Column(nullable = false)
    private String estadoInicial;

    // Relación con Usuario
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    // Constructor vacío
    public Reclamo() {
    }

    // Método del diagrama
    public boolean validarTipoReclamo() {

        return tipoReclamo.equalsIgnoreCase("Agua")
                || tipoReclamo.equalsIgnoreCase("Desagüe")
                || tipoReclamo.equalsIgnoreCase("Facturación")
                || tipoReclamo.equalsIgnoreCase("Cortes");
    }

    // Método del diagrama
    public OrdenAtencion generarOrdenAtencion() {

        OrdenAtencion orden = new OrdenAtencion();

        return orden;
    }

    // Getters y Setters

    public Long getIdReclamo() {
        return idReclamo;
    }

    public void setIdReclamo(Long idReclamo) {
        this.idReclamo = idReclamo;
    }

    public String getTipoReclamo() {
        return tipoReclamo;
    }

    public void setTipoReclamo(String tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
