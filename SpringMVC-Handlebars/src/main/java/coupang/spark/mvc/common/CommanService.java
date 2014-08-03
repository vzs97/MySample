package coupang.spark.mvc.common;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: sz
 * Date: 8/3/14
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CommanService {
    public String hello(String name){
        return "Hello " + name;
    }
}
