package tqi.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tqi.bookstore.model.BookModel;
import tqi.bookstore.model.ResponseModel;
import tqi.bookstore.service.BookService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BookRestController {

    @Autowired
    private BookService bs;

    @GetMapping("/list")
    public Iterable<BookModel> listBooks() {
        return bs.listBooks();

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseModel> deleteBook(@PathVariable Integer id) {
        return bs.deleteBook(id);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerBook(@RequestBody BookModel bm) {
        return bs.registerUpdateBook(bm, "r");
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateBook(@RequestBody BookModel bm) {
        return bs.registerUpdateBook(bm, "u");
    }

    @GetMapping("/")
    public String route() {
        return "Books API online!";
    }

}
