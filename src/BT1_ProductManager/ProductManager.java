package BT1_ProductManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Cốc", 33, 3));
        products.add(new Product(2, "Bàn", 31, 3));
        products.add(new Product(3, "Ghế", 22, 3));
    }

    Scanner scanner = new Scanner(System.in);

    public void create() {
        int id = products.get(products.size() - 1).getId() + 1;
        System.out.println("Nhập Name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Price: ");
        int price = scanner.nextInt();
        System.out.println("Nhập quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextInt();
        Product productAdd = new Product(id, name, price, quantity);
        products.add(productAdd);
        System.out.println(products.toString());
    }

    public void update() {
        Product product = new Product();
        System.out.println("Nhập vào id Muốn sửa: ");
        int idUp = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào tên sửa: ");
        String nameUp = scanner.nextLine();
        System.out.println("Nhập vào giá sửa: ");
        int priceUp = scanner.nextInt();
        System.out.println("NHập vào số lượng cần sửa: ");
        int quantityUp = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idUp) {
                products.get(i).setNamPr(nameUp);
                products.get(i).setPrice(priceUp);
                products.get(i).setQuantity(quantityUp);
            }
        }
        System.out.println(products.toString());
    }

    public void delete() {
        System.out.println("nhập vào id muốn xóa:");
        int idDel = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idDel) {
                products.remove(products.get(i));
            }
        }
        System.out.println(products.toString());
    }

    public void show() {
        System.out.println(products.toString());
    }

    public void search() {
        System.out.println("Nhập vào name muốn tìm kiếm");
        String nameSearch = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNamePr().equalsIgnoreCase(nameSearch)) {
                System.out.println(products.get(i));
                break;
            }
        }

    }

    public void sort() {
        ArrayList<Product> productsSort = new ArrayList<>(products);
        ComparatorWithPrice comparator = new ComparatorWithPrice();
        Collections.sort(productsSort, comparator);
        System.out.println(productsSort.toString());
    }

}
