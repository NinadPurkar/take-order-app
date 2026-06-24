package com.restaurant.controller;

import org.springframework.web.bind.annotation.RestController;
import com.restaurant.entity.MenuItem;
import com.restaurant.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item)
    {
        return menuService.addMenuItem(item);
    }

    @PutMapping("/{id}")
    public MenuItem updateMenuItem(@PathVariable Integer id, @RequestBody MenuItem item)
    {
        return menuService.updateMenuItem(id,item);
    }

    @DeleteMapping("/{id}")
    public void deleteMenuItem(@PathVariable Integer id)
    {
        menuService.deleteMenuItem(id);
    }

}
