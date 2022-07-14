package Github.Murillo.projeto.CorridaMaluca;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Random;

public class GrandePremio {
    
    private String nome;
    private int distancia;
    private ArrayList<Carro> grid;
    private int[] Distancias;

    public GrandePremio(String nome, int distancia, ArrayList<Carro> carros){
        this.nome = nome;
        this.distancia = distancia;
        this.grid = carros;
        this.Distancias = new int[carros.size()];
    }

    public ArrayList getGrid(){
        return grid;
    }

    public String getNome(){
        return nome;
    }

    public int getDistancia(){
        return distancia;
    }

    public int getDistancias(int posicao) {
        return Distancias[posicao];
    }

    public void corrida(){

        int verifica_freio = 1;
        boolean verifica_vencedor = false;
        int FreioCurva = 0;
        
        //System.out.println("Carros na pista: " + Distancias.length);

        while(!verifica_vencedor){
            for(int i = 0; i<grid.size(); i++){
                if(verifica_freio % 5 == 0){
                    grid.get(i).freia();
                    Distancias[i] += grid.get(i).getVelocidade();
                    FreioCurva += 1;
                    if(FreioCurva < grid.size()){
                        continue;
                    }
                    FreioCurva = 0;
                    verifica_freio = 1;
                    continue;
                }
                
                Random surpresa = new Random();
                int limite = 10;
                int aleatorio = surpresa.nextInt(limite);

                if(aleatorio > 2){
                    grid.get(i).acelera();
                    Distancias[i] += grid.get(i).getVelocidade();
                }
                
                verifica_freio += 1;
               
                if(Distancias[i] >= distancia){
                    verifica_vencedor = true;
                    break;
                }
            }
        }

        System.out.println("Fim do GP de: "+ this.getNome());
        
        for(int i = 0; i< grid.size(); i++){    
            
            if(Distancias[i] >= this.getDistancia()){
                System.out.println("Vencedor: " + grid.get(i).getScuderia() + " Percorreu: "+ Distancias[i]);
                grid.get(i).setVencedor();;
                continue;
            }
            System.out.println(grid.get(i).getScuderia() + " Percorreu: "+ Distancias[i]);
        }
        
    }
}

