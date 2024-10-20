package nLayeredDemo.dataAccess.concretes;

import java.util.List;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println("hibernate ile eklendi "+product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("");
    }

    @Override
    public void delete(Product product) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Product get(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Product> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
