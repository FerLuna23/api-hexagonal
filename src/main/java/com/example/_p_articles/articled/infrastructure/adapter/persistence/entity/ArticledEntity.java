package com.example._p_articles.articled.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "articulos_d")
@IdClass(ArticledIdEntity.class)
public class ArticledEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArtd;
    @Id
    private String idArticulo;
    @Id
    private String idLinea;
    @Id
    private Integer artEmpresa;
    @Column(name = "modelo")
    private String color;
    private String detalle;
    @Column(name = "color_file")
    private String imagen;
    private String css;
    @Column(name = "cant_inven")
    private Integer inventario;
    @Column(name = "cant_apartado")
    private Integer cantApartado;
    @Column(name = "opc_web")
    private String webColor;
    @Column(name = "cant_disponible")
    private Integer cantDisponible;
}
