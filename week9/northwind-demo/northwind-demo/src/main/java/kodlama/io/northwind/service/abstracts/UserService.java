package kodlama.io.northwind.service.abstracts;

import kodlama.io.northwind.core.entities.User;
import kodlama.io.northwind.core.utilities.result.DataResult;
import kodlama.io.northwind.core.utilities.result.Result;
import kodlama.io.northwind.entity.concretes.Product;

public interface UserService {
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
