package Github.Murillo.projeto.CorridaMaluca;

import java.util.ArrayList;
import java.util.Scanner;

//Mercedes AMG 1 - potencia: 26 m/s Vel-maxima: 1034 m/s
//GP: Monza - Distancia em metros: 306000


public class Corrida {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Carro> Grid = new ArrayList<Carro>();
        int opcao = -1;
        Carro carro;

        while(opcao != 0){
            System.out.println("\n");
			System.out.println("Digite uma opção:");
			System.out.println("1- Adicionar carro Turbo");
            System.out.println("2- Adicionar carro Eletrico");
			System.out.println("0- Sair/InciarGP");
			System.out.println("----------------");

			opcao = Integer.parseInt(teclado.nextLine());

            switch(opcao){
                case 1:{
                    System.out.println("Informe o nome da scuderia: ");
                    String nome = teclado.nextLine();
                    
                    System.out.println("Vel Maxima: ");
                    String velocidade_maxima = teclado.nextLine();

                    System.out.println("Potencia: ");
                    String potencia = teclado.nextLine();

                    int pot, vel;
                    pot =  Integer.parseInt(potencia);
                    vel = Integer.parseInt(velocidade_maxima);

                    carro = new CarroTurbo(nome, vel, pot);
                    Grid.add(carro);

                    break;
                }
                case 2:{
                    System.out.println("Informe o nome da scuderia: ");
                    String nome = teclado.nextLine();

                    System.out.println("Vel Maxima: ");
                    String velocidade_maxima = teclado.nextLine();

                    System.out.println("Velocidade Inicial: ");
                    String velocidadeInicial = teclado.nextLine();

                    System.out.println("Fator de Aceleracao: ");
                    String fatorDeAceleracao = teclado.nextLine();

                    int vel, vi, fda;
                    
                    vel = Integer.parseInt(velocidade_maxima);
                    vi =  Integer.parseInt(velocidadeInicial);
                    fda = Integer.parseInt(fatorDeAceleracao);

                    carro = new CarroEletrico(nome, vel, vi, fda);
                    Grid.add(carro);

                    break;
                }
                case 0:{
                    System.out.println("O grid Está formado Iniciando GP em 3,2,1...");
                    break;
                }
                default:{
					System.out.println("Opção " + opcao + " inválida.");
					break;
				}
            }
        }

        System.out.println("Informe o nome do GP: ");
        String gp = teclado.next();
        System.out.println("Informe a distancia do GP: ");
        int dist = teclado.nextInt();
        GrandePremio Gp = new GrandePremio(gp, dist, Grid);



        System.out.println("Competição entre os carros!");
        for(int i = 0; i< Grid.size(); i++){
            System.out.println(Grid.get(i).getScuderia());
        }

        Gp.corrida();
        
    }
}
