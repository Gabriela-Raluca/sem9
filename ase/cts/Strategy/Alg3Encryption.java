package ase.cts.Strategy;

public class Alg3Encryption implements iEncryptionStrategy{
    @Override
    public void encrypt(String txt) {
        System.out.println("Alg3#"+txt+"#Alg3");
    }
}
