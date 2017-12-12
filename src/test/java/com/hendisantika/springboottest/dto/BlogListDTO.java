package com.hendisantika.springboottest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-test
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/12/17
 * Time: 07.32
 * To change this template use File | Settings | File Templates.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogListDTO {
    //we leave out offset and limit, because we are not interested in this fields.
    public int count;
    public List<BlogReference> blogs;

    public static class BlogReference{
        public int id;
        public String name;
        public String href;
    }
}
