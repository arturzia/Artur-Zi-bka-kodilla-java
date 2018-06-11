package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetrieverExtra orderRequestRetriever = new OrderRequestRetrieverExtra();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(),
                new ExtraFoodShopService(),
                new FoodOrderRepository());

        productOrderService.process(orderRequest);

        System.out.println();
        OrderRequestRetrieverHealthy orderRequestRetrieverHealthy = new OrderRequestRetrieverHealthy();
        OrderRequest orderRequest2 = orderRequestRetrieverHealthy.retrieve();
        ProductOrderService productOrderService2 = new ProductOrderService(
                new MailService(),
                new HealthyShopService(),
                new FoodOrderRepository());

        productOrderService2.process(orderRequest2);

        System.out.println();
        OrderRequestRetrieverGluten orderRequestRetrieverGluten = new OrderRequestRetrieverGluten();
        OrderRequest orderRequest3 = orderRequestRetrieverGluten.retrieve();
        ProductOrderService productOrderService3 = new ProductOrderService(
                new MailService(),
                new GlutenFreeShopService(),
                new FoodOrderRepository());

        productOrderService3.process(orderRequest3);
    }
}

