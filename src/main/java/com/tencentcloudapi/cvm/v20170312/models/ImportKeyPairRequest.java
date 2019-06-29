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
    * Name of key pair, can only contain alphanumeric characters and underscore, name should not longer than 25 characters.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * The ID of the [project](https://intl.cloud.tencent.com/document/product/378/10863) to which the created key pair belongs.<br><br>You can obtain the project ID by either of the following ways:<br><li>Query project ID from [Project Management](https://console.cloud.tencent.com/project)<br><li>Obtain the project ID from `projectId ` field in the returned values of API DescribeProject. For default project, enter 0 as project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * The public key (in plain text) of the key pair, `OpenSSH RSA` format
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get name of key pair, can only contain alphanumeric characters and underscore, name should not longer than 25 characters.
     * @return KeyName Name of key pair, can only contain alphanumeric characters and underscore, name should not longer than 25 characters.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set name of key pair, can only contain alphanumeric characters and underscore, name should not longer than 25 characters.
     * @param KeyName Name of key pair, can only contain alphanumeric characters and underscore, name should not longer than 25 characters.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get the ID of the [project](https://intl.cloud.tencent.com/document/product/378/10863) to which the created key pair belongs.<br><br>You can obtain the project ID by either of the following ways:<br><li>Query project ID from [Project Management](https://console.cloud.tencent.com/project)<br><li>Obtain the project ID from `projectId ` field in the returned values of API DescribeProject. For default project, enter 0 as project ID.
     * @return ProjectId The ID of the [project](https://intl.cloud.tencent.com/document/product/378/10863) to which the created key pair belongs.<br><br>You can obtain the project ID by either of the following ways:<br><li>Query project ID from [Project Management](https://console.cloud.tencent.com/project)<br><li>Obtain the project ID from `projectId ` field in the returned values of API DescribeProject. For default project, enter 0 as project ID.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set the ID of the [project](https://intl.cloud.tencent.com/document/product/378/10863) to which the created key pair belongs.<br><br>You can obtain the project ID by either of the following ways:<br><li>Query project ID from [Project Management](https://console.cloud.tencent.com/project)<br><li>Obtain the project ID from `projectId ` field in the returned values of API DescribeProject. For default project, enter 0 as project ID.
     * @param ProjectId The ID of the [project](https://intl.cloud.tencent.com/document/product/378/10863) to which the created key pair belongs.<br><br>You can obtain the project ID by either of the following ways:<br><li>Query project ID from [Project Management](https://console.cloud.tencent.com/project)<br><li>Obtain the project ID from `projectId ` field in the returned values of API DescribeProject. For default project, enter 0 as project ID.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get the public key (in plain text) of the key pair, `OpenSSH RSA` format.
     * @return PublicKey The public key (in plain text) of the key pair, `OpenSSH RSA` format.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set the public key (in plain text) of the key pair, `OpenSSH RSA` format.
     * @param PublicKey The public key (in plain text) of the key pair, `OpenSSH RSA` format.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

