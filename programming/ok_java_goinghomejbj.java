import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class ok_java_goinghomejbj {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
		// elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// light on
		Lighting hallLamp = new Lighting(id + " / Hall lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on();

	}

}
