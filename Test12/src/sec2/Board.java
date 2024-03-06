package sec2;

public class Board {
	private int bno;
	private String title;
	private String username;
	private String date;
	private String content;
	private String author;
	private int visited;
	
	public Board() {}
	public Board(int bno) {this.bno=bno;}
	public Board(int bno,String title) {
		this.bno=bno; this.title=title;
	}
	public Board(int bno,String title, String username,
			String date,String content,String author, int visited) 
	{this.bno=bno; this.title=title; this.username=username;
	this.date=date;this.content=content;this.author =author;this.visited=visited;}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", username=" + username + ", date=" + date + ", content="
				+ content + ", author=" + author + ", visited=" + visited + "]";
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	} 
	
}
