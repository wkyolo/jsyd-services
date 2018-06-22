package com.shine.jsyd.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

@Component
public class ErrorFilter extends ZuulFilter {

    @Override
    public String filterType(){
        return "error";
    }

    @Override
    public int filterOrder(){
        return 10;
    }

    @Override
    public boolean shouldFilter(){
        return true;
    }

    @Override
    public Object run(){
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        ctx.set("status", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        ctx.set("msg", throwable.getCause());
        return null;
    }
}
