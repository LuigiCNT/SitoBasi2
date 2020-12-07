package it.unirc.twd.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import it.unirc.twd.utils.DBManager;


public class AttrezziDAO {
	private static Connection conn = null;

	public Attrezzi getAttrezzi(Attrezzi a) {
		String query = "Select * FROM Attrezzi where id = ?";
		Attrezzi res = null;
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, a.getId());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				res=new Attrezzi();
				res.setNome(rs.getString("Nome"));
				res.setId(rs.getInt("Id"));
				res.setGruppo_muscolare(rs.getString("Gruppo_muscolare"));
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		DBManager.closeConnection();
		return res;
	}
	public boolean SalvaAttrezzi( Attrezzi a) {
		String query = "INSERT INTO id VALUES (?, ?, ?)";
		boolean esito=false;
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, a.getNome());
			ps.setInt(2, a.getId());
			ps.setString(3, a.getGruppo_muscolare());
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
	public boolean EliminaAttrezzi(Attrezzi a) {
		String query = "DELETE * FROM Attrezzi WHERE id = ?";
		boolean esito=false;
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, a.getId());
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
	public boolean AggiornaAttrezzi(Attrezzi a) {
		String query = "UPDATE Attrezzi SET nome = ?, gruppo muscolare = ? WHERE id = ?";
		boolean esito=false;
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, a.getNome());
			ps.setString(2, a.getGruppo_muscolare());
			ps.setInt(3, a.getId());
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

	public Vector<Attrezzi> getAll(){
		String query = "SELECT * FROM Attrezzi";
		Vector<Attrezzi> list = new Vector<Attrezzi>();
		conn=DBManager.startConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.add(recordToAttrezzi(rs));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return list;
	}

	protected Attrezzi recordToAttrezzi(ResultSet rs) throws SQLException {
		Attrezzi res=new Attrezzi();
		res.setNome(rs.getString("Nome"));
		res.setId(rs.getInt("Id"));
		res.setGruppo_muscolare(rs.getString("Gruppo_muscolare"));
		return res;

	}
}
