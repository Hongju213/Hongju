package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		
		{
            Connection conn = null;
            try {
				/*
				 * String user = "Hong"; String pw = "kimids1@"; String url =
				 * "jdbc:oracle:thin:@127.0.0.1:3306";
				 */
                Class.forName("com.mysql.cj.jdbc.Driver");        
                String url = "jdbc:mysql://127.0.0.1/boardDB?serverTimezone=UTC";
                
                conn = DriverManager.getConnection(url, "Hong", "kimids1@");
                
                System.out.println("Database에 연결되었습니다.\n");
                
            } catch (ClassNotFoundException cnfe) {
                System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
            } catch (SQLException sqle) {
                System.out.println("DB 접속실패 : "+sqle.toString());
            } catch (Exception e) {
                System.out.println("Unkonwn error");
                e.printStackTrace();
            }
            return conn;     
        }
	}
}
