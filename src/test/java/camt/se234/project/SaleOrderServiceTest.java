package camt.se234.project;

import camt.se234.project.dao.OrderDao;
import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import camt.se234.project.service.SaleOrderServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SaleOrderServiceTest {
    OrderDao orderDao;
    SaleOrderServiceImpl saleOrderService;

    @Before
    public void setUp() {
        orderDao = mock(OrderDao.class);
        saleOrderService = new SaleOrderServiceImpl();
        saleOrderService.setOrderDao(orderDao);
    }

    @Test
    public void testSaleOrderServiceImpl() {
        List<SaleOrder> mockOrders = new ArrayList<>();
        List<SaleTransaction> saleTransactions1 = new ArrayList<>();
        saleTransactions1.add(new SaleTransaction("T001",
                new SaleOrder("S001", saleTransactions1),
                new Product("P001", "Meat", "xxx", "xxx", 100.00), 10));
        saleTransactions1.add(new SaleTransaction("T002",
                new SaleOrder("S001", saleTransactions1),
                new Product("P002", "Donut", "xxx", "xxx", 100.00), 5));
        mockOrders.add(new SaleOrder("S001", saleTransactions1));
        mockOrders.add(new SaleOrder("T002", saleTransactions1));
        when(saleOrderService.getSaleOrders()).thenReturn(mockOrders);
//        assertThat(saleOrderService.getSaleOrders(),hasItem("S001", saleTransactions1, new Product("P001", "Meat", "xxx", "xxx", 100.00), 10);
        assertThat(saleOrderService.getSaleOrders(),hasItem(new SaleOrder("S001", saleTransactions1)));
        assertThat(saleOrderService.getSaleOrders(),hasItems(new SaleOrder("S001", saleTransactions1),new SaleOrder("T002", saleTransactions1)));
    }
    @Test
    public void testGetAverageSaleOrderPrice(){
        List<SaleOrder> mockOrders = new ArrayList<>();
        List<SaleTransaction> saleTransactions1 = new ArrayList<>();
        saleTransactions1.add(new SaleTransaction("T001",
                new SaleOrder("S001", saleTransactions1),
                new Product("P001", "Meat", "xxx", "xxx", 100.00), 10));
        saleTransactions1.add(new SaleTransaction("T002",
                new SaleOrder("S001", saleTransactions1),
                new Product("P002", "Donut", "xxx", "xxx", 100.00), 30));
        mockOrders.add(new SaleOrder("S001", saleTransactions1));
        mockOrders.add(new SaleOrder("T002", saleTransactions1));
        when(saleOrderService.getSaleOrders()).thenReturn(mockOrders);
        assertThat(saleOrderService.getAverageSaleOrderPrice(),is(4000.0));
    }

}