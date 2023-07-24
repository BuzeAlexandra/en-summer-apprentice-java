package com.endava.java2023Project.service;

import com.endava.java2023Project.dto.GetOrderDTO;
import com.endava.java2023Project.dto.OrderDTO;
import com.endava.java2023Project.model.Orders;
import com.endava.java2023Project.model.TicketCategory;
import com.endava.java2023Project.repository.OrdersRepository;
import com.endava.java2023Project.repository.TicketCategoryRepository;
import com.endava.java2023Project.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;
    private final UsersRepository usersRepository;
    private final TicketCategoryRepository ticketCategoryRepository;


    public OrdersService(OrdersRepository ordersRepository, UsersRepository usersRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.ordersRepository = ordersRepository;
        this.usersRepository = usersRepository;

        this.ticketCategoryRepository = ticketCategoryRepository;
    }
    public List<Orders> getOrdersByUserId(Integer userId){
        return ordersRepository.findAllByUserId_UserId(userId);
    }


    public GetOrderDTO getOrder(OrderDTO orderDto)
    {
        Optional<TicketCategory> ticketCategory= ticketCategoryRepository.findById(orderDto.getTicketCategoryId());
        long sum = (long) (orderDto.getNumberOfTickets() * ticketCategory.get().getPrice());
        GetOrderDTO getorderDTO = new GetOrderDTO(orderDto.getEventId(), new Date(2023,11,11),orderDto.getTicketCategoryId(),orderDto.getNumberOfTickets(),sum);
        return getorderDTO;

    }

    }



