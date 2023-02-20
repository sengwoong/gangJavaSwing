package barket;

import java.util.Iterator;

public class ProductIterator implements Iterable<Product>, Iterator<Product> {
    private Product[] products;
    private int index = 0;

    public ProductIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < products.length;
    }

    @Override
    public Product next() {
        return products[index++];
    }


  
}