/*
 * Copyright (c) 2013, 2017, The University of Edinburgh. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */
package uk.ac.ed.accelerator.ocl.runtime;

public class ScopeTruffle implements Cloneable {

    private String globalType;
    private String type;
    private String name;

    public ScopeTruffle(String globalType, String name, String type) {
        this.globalType = globalType;
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getGlobalType() {
        return globalType;
    }

    public String getName() {
        return name;
    }

    public void updateName(@SuppressWarnings("hiding") String name) {
        this.name = name;
    }
}
