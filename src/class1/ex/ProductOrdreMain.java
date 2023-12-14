package class1.ex;

public class ProductOrdreMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        productOrders[1] = order2;
        
        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        productOrders[2] = order3;

        int sum = 0;
        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.price * productOrder.quantity;
            System.out.println("상품명: " + productOrder.productName + "가격: " +
                    productOrder.price + "수량: " + productOrder.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
