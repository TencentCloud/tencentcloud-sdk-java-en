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

public class LocalDiskType  extends AbstractModel{

    /**
    * Type of a local disk.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Attributes of a local disk.
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * Minimum size of a local disk.
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * Maximum size of a local disk.
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
     * Get type of a local disk.
     * @return Type type of a local disk.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set type of a local disk.
     * @param Type type of a local disk.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get attributes of a local disk.
     * @return PartitionType Attributes of a local disk.
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set attributes of a local disk.
     * @param PartitionType Attributes of a local disk.
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get minimum size of a local disk.
     * @return MinSize minimum size of a local disk.
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set minimum size of a local disk.
     * @param MinSize minimum size of a local disk.
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get maximum size of a local disk.
     * @return MaxSize maximum size of a local disk.
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * maximum size of a local disk.
     * @param MaxSize maximum size of a local disk.
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

