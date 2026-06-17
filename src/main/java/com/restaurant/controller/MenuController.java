package com.restaurant.controller;

import org.springframework.web.bind.annotation.RestController;
import com.restaurant.entity.MenuItem;
import com.restaurant.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@RestController
@RequestMapping("/api/menu")
public class MenuController 
{

    private final MenuService menuService;

    public MenuController(MenuService menuService)
    {
        this.menuService = menuService;
    }

    @GetMapping
    public List<MenuItem> getAllMenuItems()
    {
        return menuService.getAllMenuItem();
    }

}
