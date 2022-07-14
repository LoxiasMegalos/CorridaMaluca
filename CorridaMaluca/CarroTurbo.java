package Github.Murillo.projeto.CorridaMaluca;

public class CarroTurbo extends Carro {
     
    private int potencia_do_motor;

    public CarroTurbo(String nome, int velocidade_maxima, int potencia_do_motor){
        super(nome,velocidade_maxima);
        this.potencia_do_motor = potencia_do_motor;
        this.velocidade = 0;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelera(){
        velocidade += potencia_do_motor;
        if(velocidade > velocidade_maxima)
            velocidade = velocidade_maxima;

    }

    public void freia(){
        velocidade /= 2;
    }

    public String getScuderia(){
        return scuderia;
    }


}
