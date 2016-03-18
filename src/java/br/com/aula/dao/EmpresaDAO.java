/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.dao;

import br.com.aula.Empresa;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author everson
 */
public class EmpresaDAO {
    
        private SessionFactory factory;

    public EmpresaDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public List<Empresa> listarTodosEmpresas() {
        Session session = factory.openSession();
        List<Empresa> empresas = session.createQuery("from Empresa").list();
        session.flush();
        session.close();
        return empresas;
    }

    public Empresa consultarEmpresaPorId(int idEmpresa) {
        Session session = factory.openSession();
        Empresa empresa = (Empresa) session.createQuery("from Empresa where id=" + idEmpresa).list().iterator().next();
        session.flush();
        session.close();
        return empresa;
    }

    public void inserirEmpresa(Empresa empresa) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(empresa);
        session.flush();
        transaction.commit();
        session.close();

    }

    public void alterarEmpresa(Empresa empresa) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(empresa);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void removerEmpresa(Empresa empresa) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(empresa);
        session.flush();
        transaction.commit();
        session.close();
    }
    
}
