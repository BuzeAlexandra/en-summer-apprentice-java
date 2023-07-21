package com.endava.java2023Project.Controller;

import com.endava.java2023Project.DTO.GetOrderDto;
import com.endava.java2023Project.DTO.OrderDTO;
import com.endava.java2023Project.Model.Orders;
import com.endava.java2023Project.Service.OrdersService;
import org.springframework.http.ResponseEntity;
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
    public List<GetOrderDto> getOrders(@PathVariable("userId") Integer userId){
        List<Orders> orders = ordersService.getOrdersByUserId(userId);
        List<GetOrderDto> result = new ArrayList<>();
        for(Orders o : orders) {
            GetOrderDto newObject = new GetOrderDto();
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
    public GetOrderDto insertNewOrder(@RequestBody OrderDTO orderDto) {
        return ordersService.getOrder(orderDto);
    }


}
