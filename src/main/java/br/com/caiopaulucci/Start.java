package br.com.caiopaulucci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@ComponentScan("br.com.caiopaulucci")
public class Start {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = SpringApplication.run(Start.class, args);

		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();

	}

}