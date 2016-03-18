/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.dao;

import br.com.aula.Dependente;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author everson
 */
public class DependenteDAO {

    private SessionFactory factory;

    public DependenteDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public List<Dependente> listarTodosDependentes() {
        Session session = factory.openSession();
        List<Dependente> dependentes = session.createQuery("from Dependente").list();
        //session.flush();
        //session.close();
        return dependentes;
    }

    public Dependente consultarDependentePorId(int idDependente) {
        Session session = factory.openSession();
        Dependente dependente = (Dependente) session.createQuery("from Dependente where id=" + idDependente).list().iterator().next();
        session.flush();
        session.close();
        return dependente;
    }

    public void inserirDependente(Dependente dependente) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(dependente);
        session.flush();
        transaction.commit();
        session.close();

    }

    public void alterarDependente(Dependente dependente) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(dependente);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void removerDependente(Dependente dependente) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(dependente);
        session.flush();
        transaction.commit();
        session.close();
    }

}
