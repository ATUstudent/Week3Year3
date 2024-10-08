package ie.atu.week3year3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//
@RestController

public class ProductController {

    private List<Product> products = new ArrayList<>();
    public ProductController(){
        products.add(new Product("Tv", "Made by Sony", 889,100));
        products.add(new Product("Radio", "Samsung", 99,101));
        products.add(new Product("Headphones", "Dr Dre", 129,102));
        products.add(new Product("PC", "Ryzen", 3292,103));
        products.add(new Product("Monitor", "LG", 499,104));
    }
    @GetMapping("/getproducts")
    public List<Product> getProduct()
    {
        return products;
    }

    @PutMapping("/{id}")
    public ResponseEntity<List> editProduct(@PathVariable int id, @RequestBody Product product) {
        for (int i = 0; i < products.size(); i++)
        {
            if (products.get(i).getId() == id) {
                products.set(i, product);
            }
        }
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List> removeProduct(@PathVariable int id)
    {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
        return ResponseEntity.ok(products);
    }
}