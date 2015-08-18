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
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vladimir
 */
@Entity
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByCodigoReserva", query = "SELECT r FROM Reserva r WHERE r.codigoReserva = :codigoReserva"),
    @NamedQuery(name = "Reserva.findByCheckIn", query = "SELECT r FROM Reserva r WHERE r.checkIn = :checkIn"),
    @NamedQuery(name = "Reserva.findByCheckOut", query = "SELECT r FROM Reserva r WHERE r.checkOut = :checkOut"),
    @NamedQuery(name = "Reserva.findByCantPersonas", query = "SELECT r FROM Reserva r WHERE r.cantPersonas = :cantPersonas"),
    @NamedQuery(name = "Reserva.findByMontoTotal", query = "SELECT r FROM Reserva r WHERE r.montoTotal = :montoTotal"),
    @NamedQuery(name = "Reserva.findByMontoAbonado", query = "SELECT r FROM Reserva r WHERE r.montoAbonado = :montoAbonado")})
public class Reserva implements Serializable {
    @OneToMany(mappedBy = "codigoReserva")
    private Collection<ConsumoProSer> consumoProSerCollection;
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoReserva")
    private Integer codigoReserva;
    @Basic(optional = false)
    @Column(name = "checkIn")
    @Temporal(TemporalType.DATE)
    private Date checkIn;
    @Basic(optional = false)
    @Column(name = "checkOut")
    @Temporal(TemporalType.DATE)
    private Date checkOut;
    @Basic(optional = false)
    @Column(name = "cantPersonas")
    private int cantPersonas;
    @Basic(optional = false)
    @Column(name = "montoTotal")
    private int montoTotal;
    @Column(name = "montoAbonado")
    private Integer montoAbonado;
    @JoinColumn(name = "numHabitacion", referencedColumnName = "numero")
    @ManyToOne(optional = false)
    private Habitacion numHabitacion;
    @JoinColumn(name = "codigoCliente", referencedColumnName = "codigoCliente")
    @ManyToOne(optional = false)
    private Cliente codigoCliente;

    public Reserva() {
    }

    public Reserva(Integer codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Reserva(Integer codigoReserva, Date checkIn, Date checkOut, int cantPersonas, int montoTotal) {
        this.codigoReserva = codigoReserva;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cantPersonas = cantPersonas;
        this.montoTotal = montoTotal;
    }

    public Integer getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Integer codigoReserva) {
        Integer oldCodigoReserva = this.codigoReserva;
        this.codigoReserva = codigoReserva;
        changeSupport.firePropertyChange("codigoReserva", oldCodigoReserva, codigoReserva);
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        Date oldCheckIn = this.checkIn;
        this.checkIn = checkIn;
        changeSupport.firePropertyChange("checkIn", oldCheckIn, checkIn);
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        Date oldCheckOut = this.checkOut;
        this.checkOut = checkOut;
        changeSupport.firePropertyChange("checkOut", oldCheckOut, checkOut);
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        int oldCantPersonas = this.cantPersonas;
        this.cantPersonas = cantPersonas;
        changeSupport.firePropertyChange("cantPersonas", oldCantPersonas, cantPersonas);
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        int oldMontoTotal = this.montoTotal;
        this.montoTotal = montoTotal;
        changeSupport.firePropertyChange("montoTotal", oldMontoTotal, montoTotal);
    }

    public Integer getMontoAbonado() {
        return montoAbonado;
    }

    public void setMontoAbonado(Integer montoAbonado) {
        Integer oldMontoAbonado = this.montoAbonado;
        this.montoAbonado = montoAbonado;
        changeSupport.firePropertyChange("montoAbonado", oldMontoAbonado, montoAbonado);
    }

    public Habitacion getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Habitacion numHabitacion) {
        Habitacion oldNumHabitacion = this.numHabitacion;
        this.numHabitacion = numHabitacion;
        changeSupport.firePropertyChange("numHabitacion", oldNumHabitacion, numHabitacion);
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        Cliente oldCodigoCliente = this.codigoCliente;
        this.codigoCliente = codigoCliente;
        changeSupport.firePropertyChange("codigoCliente", oldCodigoCliente, codigoCliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoReserva != null ? codigoReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.codigoReserva == null && other.codigoReserva != null) || (this.codigoReserva != null && !this.codigoReserva.equals(other.codigoReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Reserva[ codigoReserva=" + codigoReserva + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Collection<ConsumoProSer> getConsumoProSerCollection() {
        return consumoProSerCollection;
    }

    public void setConsumoProSerCollection(Collection<ConsumoProSer> consumoProSerCollection) {
        this.consumoProSerCollection = consumoProSerCollection;
    }
    
}
