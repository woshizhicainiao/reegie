package com.lujianke.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lujianke.reggie.dto.DishDto;
import com.lujianke.reggie.entity.Dish;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);

    public void updateWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    void remove(Long id);
}
