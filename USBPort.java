public class USBPort {
    private static int _count = 0;

    private USBPort() {

    }
    public static USBPort getUSBPort() {
        if (_count < 4) {
            _count++;
            return new USBPort();

        } else {
            System.out.println("Only 4 USBPorts Can Be Created");
            return null;
        }
    }

    public boolean isEmpty() {
        return _token == null ? true : false;
    }

    public IUSBToken getToken() {
        return _token;
    }

    public void insertToken(IUSBToken token) {
            _token = token;

    }

    private IUSBToken _token = null;
}
