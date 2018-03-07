package co.xenture.util;



public class IConstant {

	// Configration URL Declared here

	// System Path
		public static final String RESOURCE_HANDLER = "/resources/**";
		public static final String RESOURCE_LOCATION = "/resources/";
		public static final String JSP_PACKAGE="/WEB-INF/views/";
		public static final String JSP_EXTANTION = ".jsp";
		public static final String MULTIPART_RESOLVER = "multipartResolver";
		public static final String DISPATCHER_SERVLET_NAME = "dispatcher";
		public static final int INT_ONE = 1;
		public static final String MESSAGES = "messages";
	
		
		//Hibernate Configration
		
		public static final String DRIVER_CLASS_NAME = "jdbc.driverClassName";
		public static final String DB_URL = "jdbc.url";
		public static final String DB_USER = "jdbc.username";
		public static final String DB_PASSWORD = "jdbc.password";
		public static final String HIBERNATE_DILECT = "hibernate.dialect";
		public static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
		public static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
		public static final String HIBERNATE_HBM2DDL = "hibernate.hbm2ddl.auto";
		public static final String BASE_PACKAGE = "co.xenture";
		public static final String JPA_REPOSITORY = "co.xenture.repo";
		public static final String HIBERNATE_PROPERTY_SOURCE = "classpath:application.properties";
		public static final String HIBERNATE_COMPONENT_SCAN = "co.xenture.configuration";												  
		public static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

}