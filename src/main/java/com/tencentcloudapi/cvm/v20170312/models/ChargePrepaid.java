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

public class ChargePrepaid  extends AbstractModel{

    /**
    * Purchased instance usage period, unit (month). Value range: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * Auto renewal tag. Values:<br><li>NOTIFY_AND_AUTO_RENEW: notify and auto renew<br><li>NOTIFY_AND_AUTO_RENEW: notify and manually renew<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Disable notify and manual renew<br><br>Default: NOTIFY_AND_AUTO_RENEW. the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get purchased instance usage period, unit (month). Value range: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     * @return Period Purchased instance usage period, unit (month). Value range: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * Set purchased instance usage period, unit (month). Value range: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     * @param Period Purchased instance usage period, unit (month). Value range: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36]
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * Get auto renewal tag. Values:<br><li>NOTIFY_AND_AUTO_RENEW: notify and auto renew<br><li>NOTIFY_AND_AUTO_RENEW: notify and manually renew<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Disable notify and manual renew<br><br>Default: NOTIFY_AND_AUTO_RENEW. the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     * @return RenewFlag Auto renewal tag. Values:<br><li>NOTIFY_AND_AUTO_RENEW: notify and auto renew<br><li>NOTIFY_AND_AUTO_RENEW: notify and manually renew<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Disable notify and manual renew<br><br>Default: NOTIFY_AND_AUTO_RENEW. the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set auto renewal tag. Values:<br><li>NOTIFY_AND_AUTO_RENEW: notify and auto renew<br><li>NOTIFY_AND_AUTO_RENEW: notify and manually renew<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Disable notify and manual renew<br><br>Default: NOTIFY_AND_AUTO_RENEW. the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     * @param RenewFlag Auto renewal tag. Values:<br><li>NOTIFY_AND_AUTO_RENEW: notify and auto renew<br><li>NOTIFY_AND_AUTO_RENEW: notify and manually renew<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Disable notify and manual renew<br><br>Default: NOTIFY_AND_AUTO_RENEW. the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

