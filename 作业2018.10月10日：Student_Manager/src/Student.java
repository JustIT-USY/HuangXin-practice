
public class Student {
	String name;
	String gender;
	String health;
	String status;
	
	public Student() {
		
	}
	public Student(String name) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ѧ��ѧ�� [������" + name + ", �Ա�" + gender + ", ����״����" + health + ", ��ǰѧ����" + status + "]";
	}
}