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

public class CreateKeyPairRequest  extends AbstractModel{

    /**
    * Name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * The project ID to which the created key pair belongs. You can obtain the project ID by either of the following ways:
<li>Query the project ID via the project list.
<li>Get the project ID from `projectId ` in the returned result of API DescribeProject.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * Get name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
     * @return KeyName Name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
     * @param KeyName Name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get the project ID to which the created key pair belongs. You can obtain the project ID by either of the following ways:
<li>Query the project ID via the project list.
<li>Get the project ID from `projectId ` in the returned result of API DescribeProject.
     * @return ProjectId The project ID to which the created key pair belongs. You can obtain the project ID by either of the following ways:
<li>Query the project ID via the project list.
<li>Get the project ID from `projectId ` in the returned result of API DescribeProject.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set the project ID to which the created key pair belongs. You can obtain the project ID by either of the following ways:
<li>Query the project ID via the project list.
<li>Get the project ID from `projectId ` in the returned result of API DescribeProject.
     * @param ProjectId The project ID to which the created key pair belongs. You can obtain the project ID by either of the following ways:
<li>Query the project ID via the project list.
<li>Get the project ID from `projectId ` in the returned result of API DescribeProject.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

