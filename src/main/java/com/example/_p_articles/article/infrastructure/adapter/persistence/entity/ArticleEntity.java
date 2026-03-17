package com.example._p_articles.article.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "articulos")
@IdClass(ArticleIdEntity.class)
public class ArticleEntity {
    @Id
    private String idArticulo;
    @Id
    private String idLinea;
    @Id
    private Integer artEmpresa;
    @Column(name = "desc_promo")
    private double descPromo;
    private String descripcion;
    @Column(name = "precio1")
    private double precio;
    @Column(name = "alto_articulo")
    private double medidaProductoAlto;
    @Column(name = "ancho_articulo")
    private double medidaProductoAncho;
    @Column(name = "medidas_imp")
    private String areaImpresion;
    @Column(name = "opc_web")
    private String web;
    @Column(name = "opc_promo")
    private String productoPromocion;
    @Column(name = "opc_nuevo")
    private String productoNuevo;
    @Column(name = "opc_unico")
    private String productoUnico;
    @Column(name = "nombre_artd")
    private String nombreArticulo;
    @Column(name = "alto_caja")
    private double altoCaja;
    @Column(name = "ancho_caja")
    private double anchoCaja;
    @Column(name = "largo_caja")
    private double largoCaja;
    @Column(name = "caja_peso")
    private String pesoCaja;
    @Column(name = "piezas")
    private int piezasCaja;
    private String origenMercancia;
    private String capacidad;
    private double profundidadArticulo;
    private String composicion;
    private String imagen;
    @Column(name = "imagen_esq")
    private String imagenDos;
    @Column(name = "imagen_esq_2")
    private String imagenTres;
    private Double costo;
    @Column(name = "iva")
    private String iva;
    private String opcDesc;
    @Column(name = "id_articulo2")
    private String idArticuloDos;
}
