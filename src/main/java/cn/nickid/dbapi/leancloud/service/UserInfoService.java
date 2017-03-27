/**   
* @Title: UserInfoService.java
* @Package cn.nickid.dbapi.leancloud.service
* @Description: TODO(用一句话描述该文件做什么)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午6:46:22
* @version V1.0
*/
package cn.nickid.dbapi.leancloud.service;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;

import cn.nickid.dbapi.req.UserReq;
import cn.nickid.dbapi.res.UserRes;

/** 
* @ClassName: UserInfoService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author yunhaibin nickid_qq_com
* @date 2017年3月23日 下午6:46:22
*  
*/
public interface UserInfoService {
	/** 
	* @Title: saveUserInfo
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param userInfo    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public void saveUserInfo(AVObject userInfo);
	/** 
	* @Title: getUserInfoByUserName
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param userName
	* @param @return
	* @param @throws AVException    设定文件 
	* @return AVObject    返回类型 
	* @throws AVException
	*/
	public UserRes getUserInfoByUserName(UserReq userReq) throws AVException;
}
