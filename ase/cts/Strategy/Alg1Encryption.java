package ase.cts.Strategy;

public class Alg1Encryption implements iEncryptionStrategy {
    @Override
    public void encrypt(String txt) {
        //mesaj Alg1#String trimis#Alg1
        System.out.println("Alg1#"+txt+"#Alg1");
    }
}
