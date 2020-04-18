package pl.pierwszyWebService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private static final List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Dan Brown", "Inferno", 5));
        books.add(new Book("Harlan Coben", "Fade Away", 5));
        books.add(new Book("Rebecca Donovan", "Reason to Breathe", 5));
    }

    @GetMapping("books/all")
    @ResponseBody
    public String getAllBooks() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(books);
    }

}
