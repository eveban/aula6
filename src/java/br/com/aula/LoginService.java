package br.com.aula;

import br.com.aula.dao.LoginDAO;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author rnr
 *
 * This class accepts input data from the LoginAction class, and sends username
 * to the LoginDao class. Based on the password returned from the LoginDao
 * class, a password match is done and the result is sent to LoginAction class.
 */
public class LoginService {

    /*    public boolean isValidPassword(String login, String senha) {
     try {
     LoginDAO dao = new LoginDAO();
     String senha = dao.getUserPassword(userName);

     if (null != pwdFromDB) {
     if (pwdFromDB.equals(password)) {
     return true;
     }
     }
     } catch (Exception ex) {
     if (!(ex instanceof DaoException)) {
     ex.printStackTrace();
     }
     throw new ServiceException();
     }
     return false;
     }
     */
}
