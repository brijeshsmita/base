package com.cg.sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.cg.connection.MyConnection;
public class BatchTransaction {
	public static void main(String[] args) {
//by default each & every query is auto-committed in jdbc
		Connection con=MyConnection.getConnection();
		Statement ps=null;
		ResultSet rs= null;
String sql1="insert into test.emp values(124,'Neeta',56756.90)";
String sql2="insert into test.emp values(125,'Meeta',23534.90)";
String sql3="insert into test.emp values(123,'Reeta',37547.90)";
		try {
			//enablr transactions
		con.setAutoCommit(false);//here tx boundary begins
			ps=con.createStatement();			
			ps.addBatch(sql1);
			ps.addBatch(sql2);
			ps.addBatch(sql3);
			int rec [] =ps.executeBatch();
				System.out.println("batch Executed!!");
		con.commit();//tx done or completed			
		} catch (Exception e) {
			e.printStackTrace();
		}//end of catch
		finally{
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}//end of catch			
		}//end of finally
	}//end of main
}//end of class
