package com.neuedu.controller.backend;

import com.neuedu.common.Const;
import com.neuedu.common.ServerResponse;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
@RestController
@RequestMapping(value="/manage/order")
public class OrderManageController {

    @Autowired
    IOrderService orderService;
    /**
     * 取消订单
     * */
    @RequestMapping(value="/send_goods.do")
    public ServerResponse send_goods(HttpSession session, Long orderNo){
        UserInfo userInfo=(UserInfo) session.getAttribute(Const.CURRENTUSER);
        if (userInfo==null){
            return ServerResponse.serverResponseByError("需要登录");
        }

        return orderService.send_goods(userInfo.getId(),orderNo);
    }

}
