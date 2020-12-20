package it.unirc.twd.beans;
import it.unirc.twd.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utente u = new Utente();
		UtenteDAO uDAO = new UtenteDAO();
		u.setUsername("luigi1");
		u=uDAO.getByUsername(u.getUsername());
		Boolean res = uDAO.login(u);
		System.out.println(res);
		
	}

}
