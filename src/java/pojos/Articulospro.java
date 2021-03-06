package pojos;
// Generated 06-ene-2020 20:16:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Articulospro generated by hbm2java
 */
public class Articulospro  implements java.io.Serializable {


     private int idarticulo;
     private Categoriapro categoriapro;
     private String nombre;
     private Integer precio;
     private String materials;
     private String dimensions;
     private String text;
     private String foto1;
     private String foto2;
     private String foto3;
     private String foto4;
     private String foto5;
     private String pass;
     private Set parampros = new HashSet(0);
     private Set pedidospros = new HashSet(0);
     private Set wishlistpros = new HashSet(0);
     private Set carritopros = new HashSet(0);
     private Set reviewpros = new HashSet(0);

    public Articulospro() {
    }

	
    public Articulospro(int idarticulo) {
        this.idarticulo = idarticulo;
    }
    public Articulospro(int idarticulo, Categoriapro categoriapro, String nombre, Integer precio, String materials, String dimensions, String text, String foto1, String foto2, String foto3, String foto4, String foto5, String pass, Set parampros, Set pedidospros, Set wishlistpros, Set carritopros, Set reviewpros) {
       this.idarticulo = idarticulo;
       this.categoriapro = categoriapro;
       this.nombre = nombre;
       this.precio = precio;
       this.materials = materials;
       this.dimensions = dimensions;
       this.text = text;
       this.foto1 = foto1;
       this.foto2 = foto2;
       this.foto3 = foto3;
       this.foto4 = foto4;
       this.foto5 = foto5;
       this.pass = pass;
       this.parampros = parampros;
       this.pedidospros = pedidospros;
       this.wishlistpros = wishlistpros;
       this.carritopros = carritopros;
       this.reviewpros = reviewpros;
    }
   
    public int getIdarticulo() {
        return this.idarticulo;
    }
    
    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }
    public Categoriapro getCategoriapro() {
        return this.categoriapro;
    }
    
    public void setCategoriapro(Categoriapro categoriapro) {
        this.categoriapro = categoriapro;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getMaterials() {
        return this.materials;
    }
    
    public void setMaterials(String materials) {
        this.materials = materials;
    }
    public String getDimensions() {
        return this.dimensions;
    }
    
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public String getFoto1() {
        return this.foto1;
    }
    
    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }
    public String getFoto2() {
        return this.foto2;
    }
    
    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }
    public String getFoto3() {
        return this.foto3;
    }
    
    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }
    public String getFoto4() {
        return this.foto4;
    }
    
    public void setFoto4(String foto4) {
        this.foto4 = foto4;
    }
    public String getFoto5() {
        return this.foto5;
    }
    
    public void setFoto5(String foto5) {
        this.foto5 = foto5;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Set getParampros() {
        return this.parampros;
    }
    
    public void setParampros(Set parampros) {
        this.parampros = parampros;
    }
    public Set getPedidospros() {
        return this.pedidospros;
    }
    
    public void setPedidospros(Set pedidospros) {
        this.pedidospros = pedidospros;
    }
    public Set getWishlistpros() {
        return this.wishlistpros;
    }
    
    public void setWishlistpros(Set wishlistpros) {
        this.wishlistpros = wishlistpros;
    }
    public Set getCarritopros() {
        return this.carritopros;
    }
    
    public void setCarritopros(Set carritopros) {
        this.carritopros = carritopros;
    }
    public Set getReviewpros() {
        return this.reviewpros;
    }
    
    public void setReviewpros(Set reviewpros) {
        this.reviewpros = reviewpros;
    }




}


