public class Medicamento{
    private String nome;
    private String principioAtivo;
    private int quantidadeEstoque;
    private boolean precisaReceita;
    private double preco;
}

public Medicamento(String nome, String principioAtivo, int quantidadeEstoque, boolean precisaReceita, double preco){
    this.nome = nome;
    this.principioAtivo = principioAtivo;
    this.quantidadeEstoque = quantidadeEstoque;
    this.precisaReceita = precisaReceita;
    this.preco = preco;
}

public void InformacoesLegais {
        System.out.println("\n--- Detalhes do Medicamento ---");
        System.out.println("Nome: " + nome);
        System.out.println("Princípio Ativo: " + principioAtivo);
        System.out.println("Estoque: " + quantidadeEstoque);
        System.out.println("Requer Receita: " + (precisaReceita ? "Sim" : "Não"));
        System.out.println("Preço: R$ " + preco);
    }
        }