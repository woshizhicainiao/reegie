package com.lujianke.reggie.dto;

import com.lujianke.reggie.entity.Setmeal;
import com.lujianke.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
