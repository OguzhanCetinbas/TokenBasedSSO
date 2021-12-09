import java.util.ArrayList;
public abstract class USBTemplate {
    protected abstract void waitForInsertion();
    protected abstract void openFile();
    protected abstract void readData();
    protected abstract void writeData();
    protected abstract void encryptData();
    protected abstract void decryptData();

    public void verifyPin(){

    }
    public void closeFile(){

    }
    public final void getPassword(){
        waitForInsertion();
        verifyPin();
        openFile();
        readData();
        closeFile();
        decryptData();

    }
    public final void setPassword(){
        waitForInsertion();
        verifyPin();
        openFile();
        encryptData();
        writeData();
        closeFile();
    }

}
