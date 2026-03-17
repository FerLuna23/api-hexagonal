package com.example._p_articles.formprint.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "articulos_impresion")
@IdClass(FormPrintIdEntity.class)
public class FormPrintEntity {

    @Id
    private Integer idimpresion;

    @Id
    private String idArticulo;

    @Column(name = "id_impresion")
    private String descripcion;
}
