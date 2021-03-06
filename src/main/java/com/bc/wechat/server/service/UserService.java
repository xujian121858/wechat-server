package com.bc.wechat.server.service;

import com.bc.wechat.server.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户业务类接口
 *
 * @author zhou
 */
public interface UserService {
    /**
     * 通过用户名和密码获取用户列表(用于登录)
     *
     * @param paramMap 参数map
     * @return 用户列表
     */
    List<User> getUserByLogin(Map<String, String> paramMap);

    /**
     * 新增用户
     *
     * @param user 用户
     */
    void addUser(User user);

    /**
     * 修改用户昵称
     *
     * @param paramMap 参数map
     */
    void updateUserNickName(Map<String, String> paramMap);

    /**
     * 修改用户微信号
     *
     * @param paramMap 参数map
     */
    void updateUserWxId(Map<String, String> paramMap);

    /**
     * 修改用户性别
     *
     * @param paramMap 参数map
     */
    void updateUserSex(Map<String, String> paramMap);

    /**
     * 修改用户头像
     *
     * @param paramMap 参数map
     */
    void updateUserAvatar(Map<String, String> paramMap);

    /**
     * 修改用户签名
     *
     * @param paramMap 参数map
     */
    void updateUserSign(Map<String, String> paramMap);

    /**
     * 修改朋友圈最新图片
     *
     * @param paramMap 参数map
     */
    void updateUserLastestCirclePhotos(Map<String, String> paramMap);

    /**
     * 通过关键字搜索用户
     *
     * @param keyword 关键字  手机号/微信号
     * @return 用户列表
     */
    List<User> getUserByKeyword(String keyword);

    /**
     * 根据用户ID获取用户
     *
     * @param userId 用户ID
     * @return 用户
     */
    User getUserByUserId(String userId);

    /**
     * 获取所有用户
     *
     * @return 所有用户
     */
    List<User> getAllUserList();

    /**
     * 根据用户手机号检查用户是否存在
     *
     * @param userPhone 用户手机号
     * @return true: 存在   false: 不存在
     */
    boolean checkUserExistsByUserPhone(String userPhone);

    /**
     * 刷新用户二维码
     *
     * @param user 用户
     * @return true: 刷新成功  false: 刷新失败
     */
    boolean refreshUserQrCode(User user);
}
