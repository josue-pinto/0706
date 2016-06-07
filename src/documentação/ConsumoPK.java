/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentação;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author josue.junior
 */
@Embeddable
public class ConsumoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idconsumo")
    private int idconsumo;
    @Basic(optional = false)
    @Column(name = "idcarros")
    private int idcarros;
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private int idfornecedor;
    @Basic(optional = false)
    @Column(name = "idclientes")
    private int idclientes;
    @Basic(optional = false)
    @Column(name = "matricula")
    private int matricula;

    public ConsumoPK() {
    }

    public ConsumoPK(int idconsumo, int idcarros, int idfornecedor, int idclientes, int matricula) {
        this.idconsumo = idconsumo;
        this.idcarros = idcarros;
        this.idfornecedor = idfornecedor;
        this.idclientes = idclientes;
        this.matricula = matricula;
    }

    public int getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int getIdcarros() {
        return idcarros;
    }

    public void setIdcarros(int idcarros) {
        this.idcarros = idcarros;
    }

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idconsumo;
        hash += (int) idcarros;
        hash += (int) idfornecedor;
        hash += (int) idclientes;
        hash += (int) matricula;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsumoPK)) {
            return false;
        }
        ConsumoPK other = (ConsumoPK) object;
        if (this.idconsumo != other.idconsumo) {
            return false;
        }
        if (this.idcarros != other.idcarros) {
            return false;
        }
        if (this.idfornecedor != other.idfornecedor) {
            return false;
        }
        if (this.idclientes != other.idclientes) {
            return false;
        }
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "documenta\u00e7\u00e3o.ConsumoPK[ idconsumo=" + idconsumo + ", idcarros=" + idcarros + ", idfornecedor=" + idfornecedor + ", idclientes=" + idclientes + ", matricula=" + matricula + " ]";
    }
    
}
