package com.cloud.learn.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * @Title
 * @Description ${DESCRIPTION}
 * @Author yao.zhang04@hand-china.com
 * @date: 2018/12/21
 */
@Component
public class JWTTokenFilter extends ZuulFilter {

/*  “pre” 预过滤器 - 在路由分发一个请求之前调用。
    “post” 后过滤器 - 在路由分发一个请求后调用。
    “route” 路由过滤器 - 用于路由请求分发。
    “error” 错误过滤器 - 在处理请求时发生错误时调用*/
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        final HttpServletRequest request = ctx.getRequest();
        try{
            if(request.getParameter("token")!=null){
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
