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

public class DescribeInstanceInternetBandwidthConfigsRequest  extends AbstractModel{

    /**
    * IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * IDs of instances can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     * @return InstanceIds ID of instances you are working can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     * @param InstanceIds  ID of instances you are working with can be obtained from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

