package pojos;
// Generated 06-ene-2020 20:16:15 by Hibernate Tools 4.3.1



/**
 * WishlistproId generated by hbm2java
 */
public class WishlistproId  implements java.io.Serializable {


     private int idcliente;
     private int idarticulo;

    public WishlistproId() {
    }

    public WishlistproId(int idcliente, int idarticulo) {
       this.idcliente = idcliente;
       this.idarticulo = idarticulo;
    }
   
    public int getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public int getIdarticulo() {
        return this.idarticulo;
    }
    
    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof WishlistproId) ) return false;
		 WishlistproId castOther = ( WishlistproId ) other; 
         
		 return (this.getIdcliente()==castOther.getIdcliente())
 && (this.getIdarticulo()==castOther.getIdarticulo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdcliente();
         result = 37 * result + this.getIdarticulo();
         return result;
   }   


}


