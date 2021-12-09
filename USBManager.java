import java.util.ArrayList;
public class USBManager extends USBTemplate {
    private static USBManager _instance = null;
    private USBManager() {
    }
    public static USBManager getInstance() {
        if (_instance == null) {
            _instance = new USBManager();
            return _instance;
        }
        return _instance;
    }

    @Override
    public void openFile() {
        _USBSdk.openFile();
    }

    @Override
    public void closeFile() {
        _USBSdk.closeFile();
    }

    @Override
    public void readData() {
        _USBSdk.readData();
    }

    @Override
    protected void writeData() {
        _USBSdk.writeData();
    }

    @Override
    protected void encryptData() {
        _USBSdk.encryptData();
    }

    @Override
    protected void decryptData() {
        _USBSdk.decryptData();
    }

    public void waitForInsertion() {
        _USBSdk.waitForUSBTokenInsertion();
    }

    private USBDevelopmentKit _USBSdk = new USBDevelopmentKit();
}
