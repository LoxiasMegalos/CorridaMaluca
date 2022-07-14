package Github.Murillo.projeto.CorridaMaluca;

public class CarroEletrico extends Carro {
    
    private int fatorAceleracao;
    private int velocidadeInicial;
    private int vezes_aceleradas;

    public CarroEletrico(String nome, int velocidade_maxima, int velocidadeInicial, int fatorAceleracao){
        super(nome, velocidade_maxima);
        this.fatorAceleracao = fatorAceleracao;
        this.velocidadeInicial = velocidadeInicial;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelera(){
        if(this.getVelocidade() == 0 ){
            System.out.println("O fator de aceleracao de"+ super.getScuderia()+" eh: "+ this.fatorAceleracao);
            velocidade = velocidadeInicial;
        } else{
            velocidade *= fatorAceleracao;
        }
        if(velocidade > velocidade_maxima)
            velocidade = velocidade_maxima;

    }

    public void freia(){
        velocidade /= fatorAceleracao;
    }

    public String getScuderia(){
        return scuderia;
    }
}
