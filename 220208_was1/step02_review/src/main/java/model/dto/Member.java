package model.dto;

public class Member {
	private String name;
	private String age;
	private String gender;
	private String hobby;

	public Member(String name, String age, String gender, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<br>" + "That's it !" + "<br><br>")
			.append("Name : " + name + "<br>")
			.append("Age : " + age + "<br>")
			.append("Gender : " + gender + "<br>")
			.append("Hobby : " + hobby + "<br>");
		return sb.toString();
	}
	
	
}
