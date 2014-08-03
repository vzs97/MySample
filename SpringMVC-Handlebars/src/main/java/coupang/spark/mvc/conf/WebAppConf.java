package coupang.spark.mvc.conf;

import coupang.spark.mvc.web.WebComponents;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/3/14
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan(basePackageClasses = {WebComponents.class})
public class WebAppConf {
}
