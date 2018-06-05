package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(
            final InformationService informationService,
            final OrderService orderService,
            final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.process(orderRequest.getProducer(), orderRequest.getFood(), orderRequest.getQuantity());

        if(isOrdered) {
            informationService.inform(orderRequest.getProducer());
            orderRepository.createOrder(orderRequest.getProducer(), orderRequest.getFood(), orderRequest.getQuantity());
            return new OrderDTO(orderRequest.getProducer(), true);
        } else {
            return new OrderDTO(orderRequest.getProducer(), false);
        }
    }
}
