package BT1_ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("1. Thêm mới product");
            System.out.println("2. Sửa product");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("6. Show sản phẩm");
            System.out.println("7. Thoát");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productManager.create();
                    break;
                case 2:
                    productManager.update();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.search();
                    break;
                case 5:
                    productManager.sort();
                    break;
                case 6:
                    productManager.show();
                    break;
                case 7:
                    System.exit(0);
            }
        }while (choice!=7);

    }
}