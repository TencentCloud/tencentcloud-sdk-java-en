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

public class GetSAMLProviderResponse  extends AbstractModel{

    /**
    * SAML IdP Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAML IdP Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * SAML IdP Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * SAML IdP Latest Modified Time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * SAML IdP Metadata Document
    */
    @SerializedName("SAMLMetadata")
    @Expose
    private String SAMLMetadata;

    /**
    * The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Getting SAML IdP Name
     * @return Name SAML IdP Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Configuring SAML IdP Name
     * @param Name SAML IdP Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * SAML IdP Description
     * @return Description SAML IdP Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * SAML IdP Description
     * @param Description SAML IdP description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Getting SAML IdP Creation Time
     * @return CreateTime  SAML IdP creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Setting SAML IdP Creation Time
     * @param CreateTime  SAML IdP creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Getting SAML IdP Latest Modified Time
     * @return ModifyTime SAML IdP last modified time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Configuring SAML IdP Latest Modified Time
     * @param ModifyTime SAML IdP lastest modified time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Getting SAML IdP Metadata File
     * @return SAMLMetadata SAML IdP metadata file
     */
    public String getSAMLMetadata() {
        return this.SAMLMetadata;
    }

    /**
     * Configuring SAML IdP Metadata File
     * @param SAMLMetadata SAML IdP metadata file
     */
    public void setSAMLMetadata(String SAMLMetadata) {
        this.SAMLMetadata = SAMLMetadata;
    }

    /**
     * Getting RequestId, the ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SAMLMetadata", this.SAMLMetadata);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

