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

public class ListAttachedUserPoliciesResponse  extends AbstractModel{

    /**
    * Total number of policies
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * List of policies
    */
    @SerializedName("List")
    @Expose
    private AttachPolicyInfo [] List;

    /**
    * The unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Getting total number of policies
     * @return TotalNum total number of policies
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Configuring total number of policies
     * @param TotalNum total number of policies
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Obtain list of policies
     * @return List list of policies
     */
    public AttachPolicyInfo [] getList() {
        return this.List;
    }

    /**
     * Set list of policies 
     * @param List list of policies
     */
    public void setList(AttachPolicyInfo [] List) {
        this.List = List;
    }

    /**
     * Obtain the unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     * @return RequestId unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set the unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     * @param RequestId the unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

