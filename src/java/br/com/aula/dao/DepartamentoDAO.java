/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.dao;

import br.com.aula.Departamento;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author everson
 */
public class DepartamentoDAO {
    
        private SessionFactory factory;

    public DepartamentoDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public List<Departamento> listarTodosDepartamentos() {
        Session session = factory.openSession();
        List<Departamento> departamentos = session.createQuery("from Departamento").list();
        session.flush();
        session.close();
        return departamentos;
    }

    public Departamento consultarDepartamentoPorId(int idDepartamento) {
        Session session = factory.openSession();
        Departamento departamento = (Departamento) session.createQuery("from Departamento where id=" + idDepartamento).list().iterator().next();
        session.flush();
        session.close();
        return departamento;
    }

    public void inserirDepartamento(Departamento departamento) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(departamento);
        session.flush();
        transaction.commit();
        session.close();

    }

    public void alterarDepartamento(Departamento departamento) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(departamento);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void removerDepartamento(Departamento departamento) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(departamento);
        session.flush();
        transaction.commit();
        session.close();
    }
    
}
