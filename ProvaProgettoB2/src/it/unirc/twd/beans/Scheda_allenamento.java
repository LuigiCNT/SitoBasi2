package it.unirc.twd.beans;

import java.sql.Blob;
import java.sql.Date;

public class Scheda_allenamento {
	private String Username;
	private String tipologia;
	private Date   data;
	private Blob Scheda;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Blob getScheda() {
		return Scheda;
	}
	public void setScheda(Blob scheda) {
		Scheda = scheda;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Scheda == null) ? 0 : Scheda.hashCode());
		result = prime * result + ((Username == null) ? 0 : Username.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((tipologia == null) ? 0 : tipologia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scheda_allenamento other = (Scheda_allenamento) obj;
		if (Scheda == null) {
			if (other.Scheda != null)
				return false;
		} else if (!Scheda.equals(other.Scheda))
			return false;
		if (Username == null) {
			if (other.Username != null)
				return false;
		} else if (!Username.equals(other.Username))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (tipologia == null) {
			if (other.tipologia != null)
				return false;
		} else if (!tipologia.equals(other.tipologia))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Scheda_allenamento [Username=" + Username + ", tipologia=" + tipologia + ", data=" + data + ", Scheda="
				+ Scheda + "]";
	}
	public Scheda_allenamento(String username, String tipologia, Date data, Blob scheda) {
		super();
		Username = username;
		this.tipologia = tipologia;
		this.data = data;
		Scheda = scheda;
	}
	public Scheda_allenamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
