/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.screens.archetype.mgmt.shared.events;

import java.util.Objects;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.kie.workbench.common.screens.archetype.mgmt.shared.model.ArchetypeListOperation;
import org.uberfire.commons.clusterapi.Clustered;

import static org.kie.soup.commons.validation.PortablePreconditions.checkNotNull;

@Portable
@Clustered
public class ArchetypeListUpdatedEvent {

    private final ArchetypeListOperation operation;

    public ArchetypeListUpdatedEvent(@MapsTo("operation") final ArchetypeListOperation operation) {
        this.operation = checkNotNull("operation", operation);
    }

    public ArchetypeListOperation getOperation() {
        return operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArchetypeListUpdatedEvent that = (ArchetypeListUpdatedEvent) o;
        return operation == that.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation);
    }
}