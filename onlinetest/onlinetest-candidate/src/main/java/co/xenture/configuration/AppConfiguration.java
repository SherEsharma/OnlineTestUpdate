package co.xenture.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import co.xenture.util.IConstant;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="co.xenture")
public class AppConfiguration extends WebMvcConfigurerAdapter {

	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler(IConstant.RESOURCE_HANDLER).addResourceLocations(IConstant.RESOURCE_LOCATION);
	    }
	     
	 
	 @Bean
		public MessageSource messageSource() {

			ResourceBundleMessageSource resourceMessage = new ResourceBundleMessageSource();
			resourceMessage.setBasename(IConstant.MESSAGES);
			return resourceMessage;
		}
	
	@Bean
	public ViewResolver viewResolver(){
	
		InternalResourceViewResolver  viewResolver =new InternalResourceViewResolver();
		
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix(IConstant.JSP_PACKAGE);
		viewResolver.setSuffix(IConstant.JSP_EXTANTION);
		return viewResolver;
		
	}
}
