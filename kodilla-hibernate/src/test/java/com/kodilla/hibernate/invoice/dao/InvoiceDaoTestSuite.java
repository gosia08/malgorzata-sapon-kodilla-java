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

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product shampoo = new Product("Shampoo");

        Item item1 = new Item( new BigDecimal(2), 10, new BigDecimal(20));
        Item item2 = new Item( new BigDecimal(3), 4, new BigDecimal(12));
        Item item3 = new Item( new BigDecimal(6), 9, new BigDecimal(54));

        Invoice invoice = new Invoice("123");

        shampoo.getItems().add(item1);
        shampoo.getItems().add(item2);
        shampoo.getItems().add(item3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setProduct(shampoo);
        item2.setProduct(shampoo);
        item3.setProduct(shampoo);


        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);


        //When

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then

        Assert.assertNotEquals(0, id);

        //CleanUp

        invoiceDao.delete(id);

    }
}