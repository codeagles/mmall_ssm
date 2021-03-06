package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@Param(value = "userId") Integer userId, @Param(value = "productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProfucrCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@Param("userId") Integer userId,@Param("productIdList") List<String> productIdList);

    int checkedOrUnCheckedProduct(@Param("userId") Integer userId,@Param(value = "productId") Integer productId,@Param("checked") Integer checked);

    int selectCartProductCount(Integer userId);

    List<Cart> selectCheckedCartbyUserId(Integer userId);
}