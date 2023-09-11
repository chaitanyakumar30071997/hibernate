package One_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.dom4j.bean.BeanMetaData;


public class onetoone {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new  StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Reg obj = new Reg();
		obj.setId(1);
		obj.setName("chaitanya kumar");
		obj.setEmail("chaitanya@com.in");

		Addres obj1 = new Addres();
		obj1.setAddressId(1-48);
		obj1.setAddressdetails("wadapally");
		session.save(obj);
		session.save(obj1);

		t.commit();
		session.close();
	}

}
