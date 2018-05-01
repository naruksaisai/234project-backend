package camt.se234.project;

import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.service.ProductServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceImplTest {
    ProductDao productDao;
    ProductServiceImpl productService;

    @Before
    public void setup() {
        productDao = mock(ProductDao.class);
        productService = new ProductServiceImpl();
        productService.setProductDao(productDao);
    }

    @Test
    public void testProductService(){
//        productDao = mock(ProductDao.class);
//        productService = new ProductServiceImpl();
//        productService.setProductDao(productDao);
        List<Product> mockProduct = new ArrayList<>();
        mockProduct.add(new Product("101","Apple"," "," ",20));
        mockProduct.add(new Product("102","Banana"," "," ",30.00));
        when(productDao.getProducts()).thenReturn(mockProduct);
        assertThat(productService.getAllProducts(),hasItem(new Product("101","Apple"," "," ",20)));
        assertThat(productService.getAllProducts(),hasItems(new Product("101","Apple"," "," ",20),new Product("102","Banana"," "," ",30.00)));
    }
}

