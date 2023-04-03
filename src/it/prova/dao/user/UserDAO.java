package it.prova.dao.user;

import java.util.Date;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {

	public List<User> findAllByUsernameIniziaCon(String iniziale) throws Exception;

	public List<User> findAllCreatiPrimaDi(Date dataConfronto) throws Exception;

	public List<User> findByCognomeENomeCheInziaCon(String cognomeInput, String inzialeNomeInput) throws Exception;

	public User accedi(String loginInput, String passwordInput) throws Exception;


}
