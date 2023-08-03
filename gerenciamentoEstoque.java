import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gerenciamentoEstoque {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome;
        int opcao,quantidade,quantRemover;
        double preco;
        boolean encontrado = false;
        List<estoque> estoques = new ArrayList<>();


        do {
            System.out.println("1- Adicionar ao estoque");
            System.out.println("2- Remover do estoque");
            System.out.println("3- Ver estoque");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = tec.nextInt();
            tec.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira o nome do produto: ");
                    nome = tec.nextLine();
                    System.out.println("Insira a quantidade do produto: ");
                    quantidade = tec.nextInt();
                    System.out.println("Insira o preco do produto: ");
                    preco = tec.nextDouble();
                    tec.nextLine();

                    estoque novoEstoque = new estoque(nome,quantidade,preco);
                    estoques.add(novoEstoque);

                    System.out.println("PRODUTO ADICIONADO AO ESTOQUE!");
                    System.out.println("----------------------------------------------------");
                    System.out.println();
                    break;
                }
                case 2 -> {
                    System.out.println("Insira o nome do produto: ");
                    nome = tec.nextLine();
                    System.out.println("Insira a quantidade a ser removida: ");
                    quantRemover = tec.nextInt();

                    for (int aux = 0; aux < estoques.size(); aux++) {
                        if (estoque.getNome().equalsIgnoreCase(nome)) {
                            encontrado = true;
                            estoque.removerQuantidade(quantRemover);
                            System.out.println("PRODUTO REMOVIDO COM SUCESSO!");
                            System.out.println("----------------------------------------------------");
                            System.out.println();
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("PRODUTO NAO ENCONTRADO!");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Estoque atual: ");
                    for (int aux = 0; aux < estoques.size(); aux++) {
                        System.out.println(estoque.imprimir());
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.println();
                    break;
                }
                case 4 -> {
                    System.out.println("Programa encerrado.");
                    break;
                }
                default -> {
                    System.out.println("ESCOLHA INVALIDA, TENTE NOVAMENTE.");
                    System.out.println("----------------------------------------------------");
                    System.out.println();
                    break;
                }
            }

        }while (opcao != 4);
        tec.close();
    }
    public static class estoque {
        private static String nome;
        private static int quantidade;
        private static double preco;
        public estoque(String nome, int quantidade, double preco) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }

        // MÉTODOS GETTERS:
        public static String getNome() {
            return nome;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPreco() {
            return preco;
        }

        // MÉTODOS SETTERS:
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
        public static void removerQuantidade(int quantRemover) {
            if (quantRemover <= quantidade) {
                quantidade -= quantRemover;
            } else {
                System.out.println("NAO HA QUANTIDADE SUFICIENTE PARA REMOVER!");
            }
        }
        public static String imprimir() {
            return nome + ", quantidade: " + quantidade + ", preco: R$" + preco;
        }
    }

}
