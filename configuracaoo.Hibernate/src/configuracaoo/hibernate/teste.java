/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Dercio
 */
public class teste {
    public static void main(String[] args) {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session sessao= factory.openSession();
         Pessoa pessoa= new Pessoa("dercio", 15);
         Estudante estudante= new Estudante("juizo", "informatica", 4);
         
         sessao.save(pessoa);
        sessao.save(estudante);
        sessao.beginTransaction();
        sessao.getTransaction().commit();
        sessao.close();
        
    }
    
}
