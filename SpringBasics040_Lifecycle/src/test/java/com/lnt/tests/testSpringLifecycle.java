package com.lnt.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.appl.EmpDao;

/**
 * @Lazy:creates a bean lazily or eagerly.
 * @Scope:'singleton" or "prototype"
 * @PostConstruct: from javax.annotation. Lifecycle method.
 * @Predestroy: from javax.annotation. Lifecyle method
 * 
 * Lifecycle interfaces...
 * InitializingBean: afterPropertiesSet
 * DisposableBean:destroy().
 *
 */

public class testSpringLifecycle {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		EmpDao dao=ctx.getBean("dao",EmpDao.class);
		dao.getEmpList();
		
		EmpDao dao1=ctx.getBean("dao1",EmpDao.class);
		dao1.getEmpList();
		
		ConfigurableApplicationContext cctx=(ConfigurableApplicationContext)ctx;
		cctx.close();

	}

}
