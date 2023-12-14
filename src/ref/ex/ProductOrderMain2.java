package ref.ex;

import class1.ex.ProductOrder;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder2[] productOrder2s = new ProductOrder2[3];

        //createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        productOrder2s[0] = createOrder("두부",2000,2);
        productOrder2s[1] = createOrder("김치",5000,1);
        productOrder2s[2] = createOrder("콜라",1500,2);

        //printOrders()를 사용해서 상품 주문 정보 출력
        printOrder(productOrder2s);
        //gerTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(productOrder2s);
        //총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
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
