package it.unirc.twd.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


import it.unirc.twd.utils.DBManager;

public class UtenteDAO {
	private static Connection conn = null;

	public Utente getUtente(Utente ut) {
		String query = "Select * FROM Utente where username = ?";
		Utente res = null;
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, ut.getUsername());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				res=new Utente();
				res.setUsername(rs.getString("username"));
				res.setPassword(rs.getString("password"));
				res.setAutorita(rs.getString("autorit�"));
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		DBManager.closeConnection();
		return res;
	}
	public boolean SalvaUtente(Utente ut) {
		String query = "INSERT INTO Utente VALUES (?, ?, ?)";
		boolean esito=false;
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, ut.getUsername());
			ps.setString(2, ut.getPassword());
			ps.setString(3, ut.getAutorita());
			int tmp=ps.executeUpdate();
			if(tmp==1) {
				esito=true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		DBManager.closeConnection();
		return esito;
	}
	public boolean EliminaUtente(Utente ut) {
		String query = "DELETE * FROM Utente WHERE Username = ?";
		boolean esito=false;
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, ut.getUsername());
			int tmp=ps.executeUpdate();
			if(tmp==1) {
				esito=true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		DBManager.closeConnection();
		return esito;
	}
	public boolean AggiornaUtente(Utente ut) {
		String query = "UPDATE Utente SET Password = ?, autorit� = ? WHERE Username = ?";
		boolean esito=false;
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, ut.getPassword());
			ps.setString(2, ut.getAutorita());
			ps.setString(3, ut.getUsername());
			int tmp=ps.executeUpdate();
			if(tmp==1) {
				esito=true;
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		DBManager.closeConnection();
		return esito;
	}

	public Vector<Utente> getAll(){
		String query = "SELECT * FROM Utente";
		Vector<Utente> list = new Vector<Utente>();
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(recordToUtente(rs));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return list;
	}

	protected Utente recordToUtente(ResultSet rs) throws SQLException {
		Utente res=new Utente();
		res.setUsername(rs.getString("Username"));
		res.setPassword(rs.getString("Password"));

		res.setAutorita(rs.getString("Autorit�"));
		return res;

	}
	public boolean login(Utente u) {
		String query="SELECT * FROM hr.Utente WHERE Username = ? AND Password = ?";
		boolean esito=false;
		conn=DBManager.startConnection();
		System.out.println("Sto qui");
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			System.out.println(ps);
			int tmp=ps.executeUpdate();
			if(tmp==1) {
				esito=true;
				System.out.println(esito);
			}
			System.out.println("Dopo if" + esito);
		}catch(Exception e) {
			e.getStackTrace();
		}
		DBManager.closeConnection();
		System.out.println(esito);
		return esito;
	}
	
	public boolean LoginUtente(Utente utente) {
		boolean esito=false;
		String query="SELECT * FROM utente where nome=? and password =? ";
		PreparedStatement ps;
		Connection conn=DBManager.startConnection();
		try {
		ps = conn.prepareStatement(query);
		
		ps.setString(1, utente.getUsername() );
		
		ps.setString(2, utente.getPassword() );
		int tmp=ps.executeUpdate();
		if (tmp==1)
		esito=true;
		} catch (SQLException e) {
		e.printStackTrace();
		}
		DBManager.closeConnection();
		return esito;
	}
}