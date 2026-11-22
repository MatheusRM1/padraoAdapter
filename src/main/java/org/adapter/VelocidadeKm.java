package org.adapter;

public class VelocidadeKm implements IVelocidade {

    private float velocidade;

    @Override
    public float getVelocidade() {
        return this.velocidade;
    }

    @Override
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}