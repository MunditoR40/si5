package uns.angel.si5.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ordenes_atencion")
public class OrdenAtencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrden;

    private LocalDate fechaAtencion;

    @Column(nullable = false)
    private String estado;

    private String observacion;

    private String prioridad;

    private String direccionAtencion;

    private Integer tiempoEstimado;

    // Relación con Técnico
    @ManyToOne
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;

    // Relación con Reclamo
    @OneToOne
    @JoinColumn(name = "id_reclamo")
    private Reclamo reclamo;

    // Constructor vacío
    public OrdenAtencion() {
    }

    // Métodos del diagrama

    public void registrarOrden() {
        System.out.println("Orden registrada.");
    }

    public void actualizarEstado() {
        System.out.println("Estado actualizado.");
    }

    public void asignarTecnico() {
        System.out.println("Técnico asignado.");
    }

    public void mostrarDetalle() {
        System.out.println("Mostrando detalle de la orden.");
    }

    // Getters y Setters

    public Long getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Long idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDireccionAtencion() {
        return direccionAtencion;
    }

    public void setDireccionAtencion(String direccionAtencion) {
        this.direccionAtencion = direccionAtencion;
    }

    public Integer getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Integer tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }
}
