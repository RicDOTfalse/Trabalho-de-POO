import java.util.Scanner;

void main() {
   public static void SISTEMAHOSPITAL ([] args){
       Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do medicamento: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o princípio ativo: ");
        String principio = leitor.nextLine();

        System.out.print("Quantidade em estoque: ");
        int qtd = leitor.nextInt();

        System.out.print("Precisa de receita? (true/false): ");
        boolean receita = leitor.nextBoolean();

        System.out.print("Preço: ");
        double preco = leitor.nextDouble();

        Medicamento med = new Medicamento(nome, principio, qtd, receita, preco);

        med.exibirInformacoes();

        leitor.close();

    }
}