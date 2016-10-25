package br.com.caiopaulucci;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerFactory {

	@Bean
	public LoggingAspect createLogginAspect(){
		return new LoggingAspect();
	}
	
	@Bean(name="customerBo")
	public CustomerBo createCustomerBO(){
		return new CustomerBoImpl();
	}
	
}
