package uns.angel.si5.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tecnicos")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTecnico;

    @Column(nullable = false)
    private String nombres;

    private String especialidad;

    private String telefono;

    private String zonaAsignada;

    // Relación con OrdenAtencion
    @OneToMany(mappedBy = "tecnico")
    private List<OrdenAtencion> ordenes;

    // Constructor vacío
    public Tecnico() {
    }

    // Métodos del diagrama

    public void asignarOrden() {
        System.out.println("Orden asignada.");
    }

    public void actualizarEstado() {
        System.out.println("Estado actualizado.");
    }

    public void mostrarDatos() {
        System.out.println("Mostrando datos del técnico.");
    }

    public void atenderReclamo() {
        System.out.println("Reclamo atendido.");
    }

    // Getters y Setters

    public Long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(String zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }

    public List<OrdenAtencion> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<OrdenAtencion> ordenes) {
        this.ordenes = ordenes;
    }
}