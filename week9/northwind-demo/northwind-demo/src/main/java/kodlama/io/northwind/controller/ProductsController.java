package kodlama.io.northwind.controller;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.dtos.ProductWithCategoryDto;
import kodlama.io.northwind.entity.concretes.Product;
import kodlama.io.northwind.service.abstracts.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductsController {
    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAllProducts() {
        return productService.getAll();
    }


    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }
    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId")int categoryId){
        return this.productService.getByProductNameAndCategory(productName,categoryId);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam("productName") String productName){
        return this.productService.getByProductNameContains(productName);
    }
    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(@RequestParam("pageNo")int pageNo,@RequestParam("pageSize")int pageSize){
        return productService.getAll(pageNo,pageSize);
    }
    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return productService.getProductNameWithCategoryDetails();
    }



}
