package ase.cts.State;

public class Comanda {

    private int nrComanda;
    private State stare;

    public int getNrComanda() {
        return nrComanda;
    }
//constructor

    public Comanda(int nrComanda) {
        this.nrComanda = nrComanda;

        stare=new ComandaPlasata();

    }

    //setStare
    public void setStare(State stare) {
        this.stare = stare;
    }




}
