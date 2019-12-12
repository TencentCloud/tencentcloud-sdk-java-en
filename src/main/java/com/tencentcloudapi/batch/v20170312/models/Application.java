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

public class Application  extends AbstractModel{

    /**
    * Task execution command
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Delivery form of the application. Value range: PACKAGE, LOCAL, which refer to remotely stored software package and local compute environment, respectively.
    */
    @SerializedName("DeliveryForm")
    @Expose
    private String DeliveryForm;

    /**
    * Remote storage path of the application package
    */
    @SerializedName("PackagePath")
    @Expose
    private String PackagePath;

    /**
    * Relevant configuration of the Docker used by the application. In case that the Docker configuration is used, "LOCAL" DeliveryForm means that the application software inside the Docker image is used directly and run in Docker mode; "PACKAGE" DeliveryForm means that the remote application package is run in Docker mode after being injected into the Docker image. To avoid compatibility issues with different versions of Docker, the Docker installation package and relevant dependencies are taken care of by BatchCompute. For custom images where Docker has already been installed, uninstall Docker first and then use the Docker feature.
    */
    @SerializedName("Docker")
    @Expose
    private Docker Docker;

    /**
     * Get Task execution command 
     * @return Command Task execution command
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Task execution command
     * @param Command Task execution command
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Delivery form of the application. Value range: PACKAGE, LOCAL, which refer to remotely stored software package and local compute environment, respectively. 
     * @return DeliveryForm Delivery form of the application. Value range: PACKAGE, LOCAL, which refer to remotely stored software package and local compute environment, respectively.
     */
    public String getDeliveryForm() {
        return this.DeliveryForm;
    }

    /**
     * Set Delivery form of the application. Value range: PACKAGE, LOCAL, which refer to remotely stored software package and local compute environment, respectively.
     * @param DeliveryForm Delivery form of the application. Value range: PACKAGE, LOCAL, which refer to remotely stored software package and local compute environment, respectively.
     */
    public void setDeliveryForm(String DeliveryForm) {
        this.DeliveryForm = DeliveryForm;
    }

    /**
     * Get Remote storage path of the application package 
     * @return PackagePath Remote storage path of the application package
     */
    public String getPackagePath() {
        return this.PackagePath;
    }

    /**
     * Set Remote storage path of the application package
     * @param PackagePath Remote storage path of the application package
     */
    public void setPackagePath(String PackagePath) {
        this.PackagePath = PackagePath;
    }

    /**
     * Get Relevant configuration of the Docker used by the application. In case that the Docker configuration is used, "LOCAL" DeliveryForm means that the application software inside the Docker image is used directly and run in Docker mode; "PACKAGE" DeliveryForm means that the remote application package is run in Docker mode after being injected into the Docker image. To avoid compatibility issues with different versions of Docker, the Docker installation package and relevant dependencies are taken care of by BatchCompute. For custom images where Docker has already been installed, uninstall Docker first and then use the Docker feature. 
     * @return Docker Relevant configuration of the Docker used by the application. In case that the Docker configuration is used, "LOCAL" DeliveryForm means that the application software inside the Docker image is used directly and run in Docker mode; "PACKAGE" DeliveryForm means that the remote application package is run in Docker mode after being injected into the Docker image. To avoid compatibility issues with different versions of Docker, the Docker installation package and relevant dependencies are taken care of by BatchCompute. For custom images where Docker has already been installed, uninstall Docker first and then use the Docker feature.
     */
    public Docker getDocker() {
        return this.Docker;
    }

    /**
     * Set Relevant configuration of the Docker used by the application. In case that the Docker configuration is used, "LOCAL" DeliveryForm means that the application software inside the Docker image is used directly and run in Docker mode; "PACKAGE" DeliveryForm means that the remote application package is run in Docker mode after being injected into the Docker image. To avoid compatibility issues with different versions of Docker, the Docker installation package and relevant dependencies are taken care of by BatchCompute. For custom images where Docker has already been installed, uninstall Docker first and then use the Docker feature.
     * @param Docker Relevant configuration of the Docker used by the application. In case that the Docker configuration is used, "LOCAL" DeliveryForm means that the application software inside the Docker image is used directly and run in Docker mode; "PACKAGE" DeliveryForm means that the remote application package is run in Docker mode after being injected into the Docker image. To avoid compatibility issues with different versions of Docker, the Docker installation package and relevant dependencies are taken care of by BatchCompute. For custom images where Docker has already been installed, uninstall Docker first and then use the Docker feature.
     */
    public void setDocker(Docker Docker) {
        this.Docker = Docker;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "DeliveryForm", this.DeliveryForm);
        this.setParamSimple(map, prefix + "PackagePath", this.PackagePath);
        this.setParamObj(map, prefix + "Docker.", this.Docker);

    }
}

