package com.endava.java2023Project.controller;

import com.endava.java2023Project.dto.GetOrderDTO;
import com.endava.java2023Project.dto.OrderDTO;
import com.endava.java2023Project.model.Orders;
import com.endava.java2023Project.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrdersController {
private final OrdersService ordersService;


    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/api/orders/{userId}")
    public List<GetOrderDTO> getOrders(@PathVariable("userId") Integer userId){
        List<Orders> orders = ordersService.getOrdersByUserId(userId);
        List<GetOrderDTO> result = new ArrayList<>();
        for(Orders o : orders) {
            GetOrderDTO newObject = new GetOrderDTO();
            newObject.setEventId(o.getTicketCategoryId().getEventId().getEventId());
            newObject.setTimestamp(o.getOrderedAt());
            newObject.setNumberOfTickets(o.getNumberOfTickets());
            newObject.setTicketCategoryId(o.getTicketCategoryId().getTicketCategoryId());
            newObject.setTotalPrice(o.getTotalPrice());
            result.add(newObject);

        }
        return result;
    }
    @PostMapping("/order/addOrder")
    public GetOrderDTO insertNewOrder(@RequestBody OrderDTO orderDto) {
        return ordersService.getOrder(orderDto);
    }


}
