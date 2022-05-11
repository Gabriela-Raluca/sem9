package ase.cts.Strategy;

public class Alg2Encryption implements iEncryptionStrategy {
    @Override
    public void encrypt(String txt) {
        System.out.println("Alg#"+txt+"#Alg");
    }

}
