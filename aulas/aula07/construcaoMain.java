package AulaSete;

public class construcaoMain {

    private Double metragem;
    private Integer quantquartos;
    private Integer quantbanheiros;

    public construcaoMain(Double metragem, Integer quantquartos, Integer quantbanheiros) {
        this.metragem = metragem;
        this.quantquartos = quantquartos;
        this.quantbanheiros = quantbanheiros;
    }

    public Double getMetragem() {
        return metragem;
    }

    public void setMetragem(Double metragem) {
        this.metragem = metragem;
    }

    public Integer getQuantquartos() {
        return quantquartos;
    }

    public void setQuantquartos(Integer quantquartos) {
        this.quantquartos = quantquartos;
    }

    public Integer getQuantbanheiros() {
        return quantbanheiros;
    }

    public void setQuantbanheiros(Integer quantbanheiros) {
        this.quantbanheiros = quantbanheiros;
    }
}

