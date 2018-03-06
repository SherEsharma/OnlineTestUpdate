package co.xenture.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import co.xenture.util.IConstant;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.setServletContext(servletContext);
 
        ServletRegistration.Dynamic servlet = servletContext.addServlet(IConstant.DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
 
        servlet.setLoadOnStartup(IConstant.INT_ONE);
        servlet.addMapping("/");
		
	}

}
