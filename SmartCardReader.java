//Adapter Pattern
public class SmartCardReader extends USBTemplate{

    private static SmartCardReader _instance = null;
private SmartCardReader(){}
    public static SmartCardReader getInstance(){
    if (_instance == null){
        _instance = new SmartCardReader();
        return _instance;
    }
    return _instance;
    }
    @Override
    public void openFile(){
        _smartCardSdk.selectFile();
    }

    public void readData(){

        _smartCardSdk.readCard();
    }

    @Override
    public void verifyPin() {
        _smartCardSdk.verifyPin();
    }

    @Override
    protected void encryptData() {
        _smartCardSdk.encryptData();
    }

    @Override
    protected void decryptData() {
        _smartCardSdk.decryptData();
    }

    protected void deleteFile() {
        _smartCardSdk.deleteFile();
    }

    public void writeData() {
        _smartCardSdk.writeCard();
    }

    public void waitForInsertion(){
        _smartCardSdk.waitForCardInsertion();
    }
    private SmartCardDevelopmentKit _smartCardSdk = new SmartCardDevelopmentKit();
}
