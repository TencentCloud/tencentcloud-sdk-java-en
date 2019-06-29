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

public class ZoneInfo  extends AbstractModel{

    /**
    * Availability zone name. For example, ap-guangzhou-3
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Availability zone description. For example, Guangzhou Zone 3
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Availability zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Availability zone status, including AVAILABLE and UNAVAILABLE. `AVAILABLE`: Available. `UNAVAILABLE`: Not available.
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * Obtain Availability zone name. For example, ap-guangzhou-3
     * @return Zone Name of availability zone, e.g. ap-guangzhou-3
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set availability zone name. For example, ap-guangzhou-3
     * @param Zone Name of availability zone, e.g. ap-guangzhou-3
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Obtain availability zone description. For example, Guangzhou Zone 3
     * @return ZoneName Description of availability zone, e.g. ap-guangzhou-3
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set availability zone description. For example, Guangzhou Zone 3
     * @param ZoneName Availability zone description. For example, Guangzhou Zone 3
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Obtain ID of availability zone.
     * @return ZoneId ID of availability zone.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set availability zone.
     * @param ZoneId ID of availability zone.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Obtain availability zone status, including AVAILABLE and UNAVAILABLE. `AVAILABLE`: Available. `UNAVAILABLE`: Not available.
     * @return ZoneState Availability zone status, including AVAILABLE and UNAVAILABLE. `AVAILABLE`: Available. `UNAVAILABLE`: Not available.
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set availability zone status, including AVAILABLE and UNAVAILABLE. `AVAILABLE`: Available. `UNAVAILABLE`: Not available.
     * @param ZoneState Availability zone status, including AVAILABLE and UNAVAILABLE. `AVAILABLE`: Available. `UNAVAILABLE`: Not available.
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

