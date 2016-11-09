package com.abc.ywork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 
 * @author amrit
 * 
 */
@Configuration
@ComponentScan({"com.abc.ywork"})
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter
{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
        registry.addResourceHandler("/resources/**")
        		.addResourceLocations("/resources/");
        registry.addResourceHandler("/images/**")
				.addResourceLocations("/resources/images/");
//        registry.addResourceHandler("/pages/**")
//        		.addResourceLocations("/pages/");
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
