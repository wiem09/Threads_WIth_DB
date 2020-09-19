package Threads;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Livre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	Class.forName("org.postgresql.Driver");
	}catch(ClassNotFoundException e)
{System.err.println(e);
System.exit(-1);
}
try {
	String url="jdbc:postgresql://localhost:5432/Exercice1";
	String user="postgres";
	String pwd="admin";
	Connection con=DriverManager.getConnection(url, user, pwd);
	con.setAutoCommit(false);
	System.out.println("connection avec succes");
	Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	String req="SELECT * FROM public.\"Livre\"";
	ResultSet rs=s.executeQuery(req);
	while(rs.next()) {
	int id=rs.getInt("ISBN");
	System.out.println(id);
	}
	con.commit();
	con.close();
	System.out.println("deconnection avec succes");
	}catch(Exception e) {
	e.printStackTrace();
}

	}

}
