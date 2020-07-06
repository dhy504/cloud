package com.dhy.cloud.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * TODO --do sth
 *
 * @author Dong_hy
 * @date 2020/7/5 17:27.
 */
@Component
@Slf4j
public class UserRouteFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String requestURI = currentContext.getRequest().getRequestURI();
        if (requestURI.contains("product")) {
            log.info("product模块不进行此次拦截");
            return false;
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        String requestURI = currentContext.getRequest().getRequestURI();
        if (requestURI.contains("user")) {
            log.info("这是user模块的数据,请求验签");
        }
        return null;
    }
}
