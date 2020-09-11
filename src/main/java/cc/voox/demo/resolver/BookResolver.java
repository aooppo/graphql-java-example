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


    @QueryMethod
    User owner(@QueryField(value = "book", root = true) Book source) {
        System.out.println("get owner" + source);
        Book root = GraphQLContextUtil.getSource(Book.class);
        System.out.println(root.equals(source));
        return source.getUser();
    }


}
