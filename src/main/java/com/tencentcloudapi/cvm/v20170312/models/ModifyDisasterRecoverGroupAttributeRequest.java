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

public class ModifyDisasterRecoverGroupAttributeRequest  extends AbstractModel{

    /**
    * Spread placement group ID, which can be obtained via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Name of a spread placement group with a length of 1-60 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get ID of a spread placement group, which can be obtained via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)
     * @return DisasterRecoverGroupId ID of a spread placement group, which can be obtained via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set ID of a spread placement group, which can be obtained via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)
     * @param DisasterRecoverGroupId ID of a spread placement group, which can be obtained via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get name of a spread placement group with a length of 1-60 characters.
     * @return Name Name of spread placement group, group name between 1 and 60 characters long (Chinese or English).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set name of a spread placement group with a length of 1-60 characters.
     * @param Name Name of spread placement group, group name between 1 and 60 characters long (Chinese or English).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

