package cc.voox.demo.interceptor;

import cc.voox.graphql.GraphQLInterceptor;
import graphql.ExecutionResult;
import graphql.execution.AbortExecutionException;
import graphql.execution.instrumentation.InstrumentationContext;
import graphql.execution.instrumentation.parameters.InstrumentationExecutionParameters;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.security.Principal;


@Component
public class AuthInterceptor implements GraphQLInterceptor {

    @Override
    public InstrumentationContext<ExecutionResult> beginExecution(InstrumentationExecutionParameters parameters) {
        Object context = parameters.getContext();
        if (WebRequest.class.isAssignableFrom(context.getClass())) {
            WebRequest req = (WebRequest) context;
            String authentication = req.getHeader("authentication");
            Principal principal = req.getUserPrincipal();

            System.out.println(authentication);
            if("bearer test123".equalsIgnoreCase(authentication)){
                throw new AbortExecutionException("Please login first");
            }
            System.out.println(" context..."+req);
        }

        return INSTANCE.beginExecution(parameters);
    }
}
