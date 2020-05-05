package com.hero.ms.system.menu.rest;

import com.hero.ms.common.pojo.MsgCode;
import com.hero.ms.common.pojo.ResponseResult;
import com.hero.ms.common.pojo.StatusCode;
import com.hero.ms.system.menu.entity.TblSysMenu;
import com.hero.ms.system.menu.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author yejx
 * @Date 2020/1/2
 */
@Log
@RestController
@RequestMapping("/menu")
@Api(value = "menu", description = "菜单接口")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "请求已完成"),
        @ApiResponse(code = 201, message = "资源成功被创建"),
        @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
        @ApiResponse(code = 401, message = "未授权客户机访问数据"),
        @ApiResponse(code = 403, message = "服务器接受请求，但是拒绝处理"),
        @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
        @ApiResponse(code = 500, message = "服务器出现异常")})
public class MenuRest {

    @Resource(name = "menuServiceImpl")
    private MenuService menuService;

    /**
     * 查询所有菜单
     */
    @ApiOperation(value = "查询所有菜单", notes = "查询所有菜单", response = ResponseResult.class)
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseResult findAll(){
        ResponseResult rr = new ResponseResult();
        List<TblSysMenu> menuList;
        try {
            menuList = menuService.findAll();
            rr.setDATA(menuList);
        } catch (Exception e) {
            log.severe(e.getMessage());
            rr = new ResponseResult(MsgCode.FAILURE.getKey(), StatusCode.CODE_3000.getKey(), StatusCode.CODE_3000.getDesc());
        }
        return rr;
    }

}
