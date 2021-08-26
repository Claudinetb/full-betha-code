import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args ) throws SQLException, ClassNotFoundException {

        DiretorService diretorService = new DiretorService();
        DiretorRepository diretorRepository = new DiretorRepository();

        Diretor diretor = new Diretor(1, "Dionatan", "1234", 5000.0, 800.00);
        diretorService.save(diretor);
        diretor.setNome(diretor.getNome() + " - Duarte");
        diretorService.update(diretor);

        List<Diretor> diretorList = diretorRepository.findAll();

        diretorList.forEach(diretorCorrente -> {
            System.out.println("Id diretor: " + diretorCorrente.getId());
            System.out.println("Nome diretor: " + diretorCorrente.getNome());
            System.out.println("CPF diretor: " + diretorCorrente.getCpf());
            System.out.println("Salário diretor: " + diretorCorrente.getSalario());
            System.out.println("Bônus diretor: " + diretorCorrente.getBonus());
            System.out.println("===========================");
        });


        Diretor diretorUnico = diretorRepository.findById(1);

        System.out.println("Id diretor: " + diretorUnico.getId());
        System.out.println("Nome diretor: " + diretorUnico.getNome());
        System.out.println("CPF diretor: " + diretorUnico.getCpf());
        System.out.println("Salário diretor: " + diretorUnico.getSalario());
        System.out.println("Bônus diretor: " + diretorUnico.getBonus());
        System.out.println("===========================");

        FuncionarioService funcionarioService = new FuncionarioService();
        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

        Funcionario funcionario = new Funcionario(1, "Adriano", "4321", 6000.0);
        funcionario = funcionarioService.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " - Macedo");

        funcionarioService.update(funcionario);
        List<Funcionario> funcionarioList = funcionarioRepository.findAll();

        funcionarioList.forEach(funcionarioCorrente -> {
            System.out.println("Id funcionário: " + funcionarioCorrente.getId());
            System.out.println("Nome funcionário: " + funcionarioCorrente.getNome());
            System.out.println("CPF funcionário: " + funcionarioCorrente.getCpf());
            System.out.println("Salário funcionário: " + funcionarioCorrente.getSalario());
            System.out.println("===========================");
        });

        Funcionario funcionarioUnico = funcionarioRepository.findById(1);

        System.out.println("Id funcionário: " + funcionarioUnico.getId());
        System.out.println("Nome funcionário: " + funcionarioUnico.getNome());
        System.out.println("CPF funcionário: " + funcionarioUnico.getCpf());
        System.out.println("Salário funcionário: " + funcionarioUnico.getSalario());
        System.out.println("===========================");
    }
}
