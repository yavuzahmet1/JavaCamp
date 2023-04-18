package kodlama.io.northwind.service.abstracts;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.entity.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);

}
