package cc.voox.demo.resolver;

import cc.voox.demo.dao.BookDAO;
import cc.voox.demo.dao.UserDAO;
import cc.voox.graphql.annotation.Query;
import cc.voox.graphql.annotation.QueryField;
import cc.voox.graphql.annotation.QueryMethod;
import cc.voox.demo.dto.BookInput;
import cc.voox.demo.dto.UserInput;
import cc.voox.demo.model.Book;
import cc.voox.demo.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Query("Mutation")
@Component
public class MutationResolver {
    @Autowired
    UserDAO userDAO;
    @Autowired
    BookDAO bookDAO;
    
    @QueryMethod
    private boolean assignTo(@QueryField("book") Long bookId, @QueryField("user") Long userId) {
        List<User> users = userDAO.findAll();
        List<Book> books = bookDAO.findAll();
        Optional<User> optionalUser = users.stream().filter(user -> user.getId().equals(userId)).findAny();
        if (!optionalUser.isPresent()) {
            return false;
        }
        Optional<Book> optionalBook = books.stream().filter(book -> book.getId().equals(bookId)).findAny();
        if (!optionalBook.isPresent()) {
            return false;
        }
        Book book = optionalBook.get();
        book.setUser(optionalUser.get());
        bookDAO.save(book);
        return true;
    }

    @QueryMethod
    private Book createBook(@QueryField("book") BookInput book) {
        Book newBook = new Book();
        BeanUtils.copyProperties(book, newBook);
        bookDAO.save(newBook);
        return newBook;
    }


    @QueryMethod
    private User createUser(@QueryField("user") UserInput user) {
        User newUser = new User();
        BeanUtils.copyProperties(user, newUser);
        userDAO.save(newUser);
        return newUser;
    }

}
