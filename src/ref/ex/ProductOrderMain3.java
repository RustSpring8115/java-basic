package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder2[] productOrder2s = new ProductOrder2[n];
        for (int i = 0; i < productOrder2s.length; i++) {
            System.out.print((i + 1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quentity = scanner.nextInt();
            scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

            productOrder2s[i] = createOrder(productName, price, quentity);

        }
        printOrder(productOrder2s);
        System.out.println("총금액: " + getTotalAmount(productOrder2s));
    }
    static ProductOrder2 createOrder(String productName,int price,int quantity) {
        ProductOrder2 product = new ProductOrder2();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }
    static void printOrder(ProductOrder2[] orders) {
        for (ProductOrder2 order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder2[] order) {
        int result = 0;
        for (ProductOrder2 productOrder2 : order) {
            result += productOrder2.price * productOrder2.quantity;
        }
        return result;
    }
}
