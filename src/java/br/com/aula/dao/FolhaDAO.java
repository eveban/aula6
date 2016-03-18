package br.com.aula.dao;

import br.com.aula.Folha;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FolhaDAO {
    
        private SessionFactory factory;

    public FolhaDAO() {
        this.factory = HibernateUtil.getSessionFactory();
    }

    public List<Folha> listarTodosFolhas() {
        Session session = factory.openSession();
        List<Folha> folhas = session.createQuery("from Folha").list();
        //session.flush();
        //session.close();
        return folhas;
    }

    public Folha consultarFolhaPorId(int idFolha) {
        Session session = factory.openSession();
        Folha folha = (Folha) session.createQuery("from Folha where id=" + idFolha).list().iterator().next();
        session.flush();
        session.close();
        return folha;
    }
    
    public void inserirFolha(Folha folha) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(folha);
        session.flush();
        transaction.commit();
        session.close();

    }

    public void alterarFolha(Folha folha) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(folha);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void removerFolha(Folha folha) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(folha);
        session.flush();
        transaction.commit();
        session.close();
    }
    
}
