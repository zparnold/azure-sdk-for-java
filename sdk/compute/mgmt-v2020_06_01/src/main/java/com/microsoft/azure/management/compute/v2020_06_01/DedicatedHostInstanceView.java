/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a dedicated host.
 */
public class DedicatedHostInstanceView {
    /**
     * Specifies the unique id of the dedicated physical machine on which the
     * dedicated host resides.
     */
    @JsonProperty(value = "assetId", access = JsonProperty.Access.WRITE_ONLY)
    private String assetId;

    /**
     * Unutilized capacity of the dedicated host.
     */
    @JsonProperty(value = "availableCapacity")
    private DedicatedHostAvailableCapacity availableCapacity;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     *
     * @return the assetId value
     */
    public String assetId() {
        return this.assetId;
    }

    /**
     * Get unutilized capacity of the dedicated host.
     *
     * @return the availableCapacity value
     */
    public DedicatedHostAvailableCapacity availableCapacity() {
        return this.availableCapacity;
    }

    /**
     * Set unutilized capacity of the dedicated host.
     *
     * @param availableCapacity the availableCapacity value to set
     * @return the DedicatedHostInstanceView object itself.
     */
    public DedicatedHostInstanceView withAvailableCapacity(DedicatedHostAvailableCapacity availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * Get the resource status information.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the resource status information.
     *
     * @param statuses the statuses value to set
     * @return the DedicatedHostInstanceView object itself.
     */
    public DedicatedHostInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}
