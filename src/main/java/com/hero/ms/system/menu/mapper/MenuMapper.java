package com.hero.ms.system.menu.mapper;

import com.hero.ms.system.menu.entity.TblSysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Author yejx
 * @Date 2020/1/2
 */
@Mapper
public interface MenuMapper {

    /**
     * 查询所有菜单
     * @return
     */
    List<TblSysMenu> findAll();

}
