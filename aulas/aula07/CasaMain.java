package AulaSete;

public class CasaMain {

    public static void main(String[] args){
        Casa casa = new Casa("Rua Dolario dos Santos", 2, 1, 2, 90.0);

        casa.setMetragem(198.0);

        if (casa.getMetragem() > 120.0){
            System.out.println("Casa do Carrion!!");
        }

        System.out.println(casa);
    }

    public static class Casa{
        private String endereco;
        private Integer quartos;
        private Integer salas;
        private Integer banheiros;
        private Double metragem;

        public Casa(String endereco, Integer quartos, Integer salas, Integer banheiros, Double metragem) {
            this.endereco = endereco;
            this.quartos = quartos;
            this.salas = salas;
            this.banheiros = banheiros;
            this.metragem = metragem;
        }

        public String getEndereco() {
            return endereco;
        }

        public Integer getQuartos() {
            return quartos;
        }

        public Integer getSalas() {
            return salas;
        }

        public Integer getBanheiros() {
            return banheiros;
        }

        public Double getMetragem() {
            return metragem;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setQuartos(Integer quartos) {
            this.quartos = quartos;
        }

        public void setSalas(Integer salas) {
            this.salas = salas;
        }

        public void setBanheiros(Integer banheiros) {
            this.banheiros = banheiros;
        }

        public void setMetragem(Double metragem) {
            this.metragem = metragem;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", quartos=" + quartos +
                    ", salas=" + salas +
                    ", banheiros=" + banheiros +
                    ", metragem=" + metragem +
                    '}';
        }
    }
}
