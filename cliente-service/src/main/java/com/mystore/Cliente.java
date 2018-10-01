package com.mystore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{

    @Id
    @NotNull
    private String dni;

    @NotEmpty
    @Column(name="nombre")
    private String nombre;

    @NotEmpty
    @Column(name="apellidos")
    private String apellidos;

    @Column(name="telefono")
    private String telefono;

    @NotEmpty
    @Column(name="credito")
    private Double credito;

}
