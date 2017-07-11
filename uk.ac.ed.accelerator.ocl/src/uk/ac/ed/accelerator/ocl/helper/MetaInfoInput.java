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

package uk.ac.ed.accelerator.ocl.helper;

/**
 * Class utility for tracking the objects and input sizes (lambda expression).
 *
 */
public class MetaInfoInput {

    private Object[] object;
    int[] sizes;
    private boolean[] is1D;
    private boolean[] flatten;

    /**
     *
     * @param object
     * @param sizes
     * @param is1D
     */
    public MetaInfoInput(Object[] object, int[] sizes, boolean[] is1D, boolean[] flatten) {
        super();
        this.object = object;
        this.sizes = sizes;
        this.is1D = is1D;
        this.flatten = flatten;
    }

    /**
     *
     * @return Object[]
     */
    public Object[] getObject() {
        return object;
    }

    /**
     *
     * @return int[]
     */
    public int[] getSizes() {
        return sizes;
    }

    /**
     *
     * @return boolean[]
     */
    public boolean[] getIs1D() {
        return is1D;
    }

    /**
     *
     * @return boolan[]
     */
    public boolean[] getFlatten() {
        return flatten;
    }
}
