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

public class OsVersion  extends AbstractModel{

    /**
    * Operating System
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Supported operating system version
    */
    @SerializedName("OsVersions")
    @Expose
    private String [] OsVersions;

    /**
    * Supported operating system architecture
    */
    @SerializedName("Architecture")
    @Expose
    private String [] Architecture;

    /**
     * Obtain the type of the operating system
     * @return OsName The type of the operating system
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * The type of the operating system
     * @param OsName The type of the operating system
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * The operating system version which is supported.
     * @return OsVersions The operating system version which is supported.
     */
    public String [] getOsVersions() {
        return this.OsVersions;
    }

    /**
     * Setting the operating system version which is supported.
     * @param OsVersions The operating system version which is supported.
     */
    public void setOsVersions(String [] OsVersions) {
        this.OsVersions = OsVersions;
    }

    /**
     * Obtain the supported operating system architecture
     * @return Architecture Supported operating system architecture
     */
    public String [] getArchitecture() {
        return this.Architecture;
    }

    /**
     * Setting the supported operating system architecture
     * @param Architecture Supported operating system architecture
     */
    public void setArchitecture(String [] Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "OsVersions.", this.OsVersions);
        this.setParamArraySimple(map, prefix + "Architecture.", this.Architecture);

    }
}

