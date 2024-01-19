package it.Epicode.week2.day3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Lista Prodotti
        List<Product> productlist = new ArrayList<>();
        productlist.add(new Product(1, "Book1", "Books", 120.0));
        productlist.add(new Product(2, "Book2", "Books", 90.0));
        productlist.add(new Product(3, "Laptop", "Electronics", 800.0));
        productlist.add(new Product(4, "Pen", "Stationery", 5.0));
        productlist.add(new Product(5, "Book3", "Books", 150.0));
        productlist.add(new Product(6, "Baby Toy", "Baby", 25.0));
        productlist.add(new Product(7, "Book4", "Books", 120.0));
        productlist.add(new Product(8, "Diaper Pack", "Baby", 15.0));
        productlist.add(new Product(9, "Desktop", "Electronics", 800.0));
        productlist.add(new Product(10, "Baby Clothes", "Baby", 30.0));
        productlist.add(new Product(11, "Sneakers", "Boys", 50.0));
        productlist.add(new Product(12, "T-Shirt", "Boys", 20.0));

        //Lista Customers
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(101, "Alice", 2));
        customerList.add(new Customer(102, "Bob", 1));
        customerList.add(new Customer(103, "Charlie", 3));

        //Lista Orders
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(501, "Shipped", LocalDate.now(), LocalDate.now().plusDays(3), productlist.subList(0, 2), customerList.get(0)));
        orderList.add(new Order(502, "Processing", LocalDate.now(), null, productlist.subList(5, 7), customerList.get(1)));
        orderList.add(new Order(503, "Delivered", LocalDate.now(), LocalDate.now().minusDays(1), productlist.subList(3, 5), customerList.get(2)));


        //Filtraggio prodotti desiderati con Java Streams

        //Esercizio1
        List<Product> books =productlist.stream().filter(product -> "Books".equals(product.getCategory())).collect(Collectors.toList());
        List<Product> expensiveBooks = books.stream().filter(product -> product.getPrice() > 100).collect(Collectors.toList());

        System.out.println("\nLibri con prezzo > 100:");
        expensiveBooks.forEach(product -> System.out.println(product.getName()));

        //Esercizio2
        List<Order> babyOrder = orderList.stream().filter(order -> order.getProducts().stream().anyMatch(product -> "Baby".equals(product.getCategory()))).collect(Collectors.toList());

        // Stampa i risultati
        System.out.println("Ordini con prodotti nella categoria 'Baby':");
        babyOrder.forEach(order -> System.out.println("Order ID: " + order.getId()));

        //Esercizio3
        // Filtraggio dei prodotti nella categoria "Boys"
        List<Product> boysProducts = productlist.stream().filter(product -> "Boys".equals(product.getCategory())).collect(Collectors.toList());

        // Stampa i risultati
        System.out.println("Prodotti nella categoria 'Boys':");
        boysProducts.forEach(product -> System.out.println(product.getName()));

        //Esercizio4
        // Filtraggio degli ordini dal 01-Feb-2021 al 01-Apr-2021
        List<Order> filteredOrders = orderList.stream()
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) &&
                        order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
                .filter(order -> order.getCustomer().getTier() != null && order.getCustomer().getTier() == 2)
                .collect(Collectors.toList());

        // Estrazione della lista di prodotti dagli ordini filtrati
        List<Product> orderedProducts = filteredOrders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

        // Stampa i risultati
        System.out.println("Prodotti ordinati da clienti di livello 2 tra l'01-Feb-2021 e l'01-Apr-2021:");
        orderedProducts.forEach(product -> System.out.println(product.getName()));

    }
}
