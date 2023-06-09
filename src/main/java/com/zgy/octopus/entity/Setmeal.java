package com.zgy.octopus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@ApiModel("套餐")
public class Setmeal implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;


    
    @ApiModelProperty("分类id")
    private Long categoryId;


    
    @ApiModelProperty("套餐名称")
    private String name;


    
    @ApiModelProperty("套餐价格")
    private BigDecimal price;


    
    @ApiModelProperty("状态")
    private Integer status;


    
    @ApiModelProperty("套餐编号")
    private String code;


    
    @ApiModelProperty("描述信息")
    private String description;


    
    @ApiModelProperty("图片")
    private String image;


    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    @TableField(fill = FieldFill.INSERT)
    private Long createUser;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;

}
