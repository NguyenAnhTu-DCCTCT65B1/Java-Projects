package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


/*
 * - Java JDBC ( Java Database Connectivity ) la 1 API de ket noi va thuc thi truy van voi co so du lieu
 * - API ( Application programming interface ) la pt trung gian ket noi cac ung dung va thu vien khac nhau => trao doi du lieu
 * - Co 4 loai trinh dieu khien JDBC:
 *   + Trinh dieu khien JDBC-ODBC: Dich JDBC sang ODBC va dua vao trinh dieu khien ODBC de giao tiep voi co so du lieu
 *             JDBC API <-> JDBC -> ODBC <-> Database
 *     Hien tai, nen su dung cac trinh dieu khien do nha cung cap database cung cap va nhieu trinh dieu khien tot hon da co san
 *     => bi loai bo trong java 8
 *     NOTE: dung cho muc dich phat trien va thu nghiem
 * 
 *   + Trinh dieu khien Native API: duoc viet 1 phan bang Java va 1 phan bang ma goc, giao tiep voi client API cua database. 
 *     Khi su dung trinh dieu khien, phai cai dat 1 so ma danh rieng vao may khach ngoai thu vien Java
 *             JDBC API <-> Native API Driver <-> Database
 *     NOTE: dung khi loai 3 va 4 chua co san cho database
 *              
 *   + Trinh dieu khien giao thuc mang: la 1 thu vien client thuan tuy su dung giao thuc doc lap voi database de giao tiep cac 
 *     yeu cau database toi 1 thanh phan may chu, sau do chuyen cac yeu cau thanh 1 giao thuc danh rieng cho database.
 *             Client <-> API <-> Network Protocol driver <-> Middle ware <-> Database 
 *     NOTE: dung khi can truy cap vao nhieu loai co so du lieu cung 1 luc
 *   
 *   + Trinh dieu khien thuan Java: su dung thu vien Java thuan tuy de dich cac yeu cau JDBC truc tiep sang 1 giao thuc danh rieng 
 *     cho database
 *     NOTE: dung khi can truy cap vao 1 loai co so du lieu (Oracle, ...)
 * 
 * - Statement interface cung cap cac pt de thuc thi cac cau lenh truy van voi co so du lieu
 * - ResultSet tro den 1 hang cua 1 bang
 * - PreparedStatement la 1 sub-interface cua Statement, duoc su dung de thuc hien truy van tham so
 * => Hieu suat se nhanh hon vi truy van duoc bien dich chi 1 lan
 */

public class JDBC {
	
	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Cac thong so 
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=SV;trustServerCertificate=true";
			String username = "sa";
			String password = "1234567";
			
			//1. Tao ket noi
			Connection c = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to SQL Server !!!");
			
			//2. Tao Statement
			Statement smt = c.createStatement();
			String query = "SELECT * FROM dbo.student";
			
			//3. Tao Resultset
			ResultSet r = smt.executeQuery(query);
			while(r.next()) {
				System.out.println(r.getInt("id") + " " + r.getString("name") + " " + r.getString("address"));
			}
			closeConnection(c);
			
		} catch (SQLException e) {
			System.out.println("Error !!!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}