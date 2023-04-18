package kodlama.io.northwind.service.concretes;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.core.utilities.result.SuccessDataResult;
import kodlama.io.northwind.entity.concretes.Product;
import kodlama.io.northwind.repository.abstracts.ProductRepository;
import kodlama.io.northwind.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(productRepository.findAll(),"Data listed !");
    }

    @Override
    public Result add(Product product) {
        productRepository.save(product);
        return new SuccessDataResult("Product added !");
    }


}
