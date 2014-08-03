package coupang.spark.mvc.conf;

import coupang.spark.mvc.common.RootCompnents;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/3/14
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ComponentScan(basePackageClasses = {RootCompnents.class})
public class RootAppConf {
}
