package kodlama.io.northwind.controller;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.entity.concretes.Product;
import kodlama.io.northwind.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping("/getall")
    public DataResult<List<Product>> getAllProducts() {
        return productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return productService.add(product);
    }

}
