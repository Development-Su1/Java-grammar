// �迭 ����
// String[] classGroup���� classGroup�� �迭�� ��� ������ �̸��̴�. 
// String[]�� classGroup�� ���� �迭�� ��� �������� Ÿ���� ���ڿ��� �迭�̶�� �ǹ̴�. 
// �迭�� ������ ���� ������ Ÿ�� �ڿ� []�� �ٿ��� �Ѵ�. []�� ���ٸ� classGroup�� �迭�� �ƴ϶� ���ڿ� ������ Ÿ���� ���� ������ �ȴ�. 
// �迭�� �Ҽӵ� �����͵��� �߰�ȣ �ȿ� ��ġ�Ѵ�. 
public class baeyeol {

	public static void main(String[] args) {
		
      String [] classGroup = {"������", "������", "�ֿ���", "������", "��ٹ�"}; 
	}

}

// �迭�� ����ִ� �����͸� �������� ���
// classGroup[0]ó�� �迭�� ����ִ� ������ �̸� �ڿ� ���ȣ�� ���̰� �� �ȿ� 0���� �����ϴ� ���ڸ� �Է��ϸ� ���������� ���� ������ �� �ִ�.
public class GetDemo {
	
	public static void main(String[] args) {
		String [] classGroup = {"������", "������", "������", "������", "��ٹ�"};
		System.out.println(classGroup[0]);   // ������
		System.out.println(classGroup[1]);   // ������
		System.out.println(classGroup[2]);   // ������
		System.out.println(classGroup[3]);   // ������
		System.out.println(classGroup[4]);   // ��ٹ�
	}
}

// �迭�� �����ϴ� �ٸ� ����� �迭�� ��� �ִ� ���� ���� �˾Ƴ��� ���
// .length�� �迭�� ���� ��� �������� ���ڸ� �ǹ��ϴ� ���� �ƴ϶� �迭�� ó�� ������ �� ������ �迭�� ũ�⸦ �ǹ��Ѵٴ� ���� ����
//  length�� �迭�� ��� ������ ���ڰ� �ƴ϶� �迭�� ������ �� ������ �迭�� ���� �� �ִ� ���� ũ�⸦ �ǹ��Ѵ�.
public class LengthDemo {
	
	public static void main(String[] args) {
		String[] classGroup = new String[5];   // ���ο� ���ڿ��� ����� ��� (�迭[]�� ������ �� new���)
		classGroup[0] = "������";
		System.out.println(classGroup.length);
		classGroup[1] = "������";
		System.out.println(classGroup.length);
		classGroup[2] = "������";
		System.out.println(classGroup.length);
		classGroup[3] = "������";
		System.out.println(classGroup.length);
		classGroup[4] = "��ٹ�";
		System.out.println(classGroup.length);
		
	}
}

// �б� ������ ���ݸ� �� Ȱ���غ���. 1�� �л����� ����� �޴´ٰ� ���� ��
// �ݺ����� �迭�� �ſ� ������ ���迡 �ִٰ� �� �� �ִ�.
public class ArrayLoopDemo {
	
    public static void main(String[] args) {
    	
    	String[] members = {"������", "������", "������", "������", "��ٹ�"};
    	for (int i = 0; i < members.length; i++) {     // members.length�� 3�̴�.
    		String member = members [i];   // String member��� �����ε� �̰��� ������ Ÿ���� String�̴�. ��, ���ڸ� ��� �����̴�.
    		System.out.println(member + "�� ����� �޾ҽ��ϴ�.");
    	}
    }
}


// for - each
// �迭�� ������ Ž���� �� for ���� �� �� �����ϰ� ����� �� �ִ� ���
// ���� ������ ���� ������ ��Ȯ�ϰ� �����ϰ� �����Ѵ�.
public class ForeachDemo {
	
    public static void main(String[] args) {
    	String[] members = {"������", "������", "������", "������", "��ٹ�"};
    	for (String e : members) {     // �迭 members�� ���� ���� e�� ��Ƽ� �߰�ȣ ���� ������ �������ش�.
    		System.out.println(e + "�� ����� �޾ҽ��ϴ�.");
    	}
    	
    }
}
	 











