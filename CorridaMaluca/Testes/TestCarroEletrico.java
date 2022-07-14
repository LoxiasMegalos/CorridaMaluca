package Github.Murillo.projeto.CorridaMaluca.Testes;

import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

import Github.Murillo.projeto.CorridaMaluca.CarroEletrico;
import Github.Murillo.projeto.CorridaMaluca.GrandePremio;
import Github.Murillo.projeto.CorridaMaluca.Carro;
import junit.*;

public class TestCarroEletrico {
    
    static CarroEletrico tesla;

    @BeforeClass
    public static void Setup(){
        tesla = new CarroEletrico("Tesla", 100, 10, 2);
    }

    @Test
    public void getScuderia(){
        assertEquals("Tesla", tesla.getScuderia());
    }

    @Test
    public void VerificaAceleracaoEletrica(){
        assertEquals(0, tesla.getVelocidade());
        tesla.acelera();
        assertEquals(10, tesla.getVelocidade());
        tesla.acelera();
        assertEquals(20, tesla.getVelocidade());
    }

    @Test
    public void VerificaFreioEletrico(){
        CarroEletrico toyota = new CarroEletrico("Toyota", 50, 50, 2);
        toyota.acelera();
        assertEquals(50, toyota.getVelocidade());
        toyota.freia();
        assertEquals(25, toyota.getVelocidade());
    }


}
