package ase.cts.Strategy;

//ex: criptarea unor date

public class MainStrategy {
    public static void main(String[] args) {
//        //instanta EncrEngine

//        //instanta Alg1
//        //apel de .getEncr("txt")

//        //instanta Alg2
//        //apel de .getEncr("txt")

        Alg1Encryption a1= new Alg1Encryption();
        EncryptionEngine ee1= new EncryptionEngine(a1);
        Alg2Encryption a2= new Alg2Encryption();
        EncryptionEngine ee2= new EncryptionEngine(a2);
        Alg3Encryption a3= new Alg3Encryption();
        EncryptionEngine ee3= new EncryptionEngine(a3);
        ee1.getEncryptedText("MESAJ1");
        ee2.getEncryptedText("MESAJ2");
        ee3.getEncryptedText("MESAJ3");

    }
}
