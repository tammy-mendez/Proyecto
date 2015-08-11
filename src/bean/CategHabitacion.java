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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Vladimir
 */
@Entity
@Table(name = "categ_habitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategHabitacion.findAll", query = "SELECT c FROM CategHabitacion c"),
    @NamedQuery(name = "CategHabitacion.findByCodigoCategoria", query = "SELECT c FROM CategHabitacion c WHERE c.codigoCategoria = :codigoCategoria"),
    @NamedQuery(name = "CategHabitacion.findByNombre", query = "SELECT c FROM CategHabitacion c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CategHabitacion.findByCostoxnoche", query = "SELECT c FROM CategHabitacion c WHERE c.costoxnoche = :costoxnoche")})
public class CategHabitacion implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "costoxnoche")
    private int costoxnoche;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCategoria")
    private Collection<Habitacion> habitacionCollection;

    public CategHabitacion() {
    }

    public CategHabitacion(Integer codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public CategHabitacion(Integer codigoCategoria, String nombre, int costoxnoche) {
        this.codigoCategoria = codigoCategoria;
        this.nombre = nombre;
        this.costoxnoche = costoxnoche;
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

    public int getCostoxnoche() {
        return costoxnoche;
    }

    public void setCostoxnoche(int costoxnoche) {
        int oldCostoxnoche = this.costoxnoche;
        this.costoxnoche = costoxnoche;
        changeSupport.firePropertyChange("costoxnoche", oldCostoxnoche, costoxnoche);
    }

    @XmlTransient
    public Collection<Habitacion> getHabitacionCollection() {
        return habitacionCollection;
    }

    public void setHabitacionCollection(Collection<Habitacion> habitacionCollection) {
        this.habitacionCollection = habitacionCollection;
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
        if (!(object instanceof CategHabitacion)) {
            return false;
        }
        CategHabitacion other = (CategHabitacion) object;
        if ((this.codigoCategoria == null && other.codigoCategoria != null) || (this.codigoCategoria != null && !this.codigoCategoria.equals(other.codigoCategoria))) {
            return false;
        }
        return true;
    }

    /*  @Override
    public String toString() {
    return "bean.CategHabitacion[ codigoCategoria=" + codigoCategoria + " ]";
    }*/
    @Override
    public String toString() {
        return  "codigoCategoria=" + codigoCategoria + ", nombre=" + nombre + ", costoxnoche=" + costoxnoche;
    }
    

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
