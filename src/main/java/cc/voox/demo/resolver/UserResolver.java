package cc.voox.demo.resolver;

import cc.voox.demo.constant.MockDB;
import cc.voox.demo.model.User;
import cc.voox.graphql.GraphQLContextUtil;
import cc.voox.graphql.annotation.Query;
import cc.voox.graphql.annotation.QueryMethod;
import cc.voox.demo.model.Book;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;


@Query("User")
@Component
public class UserResolver {


    @QueryMethod
    private Set<Book> books() {
        User user = GraphQLContextUtil.getSource(User.class);
        Set<Book> collect = MockDB.books.stream()
                .filter(book -> user.equals(book.getUser()))
                .collect(Collectors.toSet());

        return collect;
    }

}
