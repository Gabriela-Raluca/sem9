package ase.cts.State;
//State: aplicabilitate--livrare
//Sa se impl o aplicatie care sa trateze transmiterea starii comenzii catre client
//1.comanda plasata
//2.in curs de preparare
//3.gata de livrare
//4.livrata

//Context=managementul unei comenzi
public class MainState {
    public static void main(String[] args) {

        Comanda comanda= new Comanda(22);

        ComandaPlasata plasat=new ComandaPlasata();
        plasat.updateStare(comanda);

        InCursDePreparare cursPreparare=new InCursDePreparare();
        cursPreparare.updateStare(comanda);

    }
}
