package com.dhy.cloud.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * TODO --do sth
 *
 * @author Dong_hy
 * @date 2020/7/5 09:57.
 */
@Slf4j
@Component
public class PreRouteFilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        log.info("pre route run");
        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }


}
