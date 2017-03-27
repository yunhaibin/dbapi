/*
 * 文 件 名:  TestService.java
 * 版    权:  Xi'An Leadeon Technologies Co., Ltd. Copyright 2015-9-17,  All rights reserved  
 */
package cn.nickid.dbapi.service;

import cn.nickid.dbapi.req.UserReq;
import cn.nickid.dbapi.res.UserRes;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  yunhaibin
 * @version  [版本号, 2015-9-17]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface UserService {
	/** 
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @param userReq
	 * @return
	 * @see [类、类#方法、类#成员]
	 */
	UserRes getUser(UserReq userReq);
}
