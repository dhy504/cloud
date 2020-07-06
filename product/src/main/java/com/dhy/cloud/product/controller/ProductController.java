package com.dhy.cloud.product.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO --do sth
 *
 * @author Dong_hy
 * @date 2020/6/29 19:25.
 */
@RestController
@RequestMapping("/merchant")
public class ProductController {

    @RequestMapping("test")
    public String get(HttpServletResponse response) {
        response.addHeader("testHeader", "merchant header");

        return "product merchant test";
    }

}
