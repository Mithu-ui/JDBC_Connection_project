package Project_DBMS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import javax.management.InvalidApplicationException;

public class MainClass {

	public static void main(String[] args) throws InvalidApplicationException{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("1. Read the data");
		System.out.println("2. Insert the data to the table");
		System.out.println("3. Update the data to the table");
		System.out.println("4. Delete the data from the table");
		System.out.println("5. Exit");
		int num=sc.nextInt();
		sc.nextLine();
		try {
			switch (num) {
			case 1: 
				System.out.println("Enter query to read the data");
				String query=sc.nextLine();
				readQuery(query);
				break;
			case 2:
				System.out.println("Enter query to insert data in table");
				query=sc.nextLine();
				sc.nextLine();
				InsertUpdateDeleteQuery(query);
				break;
			case 3:
				System.out.println("Update the data to the table: ");
				query=sc.nextLine();
				sc.nextLine();
				InsertUpdateDeleteQuery(query);
				break;
			case 4:
				System.out.println("Delete the data from the table: ");
				query=sc.nextLine();
				sc.nextLine();
				InsertUpdateDeleteQuery(query);
				break;
			case 5:
				flag=false;
				System.out.println("Exiting...😒,poda dei....😈😈😈");
				break;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		
	}
	public static void readQuery(String query) throws SQLException{
		PreparedStatement pt=ConnectionDAO.getConnection(query);
		ResultSet res=pt.executeQuery();
		ResultSetMetaData rsmd=res.getMetaData();
		while(res.next()) {
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.print(res.getString(i)+" ");
			}
			System.out.println();
		}
	}
	public static void InsertUpdateDeleteQuery(String query) throws SQLException{
		PreparedStatement pt=ConnectionDAO.getConnection(query);
		int val=pt.executeUpdate();
		System.out.println(val+" Row/(s) affected....");
	}
}
