package com.example._p_articles.article.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ArticleModel {
    private String idArticulo;
    @JsonProperty("descuentoPromo")
    private double descPromo;
    private String descripcion;
    @JsonProperty("precioArticulo")
    private double precio;
    @JsonProperty("medidaAlto")
    private double medidaProductoAlto;
    @JsonProperty("medidaAncho")
    private double medidaProductoAncho;
    @JsonProperty("areaDeImpresion")
    private String areaImpresion;
    private String web;
    private String productoPromocion;
    private String productoNuevo;
    private String productoUnico;
    @JsonProperty("nombreDelArticulo")
    private String nombreArticulo;
    @JsonProperty("altoDeCaja")
    private double altoCaja;
    @JsonProperty("anchoDeCaja")
    private double anchoCaja;
    @JsonProperty("LargoDeCaja")
    private double largoCaja;
    @JsonProperty("pesoPorCaja")
    private String pesoCaja;
    @JsonProperty("piezasPorCaja")
    private int piezasCaja;
    private String origenMercancia;
    private String capacidad;
    private double profundidadArticulo;
    private String composicion;
    private String imagen;
    private String imagenDos;
    private String imagenTres;
    @JsonProperty("articuloDos")
    private String idArticuloDos;
    private String iva;
    private Double costo;
    private String opcDesc;
}
