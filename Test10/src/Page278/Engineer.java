package Page278;
public class Engineer extends Employee{
	public Engineer(String name) {  //1.호출자 생성
		super(name);
		// TODO Auto-generated constructor stub
	}
	private String skillSet; // 2. 스정대문자
	public String getSkillSet() {
		return skillSet; //대문자 처리
	}
	public void setSkillSet(String skillSet) { //3. 대가로 추가
		this.skillSet=skillSet;
	}
	
}