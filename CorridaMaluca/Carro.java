package Github.Murillo.projeto.CorridaMaluca;

public abstract class Carro {
    
    protected String scuderia;
    protected int velocidade_maxima;
    protected int velocidade;
    protected boolean vencedor = false;

    public Carro(String nome, int velocidade_maxima){
        this.scuderia = nome;
        this.velocidade_maxima = velocidade_maxima;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelera(){
        //velocidade += potencia_do_motor;
        //if(velocidade > velocidade_maxima)
        //    velocidade = velocidade_maxima;

        //distanciaPercorrida += velocidade;
    }

    public void freia(){
        velocidade /= 2;
    }

    public String getScuderia(){
        return scuderia;
    }

    public void setVencedor() {
        this.vencedor = true;
    }

    public boolean getVencedor(){
        return this.vencedor;
    }

}
