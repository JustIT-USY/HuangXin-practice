import java.util.Scanner;

public class Student_Manager {
	public static void main(String[] args) {
		System.out.println("学籍管理系统v1.0");
		System.out.println("---添加学生学籍请输入：1");
		
		System.out.print("请输入操作数字：");
		int t = new Scanner(System.in).nextInt();
		if(t==1) {
			System.out.println("请依次输入学生姓名、性别、健康状况(可不填)、学历(可不填)，每个字段完成时输入回车：");
			String[] ss = new String[4];
			Scanner sc1 = new Scanner(System.in);
			ss[0] = sc1.nextLine();
			for(int i=1;i<4;i++) {
				ss[i] = sc1.nextLine();
			}
			addStudent(ss[0], ss[1], ss[2], ss[3]);
		}
		
		System.out.println("程序结束！ - -");
	}
	
	private static void addStudent(String name,String gender,String health,String status) {
		Student s = new Student();
		s.setName(name);
		s.setGender(gender);
		if(health!=null) s.setHealth(health);
		if(status!=null) s.setStatus(status);
		
		System.out.println(s.toString());
		System.out.println("添加学籍成功！");

	}

}
