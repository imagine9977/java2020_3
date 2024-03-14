package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.kh.db.Student;

public class MariaDBExam3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmtInsert = null;
		ResultSet rs = null;
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(6, "kim", 95);
		String sql = "select * from student";
		String sq2 = "update student set name=?, point=? where no=?";

		String name;
		int  no, value;
		System.out.println(sq2+"\n Please Enter the 3 parameters: ");
		name = sc.next();
		value = sc.nextInt();
		no = sc.nextInt();
				
		List<Student> stList = new ArrayList<>();
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmtInsert = con.prepareStatement(sq2);
				pstmtInsert.setString(1, name);
				pstmtInsert.setInt(3, no);
				pstmtInsert.setInt(2, value);
				int i =pstmtInsert.executeUpdate();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(i>0) {
					System.out.println("정상실행");
				}else {
					System.out.println("실행오류");
				}
				while (rs.next()) {
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
					stList.add(st);	
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 로딩 실패");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for (Student s : stList) {
			System.out.println(s.toString());
		}
		
	}
}
