package AulaNove;

public class Diretor extends Gerente {
    public Diretor(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getSalario () {

        return getBonificacao()*1.20;
    }
}
