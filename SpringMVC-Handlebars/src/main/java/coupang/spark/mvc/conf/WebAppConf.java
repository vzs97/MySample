package coupang.spark.mvc.conf;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import coupang.spark.mvc.web.WebComponents;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

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
    public static final String HANDLEBARS_VIEW_BASE_PATH = "/WEB-INF/views/";
    public static final String HANDLEBARS_VIEW_SUFFIX = ".hbs";
    public static final boolean FAIL_ON_MISSING_FILE = false;

    public static final int ORDER = 1;
    public static final String JSON_HELPER_NAME = "json";

    private boolean prettyPrint = true;

    private boolean caching = true;

    private boolean renderException = true;



    /**
     * Handlebar의 viewResolver를 생성한다. Jade View resolver보다 앞서기 위해 {@link #ORDER} 값을 앞당겨두었다.
     */
    @Bean
    public ViewResolver handlebarsViewResolver() {
        HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
        viewResolver.setOrder(ORDER);
        viewResolver.setFailOnMissingFile(FAIL_ON_MISSING_FILE);
        viewResolver.setCache(caching);

        viewResolver.setPrefix(HANDLEBARS_VIEW_BASE_PATH);
        viewResolver.setSuffix(HANDLEBARS_VIEW_SUFFIX);

        return viewResolver;
    }

}
