package com.ems.phase3.listener;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;


public class ConnectionListener implements ServletContextListener {

   

    public void contextInitialized(ServletContextEvent event)  { 
	       DataSource dataSource=null;
	       Connection connection=null;
	       Context initContext;
		try {
			initContext = new InitialContext();
			 Context envContext=(Context) initContext.lookup("java:comp/env");
			 dataSource=(DataSource) envContext.lookup("jdbc/ems");
			 if(dataSource!=null)
			 {
				 System.out.println("DataSource Obtained..."+dataSource);
				 event.getServletContext().setAttribute("ds",dataSource);
				 
			 }
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
         
    }
	
}
