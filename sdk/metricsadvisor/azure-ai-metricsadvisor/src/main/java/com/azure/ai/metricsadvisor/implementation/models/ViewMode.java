// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ViewMode. */
public final class ViewMode extends ExpandableStringEnum<ViewMode> {
    /** Static value Private for ViewMode. */
    public static final ViewMode PRIVATE = fromString("Private");

    /** Static value Public for ViewMode. */
    public static final ViewMode PUBLIC = fromString("Public");

    /**
     * Creates or finds a ViewMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ViewMode.
     */
    @JsonCreator
    public static ViewMode fromString(String name) {
        return fromString(name, ViewMode.class);
    }

    /** @return known ViewMode values. */
    public static Collection<ViewMode> values() {
        return values(ViewMode.class);
    }
}
