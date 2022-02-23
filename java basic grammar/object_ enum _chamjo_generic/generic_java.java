// ���׸�
// Ŭ���� ���ο��� ����� ������ Ÿ���� �ܺο��� �����ϴ� ���
class Person<T> {  
	public T info;  // Person�� �ʵ� info�� ������ Ÿ���� T�� �Ǿ��ִ�. �׷��� T��� ������ Ÿ���� �������� �ʴ´�.
}

public class GenericDemo {
	
	public static void main(String[] args) {
		Person<String> p1 = new Person<String>();  // 3���� T�� <>�ȿ� ������ ������ Ÿ�Կ� ���ؼ� �����ȴ�.
		Person<StringBuilder> p2 = new Person<StringBuilder>();	
	}
}
// ������ Ÿ�� ���
// �̰��� ������ �ν��Ͻ��� ������ �� ����� <> ���̿� � ������ Ÿ���� ����ߴ��Ŀ� �޷��ִ�.
// p1.info : String
// p2.info : StringBuilder

// ���׸� 
// Ŭ������ ������ ���� info�� ������ Ÿ���� Ȯ������ �ʰ� �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ���


// Ÿ���� ������
class StudentInfo {
	public int grade;
	StudentInfo(int grade){ this.grade = grade; }	
}

class StudentPerson {
    public StudentInfo info;
    StudentPerson(StudentInfo info) { this.info = info; } 	
}

class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}

class EmployeePerson {
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info) { this.info = info; }
}

public class GenericDemo {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		 System.out.println(sp.info.grade);   // 2
		
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		 System.out.println(ep.info.rank);  // 1
		
	}
}
// StudentPerson�� EmployeePerson�� ��ǻ� ���� ������ ������ �ִ�. 
// �ߺ��� �߻��ϰ� �ִ� ���̴�. �ߺ��� �����غ���.
class StudentInfo {
	public int grade;
	StudentInfo(int grade) { this.grade = grade; }  	
}

class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}

class Person {  
	public Object info;  
	// StudentInfo�� EmployeeInfo�� ������ ������ ������ Ÿ������ ������ �ϸ� �Ǵ� ���̴�.
	// �׷��� ���� �� �ΰ��� ���� ������ ����.
	// �׷��� ��� Ŭ�������� ������ Object�� ����ߴ�. ���� ��� Ŭ������ �ν��Ͻ��� �� �� �ִ�.
	Person(Object info) { this.info = info; }
}

class GenericDemo {
	public static void main(String[] args) {
		person p1 = new Person("����");
		EmployeeInfo ei = (EmployeeInfo)p1.info;
	 // p1�� �ִ� info�� Object��� �Ϲ����� ������ Ÿ���̴�.
	 // �׷��� ei�� ��� �����ʹ� EmployeeInfo��� �ϴ� �ſ� ��ü���� ������ Ÿ���̱� ������ ����ȯ�� ���־�� �Ѵ�.
	 // ����ȯ�� ���� ���� ()�� ���ְ� �׾ȿ� ��ü���� ������ Ÿ���� ���ָ� �ȴ�.
		System.out.println(ei.rank);
		
	}
}
// ���� �ڵ�� �������� ������������ ������ �ϸ� ������ �߻��Ѵ�.
// Ŭ���� person�� �����ڴ� �Ű����� info�� ������ Ÿ���� object�̱� �����ε� �̴� �ٽø��� ��� ��ü�� �� �� �ִ� ���̴�.
// �׷��� ������ ���� EmployeeInfo�� ��ü�� �ƴ϶� String�� �͵� ������ ������ �߻����� �ʴ´�. ��� ��Ÿ�� ������ �߻��� �� �ִ�.
// �������� �⺻�� ��� ������ �������� �߻��� �� �ֵ��� �����ϴ� ���̴�.
// ��Ÿ���� ������ ���ø����̼��� �����ϰ� �ִ� ��Ȳ�̱� ������ ��Ÿ�ӿ� �߻��ϴ� ������ �׻� �ɰ��� ������ ������ �� �ִ�.
// ��, ��� Ÿ���� �� �� �ֱ� ������ Ÿ���� �����ϰ� ������ �� ���� �ȴ�.


// ���׸�ȭ
// intValue();�� ȣ�� >> Int Ÿ���� ������Ÿ������ �����ִ� �޼ҵ��̴�.(��������������)
class StudentInfo {
	public int grade;
	StudentInfo(int grade) { this.grade= grade; }
}

class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}

class Person<T> {
	public T info;
	Person(T info) { this.info = info; }
}

public class GenericDemon {
	public static void main(String[] args) {
	Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));	
	EmployeeInfo ei1 = p1.info;	
	System.out.println(ei1.rank);   // ����
	
	Person<String> p2 = new Person<Stirng>("����");
	String si2 = p2.info;
	System.out.println(si2.rank);  // ������ ����
	
	Person<StudentInfo> p3 = new Person<StudentInfo>(new StudentInfo(2));
	StudentInfo si = p3.info;
	System.out.println(si.grade);
	
	
	}
}
// p1�� �� �����Ѵ�. 
// p2�� ������ ������ �߻��Ѵ�. p2.info�� String�̰� String�� rank �ʵ尡 ���µ� �̸� ȣ���ϰ� �ֱ� �����̴�.


// ������ ���׸� (Ŭ���� ������ �������� ���׸��� �ʿ�� �ϴ� ���)
class EmployeeInfo {
	public int rank;
	EmployeeInfo(inr rank) { this.rank = rank; }
}

class Person<T, S> {
	public T info;
	public S id;
	Person(T info, S id) {
	this.info = info;
	this.id =id;
	}
}

public class GenericDemo{
	public static void main(Stirng[] args) {
	Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1), 1); 	
	}
}
// ���� ���� ���� �� �������� ���� ������ �޸�(,)�� ���ָ� �ȴ�.
// ���� ������ ������ �߻��ϴ� ���̱⿡ ���¸� ����.


// �� ������ ������ �ذ��غ���
// �⺻ ������ Ÿ�԰� ���׸�
// ���׸��� ���� ������ Ÿ��(Ŭ����, �������̽�, �迭)�� ���ؼ��� ����� �� �ִ�. �⺻ ������ Ÿ�Կ����� ����� �� ����.
class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}

class Person<T, S> {
	public T info;
	public S id;
	Person(T info, S id) {
	this.info = info;
	this.id = id;
	
	}
}

public class GenericDemo{
	public static void main(Stirng[] args) {
	EmployeeInfo e = new EmployeeInfo(1);
	Integer i = new Integer(10);
	Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
	System.out.println(p1.id.Integer);

	}
}
// Integer�� �⺻ ������ Ÿ���� int�� ���� ������ Ÿ������ ��ȯ���ִ� ������ �Ѵ�.
// �̷��� Ŭ������ Wrapper Ŭ������� �Ѵ�.
// ���п� �⺻ ������ Ÿ���� ����� �� ���� ���׸����� int�� ����� �� �־���.
// ���׸��� ������ �����ϴ�.


// �޼ҵ忡 ����
class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}

class Person<T, S> {
	public T info;
	public S id;
	Person(T info, S id) {
		this.info = info;
		this.id = id;
		
	}
	
	public <U> void printInfo(U info) {   
	// �޼ҵ� �ȿ��� info��� �ϴ� �Ű������� ����ϴµ� �� �Ű������� ������ Ÿ���� ���� Ȯ���ϰ� ���� ���� �� <U>�� ���ش�.
		System.out.println(info);
    }
}

public class GenericDemo {
	public static vodi main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		p1.<EmployeeInfo>printInfo(e);
	//	<EmployeeInfo>�� 205�࿡ <U>�̴�.
		p1.printInfo(e);
	//  216���� �ڵ带 �����ϸ� �ȴ�. �ֳ��ϸ� <EmployeeInfo>�� ������ �����ϱ� �����̴�.
	}
}


// ���׸��� ����
// extends
// ���׸����� �� �� �ִ� ������ Ÿ���� Ư�� Ŭ������ �ڽ����� ������ �� �ִ�.
abstract class Info {  // EmployeeInfo�� �θ� Ŭ������ Info��� �����Ͽ���.
	public abstract int getLevel();  
}

class EmployeeInfo extends Info {  // �� �ڽ��� EmployeeInfo�� getLevel�̶�� �ϴ� �޼ҵ带 �����ϰ� �ִ�.
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
	public int getLevel() {
		return this.rank;	
		
	}
}

class Person<T extends Info> {   // Person�� T�� info Ŭ������ �� �ڽ� �ܿ��� �� �� ����.
	public T info;
	Person(T info) { this.info = info; }
}

public class GenericDemo{
	public static void main(String[] args) {
		Person p1 = new Person(EmployeeInfo(1));
		Person<String> p2 = new PersonInfo<String>("����");
	}
}

// extends�� ��ӻӸ� �ƴ϶� ���������� ����� �� �ִ�.
interface Info {
	int getLevel;
}

class EmployeeInfo implements Info{
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info> {  // ���⼭ extends�� Info�� �θ� �����ĸ� ���� ���̱� ������ �ᵵ �ȴ�.
	public T info;
	Person(T info) { this.info = info; }
}

public class GenericDemo{
	public static void main(String[] args) {
		Person p1 = new Person (new EmployeeInfo(1));
		person<String> ps = new Person<String>("����");
	}
}




















