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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "orden_compra")
@NamedQueries({
    @NamedQuery(name = "OrdenCompra.findAll", query = "SELECT o FROM OrdenCompra o"),
    @NamedQuery(name = "OrdenCompra.findByCodigoOrden", query = "SELECT o FROM OrdenCompra o WHERE o.codigoOrden = :codigoOrden"),
    @NamedQuery(name = "OrdenCompra.findByCantidadPedida", query = "SELECT o FROM OrdenCompra o WHERE o.cantidadPedida = :cantidadPedida"),
    @NamedQuery(name = "OrdenCompra.findByCodigoProveedor", query = "SELECT o FROM OrdenCompra o WHERE o.codigoProveedor = :codigoProveedor"),
    @NamedQuery(name = "OrdenCompra.findByCodigoArticulo", query = "SELECT o FROM OrdenCompra o WHERE o.codigoArticulo = :codigoArticulo")})
public class OrdenCompra implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoOrden")
    private Integer codigoOrden;
    @Basic(optional = false)
    @Column(name = "cantidadPedida")
    private int cantidadPedida;
    @Basic(optional = false)
    @Column(name = "codigoProveedor")
    private int codigoProveedor;
    @Basic(optional = false)
    @Column(name = "codigoArticulo")
    private int codigoArticulo;

    public OrdenCompra() {
    }

    public OrdenCompra(Integer codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    public OrdenCompra(Integer codigoOrden, int cantidadPedida, int codigoProveedor, int codigoArticulo) {
        this.codigoOrden = codigoOrden;
        this.cantidadPedida = cantidadPedida;
        this.codigoProveedor = codigoProveedor;
        this.codigoArticulo = codigoArticulo;
    }

    public Integer getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(Integer codigoOrden) {
        Integer oldCodigoOrden = this.codigoOrden;
        this.codigoOrden = codigoOrden;
        changeSupport.firePropertyChange("codigoOrden", oldCodigoOrden, codigoOrden);
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        int oldCantidadPedida = this.cantidadPedida;
        this.cantidadPedida = cantidadPedida;
        changeSupport.firePropertyChange("cantidadPedida", oldCantidadPedida, cantidadPedida);
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        int oldCodigoProveedor = this.codigoProveedor;
        this.codigoProveedor = codigoProveedor;
        changeSupport.firePropertyChange("codigoProveedor", oldCodigoProveedor, codigoProveedor);
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        int oldCodigoArticulo = this.codigoArticulo;
        this.codigoArticulo = codigoArticulo;
        changeSupport.firePropertyChange("codigoArticulo", oldCodigoArticulo, codigoArticulo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOrden != null ? codigoOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCompra)) {
            return false;
        }
        OrdenCompra other = (OrdenCompra) object;
        if ((this.codigoOrden == null && other.codigoOrden != null) || (this.codigoOrden != null && !this.codigoOrden.equals(other.codigoOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.OrdenCompra[ codigoOrden=" + codigoOrden + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
