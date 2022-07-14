package Github.Murillo.projeto.CorridaMaluca.Testes;

import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

import Github.Murillo.projeto.CorridaMaluca.CarroTurbo;
import Github.Murillo.projeto.CorridaMaluca.GrandePremio;
import Github.Murillo.projeto.CorridaMaluca.Carro;
import junit.*;

public class TesteCarroTurbo {
    
    static CarroTurbo ferrari;

    @BeforeClass
    public static void Setup(){
        ferrari = new CarroTurbo("Ferrari", 1000, 100);
    }

    @Test
    public void TestaGetScuderia(){
        assertEquals("Ferrari", ferrari.getScuderia());
    }

    @Test
    public void TestaAceleracaoTurbo(){
        assertEquals(0, ferrari.getVelocidade());
        ferrari.acelera();
        assertEquals(100, ferrari.getVelocidade());
    }

    @Test
    public void TestaFreio(){
        CarroTurbo mercedes = new CarroTurbo("Mercedes", 100, 100);
        mercedes.acelera();
        assertEquals(100, mercedes.getVelocidade());
        mercedes.freia();
        assertEquals(50, mercedes.getVelocidade());
    }
}

