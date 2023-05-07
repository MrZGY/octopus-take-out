package com.zgy.octopus.dto;

import com.zgy.octopus.entity.Setmeal;
import com.zgy.octopus.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
