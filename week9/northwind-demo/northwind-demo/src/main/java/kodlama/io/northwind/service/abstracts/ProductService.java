package kodlama.io.northwind.service.abstracts;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.entity.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo,int pageSize);
    DataResult<List<Product>> getAllSorted();

    //List<Product> getAll();
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    //Product getByProductNameAndCategoryId(String productName, int categoryId);
    DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
