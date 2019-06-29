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

public class StrategyInfo  extends AbstractModel{

    /**
    * Policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy Name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Time policy created. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy type. 1: custom policy; 2: predefined policy.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Policy description. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * How policy created: 1. via console; 2. via syntax.
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * Number of associated users
    */
    @SerializedName("Attachments")
    @Expose
    private Long Attachments;

    /**
    * Product associated with the policyNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * Getting policy ID.
     * @return PolicyId policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Configuring policy ID.
     * @param PolicyId policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Getting policy name.
     * @return PolicyName policy name.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Configuring policy name.
     * @param PolicyName policy name.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Getting creation time of the policy. Note: This field may return null, indicating that no valid value was found.
     * @return AddTime Policy Creation Time Note: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Configuring policy creation Time Note: This field may return null, indicating that no valid value was found.
     * @param AddTime policy creation time Note: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Getting policy type. 1: custom policy; 2: predefined policy.
     * @return Type policy type. 1: custom policy; 2: predefined policy.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Configuring policy type. 1: custom policy; 2: predefined policy.
     * @param Type policy type. 1: custom policy; 2: predefined policy.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Getting policy description Note: This field may return null, indicating that no valid value was found.
     * @return Description policy description. Note: This field may return null, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Configuring policy description Note: This field may return null, indicating that no valid value was found.
     * @param Description Policy description Note: This field may return null, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Getting how policy created: 1. Via console; 2. Via syntax
     * @return CreateMode How Policy Created: 1. Via console; 2. Via syntax
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Configuring How Policy Created: 1. Via console; 2. Via syntax
     * @param CreateMode How Policy Created: 1. Via console; 2. Via syntax
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Getting number of associated users
     * @return Attachments number of associated users
     */
    public Long getAttachments() {
        return this.Attachments;
    }

    /**
     * Configuring number of associated users
     * @param Attachments number of associated users
     */
    public void setAttachments(Long Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Getting product associated with the policyNote: This field may return null, indicating that no valid value was found.
     * @return ServiceType product associated with the policyNote: This field may return null, indicating that no valid value was found.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Configuring product associated with the policyNote: This field may return null, indicating that no valid value was found.
     * @param ServiceType product associated with the policyNote: This field may return null, indicating that no valid value was found.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "Attachments", this.Attachments);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

