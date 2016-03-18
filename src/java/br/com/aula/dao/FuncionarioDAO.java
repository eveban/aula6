package br.com.aula.dao;

import br.com.aula.Funcionario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FuncionarioDAO {
    
        private SessionFactory factory;

    public FuncionarioDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public List<Funcionario> listarTodosFuncionarios() {
        Session session = factory.openSession();
        List<Funcionario> funcionarios = session.createQuery("from Funcionario").list();
        //session.flush();
        //session.close();
        return funcionarios;
    }

    public Funcionario consultarFuncionarioPorId(int idFuncionario) {
        Session session = factory.openSession();
        Funcionario funcionario = (Funcionario) session.createQuery("from Funcionario where id=" + idFuncionario).list().iterator().next();
        session.flush();
        session.close();
        return funcionario;
    }
    
    public void inserirFuncionario(Funcionario funcionario) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(funcionario);
        session.flush();
        transaction.commit();
        session.close();

    }

    public void alterarFuncionario(Funcionario funcionario) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(funcionario);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void removerFuncionario(Funcionario funcionario) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(funcionario);
        session.flush();
        transaction.commit();
        session.close();
    }
    
}
