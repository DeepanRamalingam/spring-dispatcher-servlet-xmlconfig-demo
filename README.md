## Concepts covered
	- spring dispatcher servlet
	- internal view resolver
	- xml configuration
	- @controller
	- @RequestMapping
	- @RequestParam
	- @ModelAttribute - Mapping form input elements with the object properties
	- ModelMap
	- ModelAndView
	
## Web.xml

	<!DOCTYPE web-app PUBLIC
	 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	 "http://java.sun.com/dtd/web-app_2_3.dtd" >
	
	<web-app>
	  <display-name>Archetype Created Web Application</display-name>
	  
	    <servlet>
	        <servlet-name>dispatcher</servlet-name>
	        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	        <load-on-startup>1</load-on-startup>
	    </servlet>
	
	    <servlet-mapping>
	        <servlet-name>dispatcher</servlet-name>
	        <url-pattern>/</url-pattern>
	    </servlet-mapping>
	</web-app>

## dispatcher-servlet.xml  

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	    xmlns:p="http://www.springframework.org/schema/p"
	    xmlns:context="http://www.springframework.org/schema/context"
	    xmlns:mvc="http://www.springframework.org/schema/mvc"
	    xmlns:cache="http://www.springframework.org/schema/cache"
	    xsi:schemaLocation="
	        http://www.springframework.org/schema/beans
	        http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
	        http://www.springframework.org/schema/context
	        http://www.springframework.org/schema/context/spring-context-3.0.xsd
	        http://www.springframework.org/schema/mvc
	        http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd  http://www.springframework.org/schema/cache 
	        http://www.springframework.org/schema/cache/spring-cache-3.2.xsd
	        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.1.xsd">
	
	       <context:component-scan base-package="com.stackroute.controller"></context:component-scan>
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	    <property name="prefix" value="/WEB-INF/views/"></property>
	    <property name="suffix" value=".jsp"></property>
	</bean>
	<context:annotation-config/>
	<mvc:annotation-driven/>
	
	</beans>