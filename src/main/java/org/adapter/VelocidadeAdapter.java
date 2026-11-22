package org.adapter;

public class VelocidadeAdapter extends VelocidadeMs {

    private IVelocidade velocidadeKm;

    public VelocidadeAdapter(IVelocidade velocidadeKm) {
        this.velocidadeKm = velocidadeKm;
    }

    public void salvarVelocidade() {
        this.setVelocidade(velocidadeKm.getVelocidade() / 3.6f);
    }

    public float recuperarVelocidade() {
        return this.getVelocidade() * 3.6f;
    }
}