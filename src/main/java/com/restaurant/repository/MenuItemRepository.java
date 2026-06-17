package com.restaurant.repository;

import com.restaurant.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer>
{


} 
