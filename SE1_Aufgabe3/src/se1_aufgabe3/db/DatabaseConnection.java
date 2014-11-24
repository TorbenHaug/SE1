package se1_aufgabe3.db;

import java.sql.*;

public class DatabaseConnection
{
	private Connection m_connection;

	public boolean connect(String inURL, String inUser, String inPassword)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			return false;
		}

		try
		{
			this.m_connection = DriverManager.getConnection(inURL, inUser, inPassword);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public ResultSet exec(String inQuery)
	{
		try
		{
			return this.m_connection.prepareStatement(inQuery).executeQuery();
		}
		catch(SQLException e)
		{
			return null;
		}
	}
}