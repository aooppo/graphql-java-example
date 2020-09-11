package cc.voox.demo.resolver;

import cc.voox.graphql.GraphQLContextUtil;
import cc.voox.graphql.annotation.Query;
import cc.voox.graphql.annotation.QueryField;
import cc.voox.graphql.annotation.QueryMethod;
import cc.voox.demo.model.Book;
import cc.voox.demo.model.User;
import org.springframework.stereotype.Component;

@Query("Book")
@Component
public class BookResolver {

    /**
     * can code here if there is some effect
     * otherwise we can use model on easy way
     * <pre>
     *      @QueryMethod
     *     private User owner() {
     *         return user;
     *     }
     * </pre>
     */
//    @QueryMethod
//    User owner(@QueryField(value = "book", root = true) Book source) {
//        return source.getUser();
//    }


}
