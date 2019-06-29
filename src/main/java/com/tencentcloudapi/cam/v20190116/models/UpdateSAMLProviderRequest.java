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

public class UpdateSAMLProviderRequest  extends AbstractModel{

    /**
    * SAML IdP name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SAML IdP description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Base64-encoded metadata document of the SAML IdP
    */
    @SerializedName("SAMLMetadataDocument")
    @Expose
    private String SAMLMetadataDocument;

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
     * Getting SAML IdP Description
     * @return Description SAML IdP Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Configuring SAML IdP Description
     * @param Description SAML IdP Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Getting base64-encoded metadata document of the SAML IdP
     * @return SAMLMetadataDocument base64-encoded metadata document of the SAML IdP
     */
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    /**
     * Configuring base64-encoded metadata document of the SAML IdP
     * @param SAMLMetadataDocument base64-encoded metadata document of the SAML IdP
     */
    public void setSAMLMetadataDocument(String SAMLMetadataDocument) {
        this.SAMLMetadataDocument = SAMLMetadataDocument;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SAMLMetadataDocument", this.SAMLMetadataDocument);

    }
}

