/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentação;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author josue.junior
 */
@Entity
@Table(name = "carros", catalog = "locadora", schema = "")
@NamedQueries({
    @NamedQuery(name = "Carros.findAll", query = "SELECT c FROM Carros c"),
    @NamedQuery(name = "Carros.findByIdcarros", query = "SELECT c FROM Carros c WHERE c.idcarros = :idcarros"),
    @NamedQuery(name = "Carros.findByDescricao", query = "SELECT c FROM Carros c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Carros.findByModelo", query = "SELECT c FROM Carros c WHERE c.modelo = :modelo")})
public class Carros implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcarros")
    private Integer idcarros;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "modelo")
    private String modelo;

    public Carros() {
    }

    public Carros(Integer idcarros) {
        this.idcarros = idcarros;
    }

    public Integer getIdcarros() {
        return idcarros;
    }

    public void setIdcarros(Integer idcarros) {
        Integer oldIdcarros = this.idcarros;
        this.idcarros = idcarros;
        changeSupport.firePropertyChange("idcarros", oldIdcarros, idcarros);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcarros != null ? idcarros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carros)) {
            return false;
        }
        Carros other = (Carros) object;
        if ((this.idcarros == null && other.idcarros != null) || (this.idcarros != null && !this.idcarros.equals(other.idcarros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "documenta\u00e7\u00e3o.Carros[ idcarros=" + idcarros + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
