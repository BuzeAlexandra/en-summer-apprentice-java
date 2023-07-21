package com.endava.java2023Project.Service;

import com.endava.java2023Project.DTO.GetOrderDto;
import com.endava.java2023Project.DTO.OrderDTO;
import com.endava.java2023Project.Model.Orders;
import com.endava.java2023Project.Model.Ticket_Category;
import com.endava.java2023Project.Repository.OrdersRepository;
import com.endava.java2023Project.Repository.Ticket_CategoryRepository;
import com.endava.java2023Project.Repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;
    private final UsersRepository usersRepository;
    private final Ticket_CategoryRepository ticketCategoryRepository;


    public OrdersService(OrdersRepository ordersRepository, UsersRepository usersRepository, Ticket_CategoryRepository ticketCategoryRepository) {
        this.ordersRepository = ordersRepository;
        this.usersRepository = usersRepository;

        this.ticketCategoryRepository = ticketCategoryRepository;
    }
    public List<Orders> getOrdersByUserId(Integer userId){
        return ordersRepository.findAllByUserId_UserId(userId);
    }


    public GetOrderDto getOrder(OrderDTO orderDto)
    {
        Optional<Ticket_Category> ticketCategory= ticketCategoryRepository.findById(orderDto.getTicketCategoryId());
        long sum = (long) (orderDto.getNumberOfTickets() * ticketCategory.get().getPrice());
        GetOrderDto getorderDTO = new GetOrderDto(orderDto.getEventId(), new Date(2023,11,11),orderDto.getTicketCategoryId(),orderDto.getNumberOfTickets(),sum);
        return getorderDTO;



    }



    }



