package kodlama.io.northwind.service.concretes;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.core.utilities.result.SuccessDataResult;
import kodlama.io.northwind.entity.concretes.Product;
import kodlama.io.northwind.repository.abstracts.ProductRepository;
import kodlama.io.northwind.service.abstracts.ProductService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>
                (productRepository.findAll(), "Data listed !");

    }

    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);

        return new SuccessDataResult<List<Product>>(this.productRepository.findAll(pageable).getContent());
    }

    @Override
    public Result add(Product product) {
        productRepository.save(product);
        return new SuccessDataResult("Product added !");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>
                (productRepository.getByProductName(productName), "Data listed !");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (productRepository.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data listed !");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (productRepository.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data listed !");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>
                (productRepository.getByCategoryIn(categories), "Data listed !");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>
                (productRepository.getByProductNameContains(productName), "Data listed !");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>
                (productRepository.getByProductNameStartsWith(productName), "Data listed !");
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (productRepository.getByNameAndCategory(productName, categoryId), "Data listed !");
    }


}
