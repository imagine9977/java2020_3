package project;
class Student{
	private String name;
	private int no;
	private Subject sj;
	public Student() {
		super();
	}
	public Student(String name, int no, Subject sj) {
		super();
		this.name = name;
		this.no = no;
		this.sj = sj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public Subject getSj() {
		return sj;
	}
	public void setSj(Subject sj) {
		this.sj = sj;
	}
	
}

class Subject{
	private int code;
	private String name;
	private String style;
	public Subject( int code, String name,String style) {
		super();
		this.name = name;
		this.code = code;
		this.style = style;
	}
	public Subject() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
}
class Score{
	private int no;
	private Subject subject;
	private int point;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Score() {
		super();
	}
	public Score(int no, Subject subject, int point) {
		super();
		this.no = no;
		this.subject = subject;
		this.point = point;
	}
}
public class GoodSchool {
	
}
