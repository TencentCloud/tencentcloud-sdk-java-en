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

public class InternetAccessible  extends AbstractModel{

    /**
    * Network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: TRAFFIC_POSTPAID_BY_HOUR. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/17156). Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Integer InternetMaxBandwidthOut;

    /**
    * Whether to assign public IP. Value range:<br><li>TRUE：Assign public IP.<br><li>FALSE: Do not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
     * Obtain the network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: TRAFFIC_POSTPAID_BY_HOUR. Note: This field may return null, indicating that no valid value was found.
     * @return InternetChargeType Network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: TRAFFIC_POSTPAID_BY_HOUR. Note: This field may return null, indicating that no valid value was found.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Configure the network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: TRAFFIC_POSTPAID_BY_HOUR. Note: This field may return null, indicating that no valid value was found.
     * @param InternetChargeType Network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: TRAFFIC_POSTPAID_BY_HOUR. Note: This field may return null, indicating that no valid value was found.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Obtain the maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/17156). Note: This field may return null, indicating that no valid value was found.
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/17156). Note: This field may return null, indicating that no valid value was found.
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Configure the maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/17156). Note: This field may return null, indicating that no valid value was found.
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](https://intl.cloud.tencent.com/document/product/213/17156). Note: This field may return null, indicating that no valid value was found.
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Obtain whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned. Note: This field may return null, indicating that no valid value was found.
     * @return PublicIpAssigned Whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned. Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Configure whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned. Note: This field may return null, indicating that no valid value was found.
     * @param PublicIpAssigned Whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned. Note: This field may return null, indicating that no valid value was found.
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);

    }
}

