package ase.cts.State;

public class ComandaPlasata implements State{


    @Override
    public void updateStare(Comanda comandaStare) {

        //mesaj trimite
        System.out.println("Comanda dvs este plasata!");

        //schimba contextul ->starea urm
        comandaStare.setStare(this);
    }
}
