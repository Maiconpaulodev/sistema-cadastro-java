            import java.util.ArrayList;
            import java.util.Locale;
            import java.util.Scanner;


            public class Main {
                 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pessoas> lister = new ArrayList<>();

    int opcao ;

    do {
        System.out.println(" ===== SISTEMA DE CADASTRO ===== ");
        System.out.println(" 1 Cadastro: ");
        System.out.println(" 2 Listar: ");
        System.out.println(" 3 Excluir: ");
        System.out.println(" 0 Sair: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1 :
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                Pessoas pessoas = new Pessoas(nome,idade);
                lister.add(pessoas);

                System.out.printf("Usuario %s cadastrado com sucesso\n", nome);
                break;

            case 2:
                if (lister.isEmpty()){
                    System.out.println("Nenhum usuario cadastrado\n");
                    break;
                }
    for (Pessoas i : lister){
                        System.out.println(i);
                }
            break;
                    case 3:

            if (lister.isEmpty()) {
                System.out.println("Nenhum usuario para deletar\n");
                break;
            }
            System.out.println("Digite o nome do usuario para deletar\n");
            String nomeExcluir = scanner.nextLine();

            for (int i = 0; i < lister.size(); i++){

                if (lister.get(i).getNome().equalsIgnoreCase(nomeExcluir)){
                    lister.remove(i);
                    System.out.printf("%s removido com sucesso\n", nomeExcluir);
                }
    }
            break;

            default:
                System.out.println("Numero invalido");

        }




    } while (opcao!=0);



                     scanner.close();

                }

                }

