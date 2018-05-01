package camt.se234.project;

import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import camt.se234.project.repository.ProductRepository;
import camt.se234.project.service.SaleOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    ProductRepository productRepository;
    @Autowired
    SaleOrderService saleOrderService;

    @Test
    public void testAddTransaction() {
        SaleOrder order = SaleOrder.builder()
                .saleOrderId("O001")
                .build();
        Product p1 = productRepository.findByProductId("p0001");
        Product p2 = productRepository.findByProductId("p0002");
        List<SaleTransaction> transactions = new ArrayList<>();
        transactions.add(SaleTransaction.builder().transactionId("t0001")
                .product(p1)
                .amount(10)
                .build());
        transactions.add(SaleTransaction.builder().transactionId("t0002")
                .product(p2)
                .amount(12)
                .build());
        order.setTransactions(transactions);
        SaleOrder result = saleOrderService.addSaleOrder(order);
        assertThat(result.getId(), is(notNullValue()));

    }
}
