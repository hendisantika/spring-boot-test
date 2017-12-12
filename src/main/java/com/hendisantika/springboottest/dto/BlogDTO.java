package com.hendisantika.springboottest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-test
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/12/17
 * Time: 07.31
 * To change this template use File | Settings | File Templates.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogDTO {
    private String name;
    private String description;
    private String url;


    public BlogDTO() {}

    //don't:
    public BlogDTO(String name, String description, String url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public BlogDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BlogDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public BlogDTO setUrl(String url) {
        this.url = url;
        return this;
    }
}
