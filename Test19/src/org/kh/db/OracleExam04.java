package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//delete from ���̺��� [where �ʵ��=��] : ���̺��� Ư�� ���ǿ� �´� ���ڵ� ���� 
public class OracleExam04 {
	public static void main(String[] args) {
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//���� ����(ON/OFF) �ϰ�, SQL ���� ����
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql = "delete from student where no=?";
		//String sql = "delete from student where name=?";
		//String sql = "delete from student where point=?";
		Student st = new Student(5, "������", 99);
		int i = 0;
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getNo());
				//pstmt.setString(1, st.getName());
				//pstmt.setInt(1, st.getPoint());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"���� ���������� ó���Ǿ����ϴ�.");
				} else {
					System.out.println("ó�� ����");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}