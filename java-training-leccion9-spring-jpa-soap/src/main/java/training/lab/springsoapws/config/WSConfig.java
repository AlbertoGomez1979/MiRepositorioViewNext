package training.lab.springsoapws.config;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WSConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet,"/soapws/*"); //URL 
	}
	
	@Bean(name = "empleados") //define el path
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema empleadoSchema) { //le pasamos como 
		//parametro el mÃ©todo empleadoSchema que recibe la definición del archivo xsd
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("EmpleadosPort");
		wsdl11Definition.setLocationUri("/soapws"); //define el address location en el WSDL
		wsdl11Definition.setTargetNamespace("http://training.lab/empleado-ws"); //definiciÃ³n Namespace WSDL
		wsdl11Definition.setSchema(empleadoSchema);
		
		return wsdl11Definition;
		
	}
	@Bean
	public XsdSchema empleadoSchema() {
		return new SimpleXsdSchema(new ClassPathResource("empleados.xsd"));
	}
}
