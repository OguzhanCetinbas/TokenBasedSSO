//Facade
public class User {
    private Computer _computer;
    private OS _os;
    private USBTemplate _tokenManager;
    private IUSBToken _token = null;
    public User(Computer computer, OS os){
        _computer = computer;
        _os = os;
    }
    public void insertToken(IUSBToken token){
        var port = _computer.getAvailableUSBPort();
        if (port != null){
            port.insertToken(token);
            _token = port.getToken();
        }else{
            System.out.println("There is No Available Usb Port in The Computer");
        }
    }
    public void installTokenDriver(){
        if (_token != null){
            _tokenManager = _os.installDriver(_token);
        }
    }

    public void signIn(){
        if (_tokenManager != null){
            _tokenManager.getPassword();
            System.out.println("Password Filled For This Site");
        }
        if (_token == null){
            System.out.println("Please Insert Token");
        }
    }
    public void signUp(){
        if (_tokenManager != null){
            _tokenManager.setPassword();
            System.out.println("Password Saved For This Site");
        }
        if (_token == null){
            System.out.println("Insert Token");
        }
    }
}
