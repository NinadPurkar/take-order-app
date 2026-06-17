package com.restaurant.entity;
import java.util.List;


public class Order 
{

    private Integer id;
    private Integer tableId;
    private List<MenuItem> items;
    private String status;

    public Integer getId()
    {
        return id;
    } 
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getTableId()
    {
        return tableId;
    }
    public void setTableId(Integer tableId)
    {
        this.tableId = tableId;
    }
    public List<MenuItem> getItems()
    {
        return items;
    }
    public void setItems(List<MenuItem> items)
    {
        this.items = items;
    }

    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

}
