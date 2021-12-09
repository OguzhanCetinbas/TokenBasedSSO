import java.util.ArrayList;
public class FlashUSB implements IUSBToken {

    private String _id;
    private static USBTemplate _instance = null;

    public FlashUSB() {
        _id = "S" + (int) (Math.random() * 1000);
    }

    @Override
    public USBTemplate getTokenManager() {
        return USBManager.getInstance();
    }

    @Override
    public String getTokenId() {
        return _id;
    }

}
