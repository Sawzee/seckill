package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author Frank Liu
 *
 */
@Configuration
@ImportResource(locations={"classpath:spring/beans.xml"})
public class Config {

}