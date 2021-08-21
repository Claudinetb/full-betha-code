package Aula12;

import aula11.Cliente;
import aula11.ListaCliente;

public class StreamMain {
    public static void main(String[] args) {
        List<aula11.Cliente> lista = new ArrayList<aula11.Cliente>();

        aula11.Cliente a = new Cliente(1, "Claudine", "01137692121", "12345");
        aula11.Cliente b = new Cliente(2, "Romulo", "124567889", "098776");
        aula11.Cliente c = new Cliente(3, "Dil", "0113769786", "123123");

        lista.add(a);
        lista.add(b);
        lista.add(c);

        List<Cliente> Cla = lista.stream().filter(p -> p.getNome().startsWith("Cla")).collect(Collectors.toList());
        System.out.println(Cla);

        List<String> cpfs = lista.stream().map(p -> p.getCpf()).collect(collectors.toList());
        System.out.println(cpfs);

        lista.stream().forEach(p -> {
            System.out.println(p.getNome());
            System.out.println(p.getCpf());
        });

    }
}
