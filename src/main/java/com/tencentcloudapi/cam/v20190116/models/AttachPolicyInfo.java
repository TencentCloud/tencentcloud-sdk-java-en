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

public class AttachPolicyInfo  extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy NameNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy Created TimeNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * How Policy Created: 1. Via console; 2. Via syntax Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * Valid values: user, QCSNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
     * Getting Policy ID
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Configuring Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Getting Policy NameNote: This field may return null, indicating that no valid value was found.
     * @return PolicyName Policy NameNote: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Configuring Policy NameNote: This field may return null, indicating that no valid value was found.
     * @param PolicyName Policy NameNote: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Getting Policy Created TimeNote: This field may return null, indicating that no valid value was found.
     * @return AddTime Policy Created TimeNote: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Configuring Policy Created TimeNote: This field may return null, indicating that no valid value was found.
     * @param AddTime Policy created timeNote: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * How Policy Created: 1. Via console; 2. Via syntax Note: This field may return null, indicating that no valid value was found.
     * @return CreateMode How Policy Created: 1. Via console; 2. Via syntax Note: This field may return null, indicating that no valid value was found.
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Configuring How Policy Created: 1. Via console; 2. Via syntax Note: This field may return null, indicating that no valid value was found.
     * @param CreateMode How Policy Created: 1. Via console; 2. Via syntax Note: This field may return null, indicating that no valid value was found.
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Getting valid values: user, QCSNote: This field may return null, indicating that no valid value was found.
     * @return PolicyType Valid values: user, QCSNote: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Configuring valid values: user, QCSNote: This field may return null, indicating that no valid value was found.
     * @param PolicyType Valid values: user, QCSNote: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);

    }
}

