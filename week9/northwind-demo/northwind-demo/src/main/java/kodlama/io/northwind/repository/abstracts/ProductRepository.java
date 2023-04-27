package kodlama.io.northwind.repository.abstracts;

import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.dtos.ProductWithCategoryDto;
import kodlama.io.northwind.entity.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);

    //Product getByProductNameAndCategoryId(String productName, int categoryId);
    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategoryIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

    //select * from products where product_name=bisey and categoryId=bisey

    @Query("SELECT new kodlama.io.northwind.dtos.ProductWithCategoryDto(p.id,p.productName,c.categoryName) FROM Category c Inner Join c.products p")
    List<ProductWithCategoryDto> getProductNameWithCategoryDetails();

// new yazmamızdaki amaç constructoru çalıştırmaktır

}
