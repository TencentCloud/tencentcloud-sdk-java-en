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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportKeyPairRequest  extends AbstractModel{

    /**
    * Key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * The ID of the [project](https://cloud.tencent.com/document/product/378/10861) to which the created key pair belongs.<br><br>You can retrieve the project ID in two ways:<br><li>Query the project ID in [Project Management](https://console.cloud.tencent.com/project).<br><li>Call [DescribeProject](https://cloud.tencent.com/document/api/378/4400) and search for `projectId` in the response.

If you want to use the default project, specify 0 for the parameter.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Content of the public key in the key pair in the `OpenSSH RSA` format.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get Key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters. 
     * @return KeyName Key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set Key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
     * @param KeyName Key pair name, which can contain numbers, letters, and underscores, with a maximum length of 25 characters.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get The ID of the [project](https://cloud.tencent.com/document/product/378/10861) to which the created key pair belongs.<br><br>You can retrieve the project ID in two ways:<br><li>Query the project ID in [Project Management](https://console.cloud.tencent.com/project).<br><li>Call [DescribeProject](https://cloud.tencent.com/document/api/378/4400) and search for `projectId` in the response.

If you want to use the default project, specify 0 for the parameter. 
     * @return ProjectId The ID of the [project](https://cloud.tencent.com/document/product/378/10861) to which the created key pair belongs.<br><br>You can retrieve the project ID in two ways:<br><li>Query the project ID in [Project Management](https://console.cloud.tencent.com/project).<br><li>Call [DescribeProject](https://cloud.tencent.com/document/api/378/4400) and search for `projectId` in the response.

If you want to use the default project, specify 0 for the parameter.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The ID of the [project](https://cloud.tencent.com/document/product/378/10861) to which the created key pair belongs.<br><br>You can retrieve the project ID in two ways:<br><li>Query the project ID in [Project Management](https://console.cloud.tencent.com/project).<br><li>Call [DescribeProject](https://cloud.tencent.com/document/api/378/4400) and search for `projectId` in the response.

If you want to use the default project, specify 0 for the parameter.
     * @param ProjectId The ID of the [project](https://cloud.tencent.com/document/product/378/10861) to which the created key pair belongs.<br><br>You can retrieve the project ID in two ways:<br><li>Query the project ID in [Project Management](https://console.cloud.tencent.com/project).<br><li>Call [DescribeProject](https://cloud.tencent.com/document/api/378/4400) and search for `projectId` in the response.

If you want to use the default project, specify 0 for the parameter.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Content of the public key in the key pair in the `OpenSSH RSA` format. 
     * @return PublicKey Content of the public key in the key pair in the `OpenSSH RSA` format.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Content of the public key in the key pair in the `OpenSSH RSA` format.
     * @param PublicKey Content of the public key in the key pair in the `OpenSSH RSA` format.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

