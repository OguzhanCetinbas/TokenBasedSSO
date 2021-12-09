
import java.util.ArrayList;
public class Computer {
    public void integrateUSBPort() {
       USBPort port = USBPort.getUSBPort();
       if (port != null){
           usbPorts.add(port);
       }
    }
public USBPort getAvailableUSBPort(){
    for (var usbPort: usbPorts) {
        if (usbPort.isEmpty()){
            return usbPort;
        }
    }
    return null;
}
    private ArrayList<USBPort> usbPorts = new ArrayList<USBPort>();
}
