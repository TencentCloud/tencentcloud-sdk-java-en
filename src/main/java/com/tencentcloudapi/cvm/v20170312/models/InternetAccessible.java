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

public class InternetAccessible  extends AbstractModel{

    /**
    * Network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: non-bandwidth package user’s billing type is defaulted same as the sub-machine.
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * The maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](/document/product/213/509)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Integer InternetMaxBandwidthOut;

    /**
    * Whether to assign public IP. Value range:<br><li>TRUE：Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned.
    */
    @SerializedName("PublicIpAssigned")
    @Expose
    private Boolean PublicIpAssigned;

    /**
    * IDs of bandwidth package, which can be obtained from [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) in the returned value of API `BandwidthPackageId`.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Obtain the network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: 
     * @return InternetChargeType Network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: non-bandwidth package user’s billing type is defaulted same as the sub-machine.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Configure the network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: non-bandwidth package user’s billing type is defaulted same as the sub-machine.
     * @param InternetChargeType Network billing type. Value range:<br><li>BANDWIDTH_PREPAID：Prepaid by bandwidth.<br><li>TRAFFIC_POSTPAID_BY_HOUR：Postpaid by traffic on an hourly basis.<br><li>BANDWIDTH_POSTPAID_BY_HOUR：Postpaid by bandwidth on an hourly basis.<br><li>BANDWIDTH_PACKAGE：Bandwidth package users.<br>Default: non-bandwidth package user’s billing type is defaulted same as the sub-machine.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Obtain the maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](/document/product/213/509).
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](/document/product/213/509).
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Configure the maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](/document/product/213/509).
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the public network (in Mbps). Default is 0 Mbps. The upper limit of bandwidth varies with different models. For more information, see [Purchase Network Bandwidth](/document/product/213/509).
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Obtain whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned.
     * @return PublicIpAssigned Whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned.
     */
    public Boolean getPublicIpAssigned() {
        return this.PublicIpAssigned;
    }

    /**
     * Configure whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned.
     * @param PublicIpAssigned Whether to assign public IP. Value range:<br><li>TRUE: Assign public IP.<br><li>FALSE: Not assign public IP.<br><br>If the public network bandwidth is greater than 0 Mbps, you're free to choose whether to enable the public IP (which is enabled by default). If the public network bandwidth is 0 Mbps, the public IP is not assigned.
     */
    public void setPublicIpAssigned(Boolean PublicIpAssigned) {
        this.PublicIpAssigned = PublicIpAssigned;
    }

    /**
     * Obtain IDs of bandwidth package, which can be obtained from [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) in the returned value of API `BandwidthPackageId`.
     * @return BandwidthPackageId IDs of bandwidth package, which can be obtained from [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) in the returned value of API `BandwidthPackageId`.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set IDs of bandwidth package, which can be obtained from [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) in the returned value of API `BandwidthPackageId`.
     * @param BandwidthPackageId  IDs of bandwidth package, which can be obtained from [`DescribeBandwidthPackages`](https://cloud.tencent.com/document/api/215/19209) in the returned value of API `BandwidthPackageId`.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAssigned", this.PublicIpAssigned);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}

