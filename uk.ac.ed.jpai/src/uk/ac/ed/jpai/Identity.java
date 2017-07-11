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

package uk.ac.ed.jpai;

import uk.ac.ed.datastructures.common.PArray;
import uk.ac.ed.datastructures.common.PArray.StorageMode;
import uk.ac.ed.datastructures.common.TypeFactory;

public class Identity<T> extends ArrayFunction<T, T> {

    @Override
    public PArray<T> apply(PArray<T> input) {
        if (!preparedExecutionFinish) {
            prepareExecution(input);
        }
        return input;
    }

    @Override
    public PArray<T> prepareExecution(PArray<T> input) {
        PArray<T> out = inferTypes(input);
        preparedExecutionFinish = true;
        return out;
    }

    @Override
    public PArray<T> inferTypes(PArray<T> input) {
        inputType = TypeFactory.inferFromObject(input.get(0));
        outputType = inputType;
        return input;
    }

    @Override
    public void setOutput(PArray<T> output) {
        // Empty implementation
    }

    @Override
    public PArray<T> allocateOutputArray(int size, StorageMode mode) {
        return null;
    }

    @Override
    public boolean isInCache() {
        return false;
    }
}
