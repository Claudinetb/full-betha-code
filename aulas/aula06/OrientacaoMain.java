package AulaSeis;

import com.sun.javadoc.Doc;

public class OrientacaoMain {

    public static void main(String[] args){

        //declarando meu objeto doc1
        Documento doc1;

        //Criando objeto doc1
        doc1 = new Documento();

        //Atribuindo os valores para doc1
        doc1.nome = "Claudine";
        doc1.codigo = 123456;
        doc1.foto = "Img1.pgn";
        doc1.dataNascimento = "02/06/1986";

        System.out.println("Código do documento: "+doc1.codigo);
    }

    static class Documento {

        //Estado
        String foto; //Nome do arquivo
        String nome;
        Integer codigo;
        String dataNascimento;
    }
}
