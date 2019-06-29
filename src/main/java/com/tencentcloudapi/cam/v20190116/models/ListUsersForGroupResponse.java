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

public class ListUsersForGroupResponse  extends AbstractModel{

    /**
    * Total number of users associated with the user group.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Sub-user information.
    */
    @SerializedName("UserInfo")
    @Expose
    private GroupMemberInfo [] UserInfo;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain total number of users associated with the user group.
     * @return TotalNum total user group number.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Configure total number of users associated with the user group.
     * @param TotalNum total user group number.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Obtain sub-user information.
     * @return UserInfo sub-user information.
     */
    public GroupMemberInfo [] getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Configure sub-user information.
     * @param UserInfo sub-user information.
     */
    public void setUserInfo(GroupMemberInfo [] UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Obtain the unique request ID. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId the unique request ID. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique request ID. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

