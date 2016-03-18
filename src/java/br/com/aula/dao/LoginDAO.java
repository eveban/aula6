/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.dao;

import br.com.aula.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LoginDAO {

    private SessionFactory factory;

    public LoginDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public boolean existe(Usuario usuario) {
        Session session = factory.openSession();

        Query query = session.createQuery("from Usuario u where u.login = " + " :plogin and u.senha = :pSenha");
        query.setParameter("plogin", usuario.getUsuario());
        query.setParameter("pSenha", usuario.getSenha());
        boolean encontrado = !query.list().isEmpty();
        session.flush();
        session.close();
        return encontrado;
    }

    public String buscaSenha(String senha) {
        Session session = factory.openSession();
        String senhaDB = (String) session.createQuery("from Usuario where senha = " + senha).list().iterator().next();
        session.flush();
        session.close();
        return senhaDB;
    }

    public String buscaUsuario(String senha) {
        Session session = factory.openSession();

        String usuario = (String) session.createQuery("from Usuario where senha = " + senha).list().iterator().next();
        session.flush();
        session.close();
        return usuario;
    }

    public boolean buscar(String login, String senha) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = " from Usuario u where u.usuario=:login and u.senha=:senha";
        Query query = session.createQuery(sql);
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        List<Usuario> list = query.list();
        if (list.size() > 0) {
            session.close();
            return true;
        }
        session.close();
        return false;
    }

}
