/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGroupResponse  extends AbstractModel{

    /**
    * User group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * User Group Name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Number of Members in User Group
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * User Group Description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * User Group Creation Time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * User Group Member Information
    */
    @SerializedName("UserInfo")
    @Expose
    private GroupMemberInfo [] UserInfo;

    /**
    * The unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Getting user group ID
     * @return GroupId user group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Setting user group ID
     * @param GroupId user group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Obtaining user group name.
     * @return GroupName user group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Creating user group name.
     * @param GroupName user group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Getting the number of members in the user group
     * @return GroupNum Number of members in the user group
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Setting the number of members allowed in the user group
     * @param GroupNum The number of members allowed in the user group
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Obtaining user group description.
     * @return Remark user group description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Setting user group description.
     * @param Remark user group description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Obtaining user group creation time.
     * @return CreateTime user group creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Setting user group creation time.
     * @param CreateTime user group creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Getting user group member information
     * @return UserInfo user group member information
     */
    public GroupMemberInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Configuring user group member information settings
     * @param UserInfo user group member information
     */
    public void setUserInfo(GroupMemberInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Getting unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId, the unique request ID. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configuring RequestId. RequestId is the ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId is the ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues. 
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

