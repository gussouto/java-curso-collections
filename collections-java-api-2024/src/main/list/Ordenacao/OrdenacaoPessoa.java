package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atriuto
    private List<Pessoa> pessoaList;

    //construtor
    public OrdenacaoPessoa () {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
      
          // Adicionando pessoas à lista
          ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoa.pessoaList);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoa.ordenarPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoa.ordenarPorAltura());
        }

}
