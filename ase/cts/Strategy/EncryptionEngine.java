package ase.cts.Strategy;
//context
public class EncryptionEngine {
    //ob care spune ce strategie folosim iEncrStrategi iE-param
    iEncryptionStrategy iEnc;

    //constr
    public EncryptionEngine(iEncryptionStrategy iEnc) {
        this.iEnc = iEnc;
    }

    public EncryptionEngine() {

    }

    //metoda de set Strategy care primeste ca param iEngStra
    public void setiEnc(iEncryptionStrategy iEnc) {
        this.iEnc = iEnc;
    }
    //metoda getEncryptedText(String txt)
    public void getEncryptedText(String txt){
        iEnc.encrypt(txt);
    }
}
