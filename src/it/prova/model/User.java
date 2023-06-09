package it.prova.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
	private Long id;
	private String nome;
	private String cognome;
	private String login;
	private String password;
	private LocalDate dateCreated;

	public User() {
	}

	public User(String nome) {
		this.nome = nome;
	}

	public User(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public User(String nome, String cognome, String login, String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.login = login;
		this.password = password;
	}

	public User(String nome, String cognome, String login, String password, LocalDate dateCreated) {
		this.nome = nome;
		this.cognome = cognome;
		this.login = login;
		this.password = password;
		this.dateCreated = dateCreated;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		String dateCreatedString = dateCreated != null ? DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateCreated)
				: " N.D.";

		return "User [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", login=" + login + ", password="
				+ password + ", dateCreated=" + dateCreatedString + "]\n";
	}

}
