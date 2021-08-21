package AulaNove;

public class SecretariaAdministrativa extends Secretaria{
    public SecretariaAdministrativa(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.40;
    }
}
