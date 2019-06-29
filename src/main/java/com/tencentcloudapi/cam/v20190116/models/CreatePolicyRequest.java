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

public class CreatePolicyRequest  extends AbstractModel{

    /**
    * Policy Name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy Documentation
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * Policy Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Getting Policy Description
     * @return Description Policy Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Configuring Policy Description
     * @param Description Policy Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

