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

public class GetPolicyResponse  extends AbstractModel{

    /**
    * Policy NameNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy DescriptionNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 1: custom policy; 2: predefined policy.Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Policy Creation TimeNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Latest Update TimeNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Policy DocumentationNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * The unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Getting Policy DescriptionNote: This field may return null, indicating that no valid value was found.
     * @return Description Policy descriptionNote: This field may return null, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Configuring Policy DescriptionNote: This field may return null, indicating that no valid value was found.
     * @param Description Policy descriptionNote: This field may return null, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 1: custom policy; 2: predefined policy.Note: This field may return null, indicating that no valid value was found.
     * @return Type 1: custom policy; 2: predefined policy.Note: This field may return null, indicating that no valid value was found.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * 1: custom policy; 2: predefined policy.Note: This field may return null, indicating that no valid value was found.
     * @param Type 1: custom policy; 2: predefined policy.Note: This field may return null, indicating that no valid value was found.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Getting Policy Creation Time.Note: This field may return null, indicating that no valid value was found.
     * @return AddTime Policy Creation TimeNote: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Configuring Policy Creation TimeNote: This field may return null, indicating that no valid value was found.
     * @param AddTime Policy creation timeNote: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Getting Latest Update TimeNote: This field may return null, indicating that no valid value was found.
     * @return UpdateTime Time of the latest updateNote: This field may return null, indicating that no valid value was found.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Setting Latest Update TimeNote: This field may return null, indicating that no valid value was found.
     * @param UpdateTime Time of the latest updateNote: This field may return null, indicating that no valid value was found.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Getting Policy DocumentationNote: This field may return null, indicating that no valid value was found.
     * @return PolicyDocument Policy documentationNote: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Configuring Policy DocumentationNote: This field may return null, indicating that no valid value was found.
     * @param PolicyDocument Policy documentationNote: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Getting unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configuring RequestId. RequestId is the ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

