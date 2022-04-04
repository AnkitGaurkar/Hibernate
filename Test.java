package edu.profound;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	
	Session session;
	Transaction transaction;
	
	public Test()
	{
		session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	}
	
	public void insert()
	{
		transaction=session.beginTransaction();
		
		Author a1=new Author("Ankit","Maths");
		
		session.persist(a1);
		
		transaction.commit();
	}
	public void delete()
	{
		
		transaction=session.beginTransaction();
		
		Author a1=new Author();
		
		a1.setAid(2);

		session.delete(a1);
		
		transaction.commit();
	}
	public void update()
	{
		transaction=session.beginTransaction();
		
		Author a1=new Author("ddefe","Amravatii");
		
		a1.setAid(5);
		
		session.update(a1);
		
		transaction.commit();
	}
	public void select()
	{
		transaction=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Author.class);
		
		List<Author>alist=criteria.list();
		
		for(Author a1:alist)
		{
			System.out.println(a1.getAid()+"\t"+a1.getAname()+"\t"+a1.getAddress());
		}
		
		transaction.commit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test();
		
	//	t1.insert();
		
	//	t1.delete();
		
	//	t1.update();
	
		t1.select();
	}

}
