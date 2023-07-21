package com.endava.java2023Project.Repository;

import com.endava.java2023Project.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer>{
   public List<Orders> findAllByUserId_UserId(Integer userId);


}
