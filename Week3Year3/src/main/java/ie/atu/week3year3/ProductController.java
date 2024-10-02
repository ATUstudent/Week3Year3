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
@RequestMapping("/api/products")

public class ProductController {

    private List<Product> products = new ArrayList<>();
    public ProductController(){
        Product a = new Product("Tv", "Made by Sony", 889,100);
        Product b = new Product("Radio", "Samsung", 99,101);
    }
    @GetMapping("/getproducts")
    public List<Product> getProduct()
    {
        return products;
    }
    @PostMapping("addProduct")
    public ResponseEntity addProduct(Product product)
    {
        products.add(product);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/getproducts")
    public String getProducts()
    {
        return "products";
    }
}
