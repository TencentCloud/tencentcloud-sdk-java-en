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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaunchConfigurationResponse  extends AbstractModel{

    /**
    * Launch configuration ID, which is returned when you create a launch configuration using this API.
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get launch configuration ID, which is returned when you create a launch configuration using this API.
     * @return LaunchConfigurationId Launch configuration ID, which is returned when you create a launch configuration using this API.
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set launch configuration ID, which is returned when you create a launch configuration using this API.
     * @param LaunchConfigurationId Launch configuration ID, which is returned when you create a launch configuration using this API.
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId The unique ID of a request, which is returned for each request. The RequestId is required for troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

