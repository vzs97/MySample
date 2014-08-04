package coupang.spark.mvc.handlebars.test;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import org.junit.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/3/14
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestHandlebars {

    @Test
    public void testTemplate() throws IOException {
        Handlebars handlebars = new Handlebars();

        Template template = handlebars.compileInline("Hello {{this}}!");

        System.out.println(template.apply("Handlebars.java"));
    }

}
