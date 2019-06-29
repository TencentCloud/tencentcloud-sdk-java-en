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

public class ItemPrice  extends AbstractModel{

    /**
    * Subsequent unit price (in CNY) Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * Subsequent billing unit. Value Range: <br><li>Scenarios using this billing unit include: postpaid by hour (POSTPAID_BY_HOUR) and postpaid by bandwidth on an hourly basis (BANDWIDTH_POSTPAID_BY_HOUR).<br><li>GB: The billing unit is calculated in GB. The scenario using this billing unit is: postpaid by traffic on an hourly basis (TRAFFIC_POSTPAID_BY_HOUR). Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ChargeUnit")
    @Expose
    private String ChargeUnit;

    /**
    * Original price of a prepaid instance (in CNY). Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount price of a prepaid instance (in CNY). Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get subsequent unit price (in CNY). Note: This field may return null, indicating that no valid value was found.
     * @return UnitPrice subsequent unit price (in CNY). Note: This field may return null, indicating that no valid value was found.
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set subsequent unit price (in CNY). Note: This field may return null, indicating that no valid value was found.
     * @param UnitPrice subsequent unit price (in CNY). Note: This field may return null, indicating that no valid value was found.
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get subsequent billing unit. Value Range: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: postpaid by hour (POSTPAID_BY_HOUR) and postpaid by bandwidth on an hourly basis (BANDWIDTH_POSTPAID_BY_HOUR).<br><li>GB: The billing unit is calculated in GB. The scenario using this billing unit is: postpaid by traffic on an hourly basis (TRAFFIC_POSTPAID_BY_HOUR). Note: This field may return null, indicating that no valid value was found.
     * @return ChargeUnit Subsequent billing unit. Value Range: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: postpaid by hour (POSTPAID_BY_HOUR) and postpaid by bandwidth on an hourly basis (BANDWIDTH_POSTPAID_BY_HOUR).<br><li>GB: The billing unit is calculated in GB.The scenario using this billing unit is: postpaid by traffic on an hourly basis (TRAFFIC_POSTPAID_BY_HOUR). Note: This field may return null, indicating that no valid value was found.
     */
    public String getChargeUnit() {
        return this.ChargeUnit;
    }

    /**
     *  Set subsequent billing unit. Value Range: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: postpaid by hour (POSTPAID_BY_HOUR) and postpaid by bandwidth on an hourly basis (BANDWIDTH_POSTPAID_BY_HOUR).<br><li>GB: The billing unit is calculated in GB. The scenario using this billing unit is: postpaid by traffic on an hourly basis (TRAFFIC_POSTPAID_BY_HOUR). Note: This field may return null, indicating that no valid value was found.
     * @param ChargeUnit subsequent billing unit. Value Range: <br><li>HOUR: bill by hour. Scenarios using this billing unit include: postpaid by hour (POSTPAID_BY_HOUR) and postpaid by bandwidth on an hourly basis (BANDWIDTH_POSTPAID_BY_HOUR).<br><li>GB: The billing unit is calculated in GB. The scenario using this billing unit is: postpaid by traffic on an hourly basis (TRAFFIC_POSTPAID_BY_HOUR). Note: This field may return null, indicating that no valid value was found.
     */
    public void setChargeUnit(String ChargeUnit) {
        this.ChargeUnit = ChargeUnit;
    }

    /**
     * Get original price of a prepaid instance (in CNY). Note: This field may return null, indicating that no valid value was found.
     * @return OriginalPrice Original price of prepaid fees (in CNY). | Note: This field may return null, indicating that no valid value was found.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set original price of a prepaid instance (in CNY). Note: This field may return null, indicating that no valid value was found.
     * @param OriginalPrice Original price of prepaid fees (in CNY). | Note: This field may return null, indicating that no valid value was found.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get discount price of a prepaid instance (in CNY). Note: This field may return null, indicating that no valid value was found.
     * @return DiscountPrice Discount price of prepaid fees (in CNY). | Note: This field may return null, indicating that no valid value was found.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set discount price of a prepaid instance (in CNY). Note: This field may return null, indicating that no valid value was found.
     * @param DiscountPrice Discount price of prepaid fees (in CNY). | Note: This field may return null, indicating that no valid value was found.
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "ChargeUnit", this.ChargeUnit);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

