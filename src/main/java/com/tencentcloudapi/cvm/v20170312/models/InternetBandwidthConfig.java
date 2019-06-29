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

public class InternetBandwidthConfig  extends AbstractModel{

    /**
    * Start time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Instance bandwidth information.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
     * Get start time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     * @return StartTime start time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set start time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     * @param StartTime start time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get end time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     * @return EndTime end time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set end time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     * @param EndTime end time.which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get instance bandwidth information.
     * @return InternetAccessible instance bandwidth information.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set instance bandwidth information.
     * @param InternetAccessible instance bandwidth information.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Internal implementation, reserved from use
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);

    }
}

