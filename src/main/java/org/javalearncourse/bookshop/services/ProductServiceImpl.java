package org.javalearncourse.bookshop.services;

import org.javalearncourse.bookshop.beans.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        products.add(new Product("Лев Толстой. Война и Мир", "2236.34"));
        products.add(new Product("Эндрю Таненбаум. Операционные системы.", "237.34"));
        products.add(new Product("Венедикт Ерофеев.Москва Петушки", "137.34"));
        return products;
    }
}
