import java.util.Scanner;

public class Student_Manager {
	public static void main(String[] args) {
		System.out.println("ѧ������ϵͳv1.0");
		System.out.println("---���ѧ��ѧ�������룺1");
		
		System.out.print("������������֣�");
		int t = new Scanner(System.in).nextInt();
		if(t==1) {
			System.out.println("����������ѧ���������Ա𡢽���״��(�ɲ���)��ѧ��(�ɲ���)��ÿ���ֶ����ʱ����س���");
			String[] ss = new String[4];
			Scanner sc1 = new Scanner(System.in);
			ss[0] = sc1.nextLine();
			for(int i=1;i<4;i++) {
				ss[i] = sc1.nextLine();
			}
			addStudent(ss[0], ss[1], ss[2], ss[3]);
		}
		
		System.out.println("��������� - -");
	}
	
	private static void addStudent(String name,String gender,String health,String status) {
		Student s = new Student();
		s.setName(name);
		s.setGender(gender);
		if(health!=null) s.setHealth(health);
		if(status!=null) s.setStatus(status);
		
		System.out.println(s.toString());
		System.out.println("���ѧ���ɹ���");

	}

}
