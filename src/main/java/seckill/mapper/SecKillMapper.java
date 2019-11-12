package mapper;

import entity.Product;
import entity.Record;
import entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecKillMapper{

    List<User> getAllUser();

    List<Product> getAllProduct();

    Product getProductById(Integer id);

    boolean updatePessLockInMySQL(Product product);

    boolean updatePosiLockInMySQL(Product product);

    boolean insertRecord(Record record);

    boolean updateByAsynPattern(Product product);
}
