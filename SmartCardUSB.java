import java.util.ArrayList;
public class SmartCardUSB implements IUSBToken {
    private final boolean _isPluggable = false;
    private String _id;
    private USBTemplate _instance = null;
public SmartCardUSB(){
    _id =  "S" + (int)(Math.random() * 1000);
}
    @Override
    public  USBTemplate getTokenManager() {
        return SmartCardReader.getInstance();

    }

    @Override
    public String getTokenId() {
        return _id;
    }

}
