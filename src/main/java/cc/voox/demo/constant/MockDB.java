package cc.voox.demo.constant;

import cc.voox.demo.model.Book;
import cc.voox.demo.model.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashSet;
import java.util.Set;

public final class MockDB {
    public final static Set<User> users =  new HashSet<>();
    public final static Set<Book> books =  new HashSet<>();

    static {
        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setName("userName @"+i);
            user.setAge(RandomUtils.nextInt(1, 100));
            user.setDesc(RandomStringUtils.random(i));
            user.setId(Long.valueOf(i));
            users.add(user);
        }

        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setName("book TEST @"+i);
            book.setDesc(RandomStringUtils.random(i));
            book.setId(Long.valueOf(i));
            books.add(book);
        }
        System.out.println("user list :"+users);
        System.out.println("book list :"+ books);
    }

    public static void init() {

    }
}
