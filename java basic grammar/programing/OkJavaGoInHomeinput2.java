// run �� �ؿ� Organize Favorites�� ���ã���. ���⼭ Add�� Ŭ���Ͽ� ���� ���� ã�� ����� �����ϸ� �ȴ�.

// import�� �ҷ����� ���ε� �ڿ� ���� Ŭ������ �ҷ����� ���̴�.   
// �̰��� ���ָ� ���� ��� ������ �ʾƵ� �ȴ�. ( Elevator = org.opentutorials.iot.Elevator;)
import javax.swing.JOptionPane;  // >> �̰��� javax�� swing�� �����ִ� JOptionPane�̶�� �ϴ� Ŭ������ �ε�Ǿ��ٶ�� ���̴�. 

import org.opentutorials.iot.Elevator;   
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGoInHomeinput2 {

//	paramter, �Ű�����(args�� �Ű�������.)
//	>> {} �ȿ����� args�� ����ڰ� �Է��� ���̴�.
	public static void main(String[] args) {
		
//		String id = "JAVA APT 203";�� �ϸ� �ؿ� "JAVA APT 203"�κ��� id(id+)�� �ٲٸ� �Ȱ��� ��µ�
		
		String id = args[0];
		String bright = args[1];
//		>> args ��� parameter(�Ű�����)�� �̿��ؼ� �޴´�.
//		   ���� ���������϶��� �迭�� �̿��Ͽ� args[0], args[1] �̷������� 0��° 1��° �� ������ �Ű��ش�. 
//		   ��Ŭ�������� �ش�Ǵ� ���� �ϳ��� run configuration�� ���� arguments �ǿ��� ������ �� �� �ִ�. 
//		   ���⼭ ������ �����ϴ� ���� ' ' �̴�. >> ex) 'pusan' '14.0' --> ù��° ���ڴ� pusan �ι�° ���ڴ� 14.0�� �Ǵ°��̴�.
//		����) ������ �𸣰����� ��������ǥ�� ���ڰ��� �����ϸ� �������Ŀ����� �߻��ؼ� ū����ǥ�� ���ڸ� �������־����� ��������̵Ǿ���.
		
		
		// Elevator Call
		Elevator myElevator = new Elevator(id);   
		myElevator.callForUp(1);
		
		// Security off   (���� ����)
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");  // JAVA APT 203�� Hall Lamp�� �ǹ�
		hallLamp.on();
		
		//DimmingLights on
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
//		>> 23���� String bright��� ���� ������ ���� �����ε� �ٷ� ���� �־�� �� ���� �Ǽ�(double)�̴�. << ����
//      >> ���� �ذ�����?
//		   Double.parseDouble(text[=�Է°�]);�� ����. �̰��� �Է°����� ���� ���ڸ� �Ǽ�(double)�� �ٲ��ش�.
		moodLamp.on();
		
	}

}
