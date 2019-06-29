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

public class ListPoliciesResponse  extends AbstractModel{

    /**
    * Total policy number
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Policy array. Each array contains fields such as policyId, policyName, addTime, type, description, and createMode. policyId: policy ID policyName：policy nameaddTime: creation time of the policy.type：1 is custom policy; 2 is predefined policy. description：policy description createMode: 1 indicates a policy created according to business permissions, while other values indicate you can view policy syntax and update a policy through the policy syntax.
    */
    @SerializedName("List")
    @Expose
    private StrategyInfo [] List;

    /**
    * Reserved fieldNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ServiceTypeList")
    @Expose
    private String [] ServiceTypeList;

    /**
    * The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
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
     * Getting policy array. Each array contains fields such as policyId, policyName, addTime, type, description, and createMode. Among which: policyId：policy ID policyName：policy nameaddTime: creation time of the policy.type：1 is custom policy; 2 is predefined policy. description：policy description createMode: 1 indicates a policy created according to business permissions, while other values indicate you can view policy syntax and update a policy through the policy syntax.
     * @return List policy array. Each array contains fields such as policyId, policyName, addTime, type, description, and createMode. Among which:  policyId: policy ID policyName：policy nameaddTime: creation time of the policy.type：1 is custom policy; 2 is predefined policy. description：policy description createMode: 1 indicates a policy created according to business permissions, while other values indicate you can view policy syntax and update a policy through the policy syntax.
     */
    public StrategyInfo [] getList() {
        return this.List;
    }

    /**
     * Set policy array. Each array contains fields such as policyId, policyName, addTime, type, description, and createMode. Among which: policyId：policy ID policyName：policy nameaddTime: creation time of the policy.type：1 is custom policy; 2 is predefined policy. description：policy description createMode: 1 indicates a policy created according to business permissions, while other values indicate you can view policy syntax and update a policy through the policy syntax.
     * @param List policy array. Each array contains fields such as policyId, policyName, addTime, type, description, and createMode. Among which:  policyId：policy ID policyName：policy nameaddTime: creation time of the policy.type：1 is custom policy; 2 is predefined policy. description：policy description createMode: 1 indicates a policy created according to business permissions, while other values indicate you can view policy syntax and update a policy through the policy syntax.
     */
    public void setList(StrategyInfo [] List) {
        this.List = List;
    }

    /**
     * Getting reserved fieldNote: This field may return null, indicating that no valid value was found.
     * @return ServiceTypeList reserved fieldsNote: This field may return null, indicating that no valid value was found.
     */
    public String [] getServiceTypeList() {
        return this.ServiceTypeList;
    }

    /**
     * Setting reserved fieldsNote: This field may return null, indicating that no valid value was found.
     * @param ServiceTypeList reserved fieldsNote: This field may return null, indicating that no valid value was found.
     */
    public void setServiceTypeList(String [] ServiceTypeList) {
        this.ServiceTypeList = ServiceTypeList;
    }

    /**
     * Obtain the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
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
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamArraySimple(map, prefix + "ServiceTypeList.", this.ServiceTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

