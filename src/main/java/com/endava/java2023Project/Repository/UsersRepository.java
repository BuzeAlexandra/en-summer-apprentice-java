package com.endava.java2023Project.Repository;

import com.endava.java2023Project.Model.Orders;
import com.endava.java2023Project.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {


}
