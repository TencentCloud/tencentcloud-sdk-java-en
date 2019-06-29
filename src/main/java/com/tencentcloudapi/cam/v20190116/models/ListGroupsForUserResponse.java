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

public class ListGroupsForUserResponse  extends AbstractModel{

    /**
    * Total number of user groups to which the sub-user is added
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * User group information
    */
    @SerializedName("GroupInfo")
    @Expose
    private GroupInfo [] GroupInfo;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain the total number of user groups to which the sub-user is added
     * @return TotalNum the total number of user groups to which the sub-user is added
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set the total number of user groups to which the sub-user is added
     * @param TotalNum the total number of user groups to which the sub-user is added
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Obtain user group information
     * @return GroupInfo user group information
     */
    public GroupInfo [] getGroupInfo() {
        return this.GroupInfo;
    }

    /**
     * Configure user group information
     * @param GroupInfo user group information
     */
    public void setGroupInfo(GroupInfo [] GroupInfo) {
        this.GroupInfo = GroupInfo;
    }

    /**
     * Getting unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "GroupInfo.", this.GroupInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

