package com.bc.wechat.server.service;

import com.bc.wechat.server.entity.User;
import com.bc.wechat.server.entity.UserRela;

import java.util.List;
import java.util.Map;

/**
 * 用户关系业务类接口
 *
 * @author zhou
 */
public interface UserRelaService {

    /**
     * 新增用户关系
     *
     * @param userRela 用户关系
     */
    void addUserRela(UserRela userRela);

    /**
     * 修改用户关系
     *
     * @param userRela 用户关系
     */
    void updateUserRela(UserRela userRela);

    /**
     * 检查是否好友关系
     *
     * @param paramMap 参数map
     * @return true:是  false:否
     */
    boolean checkIsFriend(Map<String, String> paramMap);

    /**
     * 获取用户关系列表
     *
     * @param paramMap 参数map
     * @return 用户关系列表
     */
    List<UserRela> getUserRelaListByUserIdAndFriendId(Map<String, String> paramMap);

    /**
     * 获取好友列表
     *
     * @param userId 用户ID
     * @return 好友列表
     */
    List<User> getFriendList(String userId);

    /**
     * 删除好友
     *
     * @param paramMap 参数map
     *                 包含用户ID和好友ID
     */
    void deleteFriend(Map<String, String> paramMap);

    /**
     * 通过好友申请的方式建立初始化的单向用户关系
     * 主要初始化备注信息，朋友权限，朋友圈和视频动态
     *
     * @param fromUserId    用户ID
     * @param toUserId      好友ID
     * @param relaRemark    好友备注
     * @param relaAuth      好友朋友权限 "0":聊天、朋友圈、微信运动  "1":仅聊天
     * @param relaNotSeeMe  朋友圈和视频动态 "0":可以看我 "1":不让他看我
     * @param relaNotSeeHim 朋友圈和视频动态 "0":可以看他 "1":不看他
     */
    void addSingleUserRelaByFriendApply(String fromUserId, String toUserId,
                                        String relaRemark, String relaAuth,
                                        String relaNotSeeMe, String relaNotSeeHim);

    /**
     * 设置或取消星标朋友
     *
     * @param paramMap 参数map
     * @return ResponseEntity
     */
    void updateUserStarFriend(Map<String, String> paramMap);
}
