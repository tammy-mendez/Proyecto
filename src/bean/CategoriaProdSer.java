/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "categoria_prod_ser")
@NamedQueries({
    @NamedQuery(name = "CategoriaProdSer.findAll", query = "SELECT c FROM CategoriaProdSer c"),
    @NamedQuery(name = "CategoriaProdSer.findByCodigoCategoria", query = "SELECT c FROM CategoriaProdSer c WHERE c.codigoCategoria = :codigoCategoria"),
    @NamedQuery(name = "CategoriaProdSer.findByNombre", query = "SELECT c FROM CategoriaProdSer c WHERE c.nombre = :nombre")})
public class CategoriaProdSer implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoCategoria")
    private Integer codigoCategoria;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCategoria")
    private Collection<ProductoServicio> productoServicioCollection;

    public CategoriaProdSer() {
    }

    public CategoriaProdSer(Integer codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public CategoriaProdSer(Integer codigoCategoria, String nombre) {
        this.codigoCategoria = codigoCategoria;
        this.nombre = nombre;
    }

    public Integer getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(Integer codigoCategoria) {
        Integer oldCodigoCategoria = this.codigoCategoria;
        this.codigoCategoria = codigoCategoria;
        changeSupport.firePropertyChange("codigoCategoria", oldCodigoCategoria, codigoCategoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Collection<ProductoServicio> getProductoServicioCollection() {
        return productoServicioCollection;
    }

    public void setProductoServicioCollection(Collection<ProductoServicio> productoServicioCollection) {
        this.productoServicioCollection = productoServicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCategoria != null ? codigoCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaProdSer)) {
            return false;
        }
        CategoriaProdSer other = (CategoriaProdSer) object;
        if ((this.codigoCategoria == null && other.codigoCategoria != null) || (this.codigoCategoria != null && !this.codigoCategoria.equals(other.codigoCategoria))) {
            return false;
        }
        return true;
    }

    /*  @Override
    public String toString() {
    return "bean.CategoriaProdSer[ codigoCategoria=" + codigoCategoria + " ]";
    }*/
    @Override
    public String toString() {
        return  "codigoCategoria=" + codigoCategoria + ", nombre=" + nombre;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
}
