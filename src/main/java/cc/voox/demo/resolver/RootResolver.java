package cc.voox.demo.resolver;

import cc.voox.graphql.annotation.Query;
import cc.voox.graphql.annotation.QueryField;
import cc.voox.graphql.annotation.QueryMethod;
import cc.voox.demo.model.Book;
import cc.voox.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.Set;

import static cc.voox.demo.constant.MockDB.books;
import static cc.voox.demo.constant.MockDB.users;
/**
 * 前提, resolver 必须在类上声明 @Query 或者 实现 IGraphQL 接口
 *
 * @Query 一般用于service, 需要处理复杂业务， IGraphQL 接口一般用于Entity 映射
 * type 优先级定义
 * 1, QueryMethod type有值
 * 2. 方法上@Query value有值情况
 * 3. 类上有@Query 有值 (方法上有@Query, 但无值不会覆盖类上有值)
 * 4. 类上有@Query 无值，默认值是Query
 * 5. 类上没有以上情况，继承IGraphQL 接口，entity 方法上有QueryMethod， type有值
 * 6. 类上没有以上情况，继承IGraphQL 接口，entity 方法上有QueryMethod， type没值， 用类名（SimpleName）作为type
 * @return
 */

@Query
@Component
public class RootResolver {
    @QueryMethod
    String test() {
        return "hello graphql!!";
    }

    @QueryMethod("hello")
    String hi(@QueryField("sb") String sb) {
        return "hello: " + sb;
    }

    @QueryMethod
    private Set<User> users() {
        return users;
    }

    @QueryMethod
    private Set<Book> books() {
        return books;
    }

}
