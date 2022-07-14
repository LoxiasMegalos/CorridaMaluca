package Github.Murillo.projeto.CorridaMaluca.Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

import Github.Murillo.projeto.CorridaMaluca.CarroTurbo;
import Github.Murillo.projeto.CorridaMaluca.GrandePremio;
import Github.Murillo.projeto.CorridaMaluca.Carro;
import Github.Murillo.projeto.CorridaMaluca.CarroEletrico;
import junit.*;


public class TestGrandePremio {
    
    static CarroTurbo carrinho;
    static GrandePremio gp;
    static ArrayList<Carro> Grid;

    @BeforeClass
    public static void Setup(){
        carrinho = new CarroTurbo("Ferrari", 100, 10);
        Grid = new ArrayList<Carro>();
        Grid.add(carrinho);
        gp = new GrandePremio("Monza", 1000, Grid);
    }

    @Test
    public void TestaGetNome(){
        assertEquals("Monza", gp.getNome());
    }

    @Test
    public void VerificaDistanciaGP(){
        assertEquals(1000, gp.getDistancia());
    }

    @Test
    public void TestaCorrida(){

        CarroTurbo ferrari = new CarroTurbo("Ferrari", 100, 10);
        CarroTurbo mercedes = new CarroTurbo("mercedes", 120, 20);
        CarroTurbo redbull = new CarroTurbo("redbull", 150, 30);
        CarroEletrico tesla = new CarroEletrico("tesla", 50, 2, 2);
        CarroEletrico renault = new CarroEletrico("renault", 55, 2, 1);
        CarroEletrico toyota = new CarroEletrico("toyota", 70, 0, 2);

        ArrayList<Carro> Largada = new ArrayList<Carro>();
        Largada.add(ferrari);
        Largada.add(mercedes);
        Largada.add(redbull);
        Largada.add(tesla);
        Largada.add(renault);
        Largada.add(toyota);

        GrandePremio GrandPrix = new GrandePremio("Monza", 1000, Largada);

        GrandPrix.corrida();

        assertTrue(GrandPrix.getDistancias(0) > 0);
        assertTrue(GrandPrix.getDistancias(1) > 0);
        assertTrue(GrandPrix.getDistancias(2) > 0);
        assertTrue(GrandPrix.getDistancias(3) > 0);
        assertTrue(GrandPrix.getDistancias(4) > 0);
        assertTrue(GrandPrix.getDistancias(5) == 0);

        for(int i = 0; i < GrandPrix.getGrid().size(); i++){
            if(Largada.get(i).getVencedor()){
                assertTrue(Largada.get(i).getVencedor());
                continue;
            }
            assertFalse(Largada.get(i).getVencedor());
        }
    }
}
