// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContainerGroupIpAddressType. */
public final class ContainerGroupIpAddressType extends ExpandableStringEnum<ContainerGroupIpAddressType> {
    /** Static value Public for ContainerGroupIpAddressType. */
    public static final ContainerGroupIpAddressType PUBLIC = fromString("Public");

    /** Static value Private for ContainerGroupIpAddressType. */
    public static final ContainerGroupIpAddressType PRIVATE = fromString("Private");

    /**
     * Creates or finds a ContainerGroupIpAddressType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerGroupIpAddressType.
     */
    @JsonCreator
    public static ContainerGroupIpAddressType fromString(String name) {
        return fromString(name, ContainerGroupIpAddressType.class);
    }

    /** @return known ContainerGroupIpAddressType values. */
    public static Collection<ContainerGroupIpAddressType> values() {
        return values(ContainerGroupIpAddressType.class);
    }
}
