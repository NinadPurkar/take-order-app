package com.restaurant.util;

import com.restaurant.entity.Table;
import java.util.ArrayList;
import java.util.List;

public class TableManager 
{
    private static final List<Table> tables = new ArrayList<>();

    static
    {
        for (int i=0;i<10;i++)
        {
            tables.add(new Table(i,"Available", null));
        }
    }

    public static List<Table> getTables()
    {
        return tables;
    }

    public static Table getTableById(Integer id)
    {
        for( Table table : tables)
        {
            if (table.getId().equals(id))
            {
                return table;
            }
        }
        return null;
    }


}
