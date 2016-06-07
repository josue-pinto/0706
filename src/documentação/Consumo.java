/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentação;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author josue.junior
 */
@Entity
@Table(name = "consumo", catalog = "locadora", schema = "")
@NamedQueries({
    @NamedQuery(name = "Consumo.findAll", query = "SELECT c FROM Consumo c"),
    @NamedQuery(name = "Consumo.findByIdconsumo", query = "SELECT c FROM Consumo c WHERE c.consumoPK.idconsumo = :idconsumo"),
    @NamedQuery(name = "Consumo.findByIdcarros", query = "SELECT c FROM Consumo c WHERE c.consumoPK.idcarros = :idcarros"),
    @NamedQuery(name = "Consumo.findByIdfornecedor", query = "SELECT c FROM Consumo c WHERE c.consumoPK.idfornecedor = :idfornecedor"),
    @NamedQuery(name = "Consumo.findByIdclientes", query = "SELECT c FROM Consumo c WHERE c.consumoPK.idclientes = :idclientes"),
    @NamedQuery(name = "Consumo.findByMatricula", query = "SELECT c FROM Consumo c WHERE c.consumoPK.matricula = :matricula"),
    @NamedQuery(name = "Consumo.findByIdcarro", query = "SELECT c FROM Consumo c WHERE c.idcarro = :idcarro"),
    @NamedQuery(name = "Consumo.findByValor", query = "SELECT c FROM Consumo c WHERE c.valor = :valor"),
    @NamedQuery(name = "Consumo.findByTpServico", query = "SELECT c FROM Consumo c WHERE c.tpServico = :tpServico"),
    @NamedQuery(name = "Consumo.findByIdCliente", query = "SELECT c FROM Consumo c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Consumo.findByIdFornecedor", query = "SELECT c FROM Consumo c WHERE c.idFornecedor = :idFornecedor"),
    @NamedQuery(name = "Consumo.findByObs", query = "SELECT c FROM Consumo c WHERE c.obs = :obs"),
    @NamedQuery(name = "Consumo.findByIdColaborador", query = "SELECT c FROM Consumo c WHERE c.idColaborador = :idColaborador")})
public class Consumo implements Serializable {

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

    public Consumo() {
    }

    public Consumo(ConsumoPK consumoPK) {
        this.consumoPK = consumoPK;
    }

    public Consumo(int idconsumo, int idcarros, int idfornecedor, int idclientes, int matricula) {
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
        this.idcarro = idcarro;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getTpServico() {
        return tpServico;
    }

    public void setTpServico(Integer tpServico) {
        this.tpServico = tpServico;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(Integer idColaborador) {
        this.idColaborador = idColaborador;
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
        if (!(object instanceof Consumo)) {
            return false;
        }
        Consumo other = (Consumo) object;
        if ((this.consumoPK == null && other.consumoPK != null) || (this.consumoPK != null && !this.consumoPK.equals(other.consumoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "documenta\u00e7\u00e3o.Consumo[ consumoPK=" + consumoPK + " ]";
    }
    
}
