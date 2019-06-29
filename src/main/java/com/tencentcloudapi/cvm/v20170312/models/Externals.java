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

public class Externals  extends AbstractModel{

    /**
    * Release addressNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ReleaseAddress")
    @Expose
    private Boolean ReleaseAddress;

    /**
    * Network types that are not supportedNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnsupportNetworks")
    @Expose
    private String [] UnsupportNetworks;

    /**
    * Attributes of local HDD storageNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("StorageBlockAttr")
    @Expose
    private StorageBlock StorageBlockAttr;

    /**
     * Get release addressNote: This field may return null, indicating that no valid value was found.
     * @return ReleaseAddress Release addressNote: This field may return null, indicating that no valid value was found.
     */
    public Boolean getReleaseAddress() {
        return this.ReleaseAddress;
    }

    /**
     * Set release addressNote: This field may return null, indicating that no valid value was found.
     * @param ReleaseAddress Release addressNote: This field may return null, indicating that no valid value was found.
     */
    public void setReleaseAddress(Boolean ReleaseAddress) {
        this.ReleaseAddress = ReleaseAddress;
    }

    /**
     * Get network types that are not supportedNote: This field may return null, indicating that no valid value was found.
     * @return UnsupportNetworks Network types that are not supportedNote: This field may return null, indicating that no valid value was found.
     */
    public String [] getUnsupportNetworks() {
        return this.UnsupportNetworks;
    }

    /**
     * Set network types that are not supportedNote: This field may return null, indicating that no valid value was found.
     * @param UnsupportNetworks Network types that are not supportedNote: This field may return null, indicating that no valid value was found.
     */
    public void setUnsupportNetworks(String [] UnsupportNetworks) {
        this.UnsupportNetworks = UnsupportNetworks;
    }

    /**
     * Get attributes of local HDD storageNote: This field may return null, indicating that no valid value was found.
     * @return StorageBlockAttr Attributes of local HDD storageNote: This field may return null, indicating that no valid value was found.
     */
    public StorageBlock getStorageBlockAttr() {
        return this.StorageBlockAttr;
    }

    /**
     * Set attributes of local HDD storageNote: This field may return null, indicating that no valid value was found.
     * @param StorageBlockAttr Attributes of local HDD storageNote: This field may return null, indicating that no valid value was found.
     */
    public void setStorageBlockAttr(StorageBlock StorageBlockAttr) {
        this.StorageBlockAttr = StorageBlockAttr;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseAddress", this.ReleaseAddress);
        this.setParamArraySimple(map, prefix + "UnsupportNetworks.", this.UnsupportNetworks);
        this.setParamObj(map, prefix + "StorageBlockAttr.", this.StorageBlockAttr);

    }
}

