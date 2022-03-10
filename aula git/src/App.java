import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Faça um programa em Java para simular uma parte do funcionamento
 de uma agenda de contatos. Você deverá ter as opções de incluir uma pessoa 
e listar todas as pessoas cadastradas. Cada pessoa terá nome, sobrenome e
telefone de contato. O número máximo de contatos que podem ser salvos é 
definido por você. Fique à vontade.
Use o código fornecido na plataforma de aprendizagem para começar o seu 
projeto.
Após finalizar o programa, compartilhe-o em sua conta do GitHub*/

        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 20; i++) {
            System.out.println();
        }
        boolean loop = true;
        int r = 0;

        Cadastro[] agenda= new Cadastro[3];

        while (loop==true) {

            int comando;
            System.out.println("----------Agenda telefônica----------");
            System.out.println("Pressione o número correspondente ao comando");
            System.out.println("1-Adicionar um contanto");
            System.out.println("2-Lista de contantos salvos");
            System.out.println("3-Fechar agenda");
            comando = s.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            if(comando==1 && r<3){

                System.out.print("Nome: ");
                String nome = s.next();

                System.out.print("Sobrenome: ");
                String sobrenome = s.next();

                System.out.print("Número: ");
                String numero = s.next();
                
                agenda[r] = new Cadastro(nome, sobrenome, numero);
                r++;

                System.out.print("\033[H\033[2J");
                System.out.flush();

                loop=true;
            }
            else if(comando==1 && r>=3){
                System.out.println("O limite de contatos salvos chegou no limite.");
                Thread.sleep(2000);
            }
            if(comando==2){
                for (int limite = 0; limite < r; limite++) {
                    //System.out.print("Contato "+(limite+1)+"\n");
                    agenda[limite].getinfo();
                    //Thread.sleep(200);
                }
                System.out.println("1-sair: ");
                s.nextInt();
                loop=true;
            }   

            if(comando==3) {
                System.out.println("Fechando agenda...");
                Thread.sleep(1000);
                loop = false;
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();
     }
     s.close();
    }
}
