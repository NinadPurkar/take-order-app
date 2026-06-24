package com.restaurant.service;
import com.restaurant.entity.MenuItem;
import com.restaurant.repository.MenuItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class MenuService 
{
    private final MenuItemRepository menuItemRepository;

    public MenuService(MenuItemRepository menuItemRepository)
    {
        this.menuItemRepository = menuItemRepository;

    }

    public List<MenuItem> getAllMenuItem()
    {
        return menuItemRepository.findAll();
    }

     public MenuItem addMenuItem(MenuItem item) {
        return menuItemRepository.save(item);
    }

    public MenuItem updateMenuItem(Integer id, MenuItem item) {
        item.setId(id);
        return menuItemRepository.save(item);
    }

    public void deleteMenuItem(Integer id) {
        menuItemRepository.deleteById(id);
    }
}
