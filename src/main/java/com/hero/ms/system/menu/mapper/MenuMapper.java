package com.hero.ms.system.menu.mapper;

import com.hero.ms.system.menu.entity.TblSysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description
 * @Author yejx
 * @Date 2020/1/2
 */
//@Mapper
public interface MenuMapper extends JpaRepository<TblSysMenu, String> {

    /**
     * 查询所有菜单
     * @return
     */
    List<TblSysMenu> findAll();

}
