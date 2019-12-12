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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputMappingConfig  extends AbstractModel{

    /**
    * Storage type. Only COS is supported
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * Number of parallel workers
    */
    @SerializedName("WorkerNum")
    @Expose
    private Long WorkerNum;

    /**
    * Size of a worker part, in MB.
    */
    @SerializedName("WorkerPartSize")
    @Expose
    private Long WorkerPartSize;

    /**
     * Get Storage type. Only COS is supported 
     * @return Scene Storage type. Only COS is supported
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Storage type. Only COS is supported
     * @param Scene Storage type. Only COS is supported
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get Number of parallel workers 
     * @return WorkerNum Number of parallel workers
     */
    public Long getWorkerNum() {
        return this.WorkerNum;
    }

    /**
     * Set Number of parallel workers
     * @param WorkerNum Number of parallel workers
     */
    public void setWorkerNum(Long WorkerNum) {
        this.WorkerNum = WorkerNum;
    }

    /**
     * Get Size of a worker part, in MB. 
     * @return WorkerPartSize Size of a worker part, in MB.
     */
    public Long getWorkerPartSize() {
        return this.WorkerPartSize;
    }

    /**
     * Set Size of a worker part, in MB.
     * @param WorkerPartSize Size of a worker part, in MB.
     */
    public void setWorkerPartSize(Long WorkerPartSize) {
        this.WorkerPartSize = WorkerPartSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "WorkerNum", this.WorkerNum);
        this.setParamSimple(map, prefix + "WorkerPartSize", this.WorkerPartSize);

    }
}

