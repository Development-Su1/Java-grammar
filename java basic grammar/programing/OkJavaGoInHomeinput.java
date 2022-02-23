// import�� �ҷ����� ���ε� �ڿ� ���� Ŭ������ �ҷ����� ���̴�.    
// �̰��� ���ָ� ���� ��� ������ �ʾƵ� �ȴ�. ( Elevator = org.opentutorials.iot.Elevator;)
import javax.swing.JOptionPane;  // >> �̰��� javax�� swing�� �����ִ� JOptionPane�̶�� �ϴ� Ŭ������ �ε�Ǿ��ٶ�� ���̴�. 

import org.opentutorials.iot.Elevator;   
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.DimmingLights;

public class OkJavaGoInHomeinput {

	public static void main(String[] args) {
		
//		String id = "Anyang APT 203";�� �ϸ� �ؿ� "Anyang APT 203"�κ��� id(id+)�� �ٲٸ� �Ȱ��� ��µ�
		
		String id = JOptionPane.showInputDialog("Enter a ID");
//		>> ���� �ִ� JOptionPane.showInputDialog("Enter a ID");�� ���ؼ� �ڹٰ� swing�̶�� ����� 
//		   JOptionPane�̶�� �ϴ� ��ɿ� .showInputDialog��� ����� ���ָ� ���� ���ڰ� �߰� �ű⿡ �Է°��� �Է��� ������ 
//		   �ڹٴ� ������ �����ִٰ� �Է°��� �Է��ϸ�  JOptionPane.showInputDialog("Enter a ID");�� ���� �Է°��� �ؽ�Ʈ�� �ٲ��.
//		>> ex) ���� ���ڿ� Anyang APT 203�̶�� �Է��ϸ� �ٷ� �� �ڵ��� ���� Anyang APT��� �ϴ� �ؽ�Ʈ�� �ٲ��. 
		
		String bright = JOptionPane.showInputDialog("Enter a bright level");
		
		// Elevator Call
		Elevator myElevator = new Elevator(id);   
		myElevator.callForUp(1);
		
		// Security off   (���� ����)
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");  // Anynag APT 203�� Hall Lamp�� �ǹ�
		hallLamp.on();
		
		//DimmingLights on (��� ���� ���� �ѱ�)
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
//		>> 23���� String bright��� ���� ������ ���� �����ε� �ٷ� ���� �־�� �� ���� �Ǽ�(double)�̴�. << ����
//      >> ���� �ذ�����?
//		   Double.parseDouble(text[=�Է°�]);�� ����. �̰��� �Է°����� ���� ���ڸ� �Ǽ�(double)�� �ٲ��ش�.
//		>> moodLamp�� Lighting�̶�� �ٸ��� setBright��� �޼ҵ带 ������ �ִ�.
		moodLamp.on();
		
	}

}
