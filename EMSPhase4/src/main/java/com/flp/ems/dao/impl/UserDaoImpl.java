package com.flp.ems.dao.impl;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flp.ems.dao.UserDao;
import com.flp.ems.model.user.User;
import com.flp.ems.util.MyConnection;

public class UserDaoImpl implements UserDao {
	
	@Override
	public boolean authenticate(User user) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		try {
			String sql="select username,password,role from test.user where username=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,user.getUsername());
			//ps.setString(2,user.getPassword());
			
			//now executing the ps
			rs=ps.executeQuery();

		if(rs.next()){
			if((rs.getString(1).equalsIgnoreCase(user.getUsername()))&&(rs.getString(2).equals(user.getPassword()))&&(rs.getString(3).equals(user.getRole()))){
				return true;
			}
			else{
				return false;
			}
		}
			
			//getting the data from rs
	
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
					if(con!=null)
						MyConnection.closeCon();
			} catch (SQLException e2) {
				System.out.println("SQL Exception");
			}
	}
		return false;
	}

	public boolean changePwd(User user) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		try {
			String sql="update test.user set password=? where password=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1,user.getNewPassword());
			ps.setString(2,user.getPassword());
			
			//now executing the ps
			int i=ps.executeUpdate();

		if(i==1){
			
			return true;
		}
			else{
				return false;
			}
		
			
			//getting the data from rs
	
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
					if(con!=null)
						MyConnection.closeCon();
			} catch (SQLException e2) {
				System.out.println("SQL Exception");
			}
	}
		return false;
	}
}
