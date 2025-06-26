/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package arboles.com.domain;

/**
 *
 * @author XPC
 */
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_comun")
    private String nombreComun;

    @Column(name = "tipo_flor")
    private String tipoFlor;

    @Column(name = "dureza_madera")
    private Integer durezaMadera;

    @Column(name = "altura_promedio")
    private Double alturaPromedio;

    @Column(name = "imagen_ruta")
    private String imagenRuta;

    private boolean activo;

    public Arbol() {
    }

    public Arbol(String nombreComun, boolean activo) {
        this.nombreComun = nombreComun;
        this.activo = activo;
    }
}
