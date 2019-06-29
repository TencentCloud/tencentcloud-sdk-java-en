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

public class UpdatePolicyRequest  extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy Name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Policy Documentation
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

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
     * Getting Policy Name
     * @return PolicyName Policy Name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Configuring Policy Name
     * @param PolicyName Policy Name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Getting Policy Description
     * @return Description Policy Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Configuring Policy Description
     * @param Description Policy description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Getting Policy Documentation
     * @return PolicyDocument Policy Documentation
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Configuring Policy Documentation
     * @param PolicyDocument Policy Documentation
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);

    }
}

