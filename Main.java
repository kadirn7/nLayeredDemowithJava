package nLayeredDemo;

import nLayeredDemo.JLogger.JLoggerManager;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

    public static void main(String[] args) {

        ProductService productService =new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
        JLoggerManager jLoggerManager=new JLoggerManager();
        Product product =new Product(2,2,"Elma",12,50);

        productService.add(product);

    }

}
