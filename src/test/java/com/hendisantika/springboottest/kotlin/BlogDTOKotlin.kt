package com.hendisantika.springboottest.kotlin

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-test
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/12/17
 * Time: 07.34
 * To change this template use File | Settings | File Templates.
 */

//definition:
data class BlogDTO (val name: String, val description: String, val url: String)
//getters, constructor, hashCode(), equals(), toString(), copy() are included!

//usage:
val newBlog = BlogDTO(
        name = "Example",
        description = "Example",
        url = "www.example.com")
//readable due to named arguments

//let's use different DTOs for creation and retrieval, because they differ (id!)
@JsonIgnoreProperties(ignoreUnknown = true)
data class BlogRetrievalDTO (val name: String, val description: String, val url: String)