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

public class EnhancedService  extends AbstractModel{

    /**
    * Enables cloud security service. If this parameter is not specified, the cloud security service is enabled by default.
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;

    /**
    * Enables cloud monitor service. If this parameter is not specified, the cloud monitor service is enabled by default.
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;

    /**
     * Get the cloud security service on. If this parameter is not specified, the cloud security service is enabled by default.
     * @return SecurityService Enables cloud security service. If this parameter is not specified, the cloud security service is enabled by default.
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * Set to turn on cloud security services. If this parameter is not specified, the cloud security service is enabled by default.
     * @param SecurityService Enables cloud security service. If this parameter is not specified, the cloud security service is enabled by default.
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * Get the cloud monitor service on. If this parameter is not specified, the cloud monitor service is enabled by default.
     * @return MonitorService Enables cloud monitor service. If this parameter is not specified, the cloud monitor service is enabled by default.
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * Set to turn on cloud monitor service. If this parameter is not specified, the cloud monitor service is enabled by default.
     * @param MonitorService Enables cloud monitor service. If this parameter is not specified, the cloud monitor service is enabled by default.
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);

    }
}

