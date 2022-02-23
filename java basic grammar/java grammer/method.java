import java.io.BufferedWriter;
import java.sql.SQLOutput;

import javax.sql.rowset.serial.SQLOutputImpl;

import org.jcp.xml.dsig.internal.SignerOutputStream;

// �޼ҵ� (�ڵ带 ������ �� �ְ� ���ش�.)
// void main(String[] args) {  << �̰��� �޼ҵ��̴�.
// �޼ҵ带 ���� �� public static�̶�� ����� �Ѵ�.

// �޼ҵ��� ���ǿ� ȣ��
// ���� �޼ҵ带 ����� ���� ����, ������� �޼ҵ带 �����ϴ� ���� ȣ��
// ������� 0 1 2 3 4 5 6 7 8 9
public class method {

	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
	}

	public static void main(String[] args) {
		numbering();
	}
}

//  37��ó�� numbering();�̶���ϸ� 26���� �޼ҵ� numbering�� ������ ����ȴ�.
//  [����]
//	public static void numbering() {
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		
//	}

//   [ȣ��]
//   public static void main(String[] args) {
//	    numbering();
//  }
//  }

 
// 1. ��Ȱ��
//  ������� 5�� ����ȴ�.
public class MethodDemo3 {
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
    }
}

 
// �Է°�
// �Ű�����(int limit)�� ����(5)
// [��� 1]
// �ʿ信 ���� 0���� 4���� ����ϰ� �Ͱų� 0���� 8���� ����ϰ� �ʹٸ� ��� �ؾ� �ұ�?
// �Է� ���� ���� �ٸ� ��� ���� ������ �޼ҵ带 �����ϸ� �ȴ�. 
// ����� 0���� 4���� ����Ѵ�. 
// �޼ҵ� numbering�� ��ȣ �ȿ� ��ġ�� ���� 5�� �� �޼ҵ尡 ȣ��� �� limit�̶�� ������ ���� �ȴ�. 
public class MethodDemo4 {
    public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(5);
    }
}

// [��� 2]
// ���� �ڵ�� �Ʒ��� �ڵ�� ������ �ǹ̸� ���´�. 
public static void numbering() {
    int limit = 5;
    int i = 0;
    while (i < limit) {
        System.out.println(i);
        i++;
    }
}

// ������ ����
// �޼ҵ�� �������� �Է°��� �����ϰ� �ʹٸ� ��� �ؾ� �ұ�?
// ����� ������ ���� ���� ������ ���� �Է°����� �����ϸ� ��.
// ����� 1���� 4������ ��µȴ�.

public class MethodDemo5 {
	 
    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(1, 5);
    }
 
}


// ��°� 1
// return
// return �ڿ� ������� ���� �޼ҵ��� ����� ��ȯ�Ѵ�. ���ÿ� �޼ҵ带 �����Ų��.
// String numbering�� numbering��� ������ �ݵ�� ���ڿ��� �޴� �� return�ϴ� ������� ���̴�.
public class MethodDemo6 {
	
	// return�� ���ؼ� ��ȯ�� ���� ������ ������ �޼ҵ��� �̸� ���� ������־�� �Ѵ�.
	// ���� ��ȯ ���� ���ٸ� �Ʒ��� ���� void�� �����ش�.
	public static String numbering(int init, int limit) {  
        int i = init;
        String output = "";    // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
        while (i < limit) {
            output += i;     // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
            i++; 
        }
        // �߿�!!! output�� ��� �ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ�ϸ� �ȴ�.
        return output;
    }
 
    public static void main(String[] args) {   // ��ȯ ���� ���ٸ� void�� �����ش�.
        String result = numbering(1, 5);    // �޼ҵ� numbering�� ������ ���� ���� result�� ����.
        System.out.println(result);     // ���� result�� ���� ȭ�鿡 ����Ѵ�.
    }
}

// ��°� 2
// FileWriter�� ���Ͽ� ����Ѵٴ� ��
public class MethodDemo7 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;		
		}
		return output;
	}
	
	public static void main (String[] args) {
		String result = numbering (1, 5);
		System.out.println(result);
		   BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
		   out.write(result);
		   out.close();
	   // 165~167�� �ڵ�� out.txt��� ������ ����� �� ���Ͽ� result��� ���� ����ϴ� ����� �ڵ��.  

	}


// return�� ���� ��ȯ�ϴ� ������ �Ѵ�. �׷��� return�� �޼ҵ带 �ߴܽ�Ű�� ���ҵ� �Ѵ�. 
// ���� �ڵ�� ���������� ���� �ʴ´�.
// �ֳ��ϸ�, return �� �޼ҵ带 �����Ű�� ������ �ϹǷ� return 1�� ó�� ������ ������ ������ 2,3�� ������� �ʱ⶧���̴�.	
public class returnDemo {
	public static int one() {
		return 1;
		return 2;
		return 3;
	}
	
	public static void main (String[] args) {
		System.out.println(one());
	}
}

// ������ �Ʒ��� ������ ������ ���� ����.
// return�� ���� �� ���������� return�� �ߺ������� ����� ���ɼ��� ���� �����̴�. 
// return "none";�� �����ϸ� �������� ���� ���� ���̴�. 
public class returnDemo2 {
	public static String num(int i) {
		if (i == 0) {
			return "Zero";
		} else if (i==1) {    // true�̱� ������ ��µ�. �� ���Ŀ��� ��¾ȵ�
			return "one";
		} else if (i == 2) {
			return "two";
		}
		return "none";
	}
	
	public static void main (String[] args) {
		System.out.println(num(1));   // i�� 1 ����
	}
	
	
}


// ������ return
// �޼ҵ�� ���� ���� �Է� ���� ���� �� �ִ�. �׷��ٸ� ���� ���� ���� ����ϰ� �ʹٸ�? 
// �ڹٴ� ���������� �׷� ����� �������� �ʴ´�. �ϳ��� ������ �������� ���� ��Ƽ� ����ϸ� �ȴ�.
// �ϳ��� �޼ҵ�� �ϳ��� ������ ��ȯ�� �� �ֱ� ������ ������ ȸ�������� ��ȯ�ϴ� �޼ҵ带 �������.
public class returnDemo3 {
	public static String getMember1() {
		return "������";
	}
	
	public static String getMember2() {
		return "������";
	}
	
	public static String getMember3() {
		return "���̶�";
	}
	
	public static void main (String[] args) {
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
	}
}


// �ɹ��� ��� �ִ� �迭�� ��ȯ�ϰ� �ִ�. �޼ҵ� getMembers�� ������ �迭�� members ������ ��Ҵ�. 
// �� ������ �̿��ؼ� ���� ���� �����͸� ó�� �� �� �ְ� �ȴ�. 
// String[] getMembers()�� ���� getMembers()�� return�� return���� ���ڿ��� �����͸� ���� �� �ִ� �迭�̴�.  
public class returnDemo4 {
	public static String[] getMembers() {
		String[] members = {"������", "������", "���̶�"};
		return members;
	}
	
	public static void main (String[] args) {
		String[] members = getMembers();
	}
}









