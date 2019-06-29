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

public class RunInstancesResponse  extends AbstractModel{

    /**
    * This parameter is returned when an instance is created via this API, representing one or more instance `ID`. The return of the instance `ID` list does not mean that the instance is created successfully. You can find out whether the instance is created by querying the status of the instance `ID` in the returned InstancesSet via API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728). If the status of the instance changes from "pending" to "running", the instance is created successfully.
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * This parameter is returned when an instance is created via this API, representing one or more instance `ID`. The return of the instance `ID` list does not mean that the instance is created successfully. You can find out whether the instance is created by querying the status of the instance `ID` in the returned InstancesSet via API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728). If the status of the instance changes from "pending" to "running", the instance is created successfully.
     * @return InstanceIdSet This parameter is returned when an instance is created via this API, representing one or more instance `ID`. The return of the instance `ID` list does not mean that the instance is created successfully. You can find out whether the instance is created by querying the status of the instance `ID` in the returned InstancesSet via API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728). If the status of the instance changes from "pending" to "running", the instance is created successfully.
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * This parameter is returned when an instance is created via this API, representing one or more instance `ID`. The return of the instance `ID` list does not mean that the instance is created successfully. You can find out whether the instance is created by querying the status of the instance `ID` in the returned InstancesSet via API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728). If the status of the instance changes from "pending" to "running", the instance is created successfully.
     * @param InstanceIdSet This parameter is returned when an instance is created via this API, representing one or more instance `ID`. The return of the instance `ID` list does not mean that the instance is created successfully. You can find out whether the instance is created by querying the status of the instance `ID` in the returned InstancesSet via API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728). If the status of the instance changes from "pending" to "running", the instance is created successfully.
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Obtain the unique ID of a request, which is required for each troubleshooting case.
     * @return RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of a request, which is required for each troubleshooting case.
     * @param RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

