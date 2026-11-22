package org.adapter;

public class Veiculo {

    IVelocidade velocidade;
    VelocidadeAdapter persistencia;

    public Veiculo() {
        velocidade = new VelocidadeKm();
        persistencia = new VelocidadeAdapter(velocidade);
    }

    public void setVelocidade(float velocidade) {
        this.velocidade.setVelocidade(velocidade);
        persistencia.salvarVelocidade();
    }

    public float getVelocidade() {
        return persistencia.recuperarVelocidade();
    }

    //Conversão de km/h para m/s
    public float getVelocidadeMs() {
        return persistencia.getVelocidade();
    }
}