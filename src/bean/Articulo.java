/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tammy
 */
@Entity
@Table(name = "articulo")
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a"),
    @NamedQuery(name = "Articulo.findByCodigoArticulo", query = "SELECT a FROM Articulo a WHERE a.codigoArticulo = :codigoArticulo"),
    @NamedQuery(name = "Articulo.findByNombre", query = "SELECT a FROM Articulo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Articulo.findByCantidadStock", query = "SELECT a FROM Articulo a WHERE a.cantidadStock = :cantidadStock"),
    @NamedQuery(name = "Articulo.findByCantidadMinima", query = "SELECT a FROM Articulo a WHERE a.cantidadMinima = :cantidadMinima"),
    @NamedQuery(name = "Articulo.findByCodigoProveedor", query = "SELECT a FROM Articulo a WHERE a.codigoProveedor = :codigoProveedor")})
public class Articulo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoArticulo")
    private Integer codigoArticulo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "cantidadStock")
    private int cantidadStock;
    @Basic(optional = false)
    @Column(name = "cantidadMinima")
    private int cantidadMinima;
     @JoinColumn(name = "codigoProveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne(optional = false)
    private Proveedor codigoProveedor;

    public Articulo() {
    }

    public Articulo(Integer codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Articulo(Integer codigoArticulo, String nombre, int cantidadStock, int cantidadMinima) {
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.cantidadMinima = cantidadMinima;
      
    }

    public Integer getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Integer codigoArticulo) {
        Integer oldCodigoArticulo = this.codigoArticulo;
        this.codigoArticulo = codigoArticulo;
        changeSupport.firePropertyChange("codigoArticulo", oldCodigoArticulo, codigoArticulo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        int oldCantidadStock = this.cantidadStock;
        this.cantidadStock = cantidadStock;
        changeSupport.firePropertyChange("cantidadStock", oldCantidadStock, cantidadStock);
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        int oldCantidadMinima = this.cantidadMinima;
        this.cantidadMinima = cantidadMinima;
        changeSupport.firePropertyChange("cantidadMinima", oldCantidadMinima, cantidadMinima);
    }
/*
     public CategoriaProdSer getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(CategoriaProdSer codigoCategoria) {
        CategoriaProdSer oldCodigoCategoria = this.codigoCategoria;
        this.codigoCategoria = codigoCategoria;
        changeSupport.firePropertyChange("codigoCategoria", oldCodigoCategoria, codigoCategoria);
    }
    */
    public Proveedor getCodigoProveedor() {
        return codigoProveedor;
    }
  public void setCodigoProveedor(Proveedor codigoProveedor) {
        Proveedor oldCodigoProveedor = this.codigoProveedor;
        this.codigoProveedor = codigoProveedor;
        changeSupport.firePropertyChange("codigoProveedor", oldCodigoProveedor, codigoProveedor);
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoArticulo != null ? codigoArticulo.hashCode() : 0);
        return hash;
    }
  
  
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codigoArticulo == null && other.codigoArticulo != null) || (this.codigoArticulo != null && !this.codigoArticulo.equals(other.codigoArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Articulo[ codigoArticulo=" + codigoArticulo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    
}
