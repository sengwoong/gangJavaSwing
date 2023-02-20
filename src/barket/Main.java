package barket;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
    	
    	        Product[] products = new Product[]{
    	                new Product("책", "book.jpg", 10, 10000),
    	                new Product("의자", "chair.jpg", 20, 20000),
    	                new Product("테이블", "table.jpg", 5, 50000)
    	        };

    	        Product[] productArray = new Product[3];	
    	        int i = 0;
    	        for (Product product : new ProductIterator(products)) {
    	            productArray[i++] = product;
    	        }
    	        for (Product product : productArray) {
    	            System.out.println(product.getName().charAt(0));
    	        }
    	        // Product 객체 배열 출력
    	        for (Product product : productArray) {
    	            System.out.println(product.getName());
    	        }
    	   }}
