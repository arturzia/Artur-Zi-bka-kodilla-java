package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){

        Product product1 = new Product("Pendrive");
        Product product2 = new Product("SDD");
        Product product3 = new Product("HDD");
        Product product4 = new Product("Mouse");
        Product product5 = new Product("iPhone");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);

        Invoice invoice = new Invoice("2018/07/2234");
        Invoice invoice1 = new Invoice("2018/07/1234");

        Item item1 = new Item(product1, new BigDecimal(50), 5, new BigDecimal(250));
        Item item2 = new Item(product2, new BigDecimal(300), 6, new BigDecimal(1800));
        Item item3 = new Item(product3, new BigDecimal(250), 10, new BigDecimal(2500));
        Item item4 = new Item(product4, new BigDecimal(100), 10, new BigDecimal(1000));
        Item item5 = new Item(product5, new BigDecimal(3000), 5, new BigDecimal(15000));


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice1.getItems().add(item4);
        invoice1.getItems().add(item5);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice1);
        item5.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice);
        invoiceDao.save(invoice1);


        //Then
        Assert.assertEquals(3, invoice.getItems().size());
        Assert.assertEquals(2, invoiceDao.count());

        //CleanUp
        try {
            invoiceDao.deleteAll();
        }
        catch (Exception e) {}
    }
}
