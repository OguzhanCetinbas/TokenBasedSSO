// Factory Pattern
public class OS {
    public USBTemplate installDriver(IUSBToken token){

        return token.getTokenManager();
    }

}
