// import�� �ҷ����� ���ε� �ڿ� ���� Ŭ������ �ҷ����� ���̴�.  
// �̰��� ���ָ� ���� ��� ������ �ʾƵ� �ȴ�. ( Elevator = org.opentutorials.iot.Elevator;)
import org.opentutorials.iot.Elevator;   
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
 
public class OkJavaGoInHome {

	public static void main(String[] args) {
		
//		String id = "JAVA APT 203";�� �ϸ� �ؿ� "JAVA APT 203"�κ��� id(id+)�� �ٲٸ� �Ȱ��� ��µ�
		
		// Elevator Call
		Elevator myElevator = new Elevator("JAVA APT 203");
		myElevator.callForUp(1);
		
		// Security off   (���� ����)
		Security mySecurity = new Security("JAVA APT 203");
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting("JAVA APT 203 / Hall Lamp");  // JAVA APT 203�� Hall Lamp�� �ǹ�
		hallLamp.on();
		
	}

}
