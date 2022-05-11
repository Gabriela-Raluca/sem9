package ase.cts.State;

public class InCursDePreparare implements State {

    @Override
    public void updateStare(Comanda comandaStare) {

        //mesaj trimite
        System.out.println("Comanda cu nr este in curs de preparare!");

        //schimba contextul ->starea urm
        comandaStare.setStare(this);
    }
}
