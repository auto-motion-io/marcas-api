package marcasapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marca {
    @Id
    private Integer codigo;
    private String nome;
    private String tpVeiculo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTpVeiculo() {
        return tpVeiculo;
    }

    public void setTpVeiculo(String tpVeiculo) {
        this.tpVeiculo = tpVeiculo;
    }
}
