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

public class DeleteDisasterRecoverGroupsRequest  extends AbstractModel{

    /**
    * spread placement group ID了list, can query via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810).
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
     * Get spread placement group ID了list, can query via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810).
     * @return DisasterRecoverGroupIds spread placement group ID了list, can query via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810).
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set spread placement group ID了list, can query via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810).
     * @param DisasterRecoverGroupIds spread placement group ID了list, can query via API [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810).
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);

    }
}

