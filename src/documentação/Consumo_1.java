/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentação;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author josue.junior
 */
@Entity
@Table(name = "consumo", catalog = "locadora", schema = "")
@NamedQueries({
    @NamedQuery(name = "Consumo_1.findAll", query = "SELECT c FROM Consumo_1 c"),
    @NamedQuery(name = "Consumo_1.findByIdconsumo", query = "SELECT c FROM Consumo_1 c WHERE c.consumoPK.idconsumo = :idconsumo"),
    @NamedQuery(name = "Consumo_1.findByIdcarros", query = "SELECT c FROM Consumo_1 c WHERE c.consumoPK.idcarros = :idcarros"),
    @NamedQuery(name = "Consumo_1.findByIdfornecedor", query = "SELECT c FROM Consumo_1 c WHERE c.consumoPK.idfornecedor = :idfornecedor"),
    @NamedQuery(name = "Consumo_1.findByIdclientes", query = "SELECT c FROM Consumo_1 c WHERE c.consumoPK.idclientes = :idclientes"),
    @NamedQuery(name = "Consumo_1.findByMatricula", query = "SELECT c FROM Consumo_1 c WHERE c.consumoPK.matricula = :matricula"),
    @NamedQuery(name = "Consumo_1.findByIdcarro", query = "SELECT c FROM Consumo_1 c WHERE c.idcarro = :idcarro"),
    @NamedQuery(name = "Consumo_1.findByValor", query = "SELECT c FROM Consumo_1 c WHERE c.valor = :valor"),
    @NamedQuery(name = "Consumo_1.findByTpServico", query = "SELECT c FROM Consumo_1 c WHERE c.tpServico = :tpServico"),
    @NamedQuery(name = "Consumo_1.findByIdCliente", query = "SELECT c FROM Consumo_1 c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Consumo_1.findByIdFornecedor", query = "SELECT c FROM Consumo_1 c WHERE c.idFornecedor = :idFornecedor"),
    @NamedQuery(name = "Consumo_1.findByObs", query = "SELECT c FROM Consumo_1 c WHERE c.obs = :obs"),
    @NamedQuery(name = "Consumo_1.findByIdColaborador", query = "SELECT c FROM Consumo_1 c WHERE c.idColaborador = :idColaborador")})
public class Consumo_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConsumoPK consumoPK;
    @Column(name = "idcarro")
    private Integer idcarro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @Column(name = "tp_servico")
    private Integer tpServico;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_fornecedor")
    private Integer idFornecedor;
    @Column(name = "obs")
    private String obs;
    @Column(name = "id_colaborador")
    private Integer idColaborador;

    public Consumo_1() {
    }

    public Consumo_1(ConsumoPK consumoPK) {
        this.consumoPK = consumoPK;
    }

    public Consumo_1(int idconsumo, int idcarros, int idfornecedor, int idclientes, int matricula) {
        this.consumoPK = new ConsumoPK(idconsumo, idcarros, idfornecedor, idclientes, matricula);
    }

    public ConsumoPK getConsumoPK() {
        return consumoPK;
    }

    public void setConsumoPK(ConsumoPK consumoPK) {
        this.consumoPK = consumoPK;
    }

    public Integer getIdcarro() {
        return idcarro;
    }

    public void setIdcarro(Integer idcarro) {
        Integer oldIdcarro = this.idcarro;
        this.idcarro = idcarro;
        changeSupport.firePropertyChange("idcarro", oldIdcarro, idcarro);
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        Float oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public Integer getTpServico() {
        return tpServico;
    }

    public void setTpServico(Integer tpServico) {
        Integer oldTpServico = this.tpServico;
        this.tpServico = tpServico;
        changeSupport.firePropertyChange("tpServico", oldTpServico, tpServico);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        Integer oldIdFornecedor = this.idFornecedor;
        this.idFornecedor = idFornecedor;
        changeSupport.firePropertyChange("idFornecedor", oldIdFornecedor, idFornecedor);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    public Integer getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(Integer idColaborador) {
        Integer oldIdColaborador = this.idColaborador;
        this.idColaborador = idColaborador;
        changeSupport.firePropertyChange("idColaborador", oldIdColaborador, idColaborador);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consumoPK != null ? consumoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumo_1)) {
            return false;
        }
        Consumo_1 other = (Consumo_1) object;
        if ((this.consumoPK == null && other.consumoPK != null) || (this.consumoPK != null && !this.consumoPK.equals(other.consumoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "documenta\u00e7\u00e3o.Consumo_1[ consumoPK=" + consumoPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
