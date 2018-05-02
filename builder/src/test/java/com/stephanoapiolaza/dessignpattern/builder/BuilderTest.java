/*
 * MIT License
 *
 * Copyright (c) [2018] [Stephano Apiolaza]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.stephanoapiolaza.dessignpattern.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stephanoapiolaza.dessignpattern.builder.constants.ConstantsBuilder;
import com.stephanoapiolaza.dessignpattern.builder.model.Netflix;
import com.stephanoapiolaza.dessignpattern.builder.model.Software;
import com.stephanoapiolaza.dessignpattern.builder.model.Spotify;

/**
 * Permite validar el patron builder
 * 
 * Este ejemplo se basara en la construccion de sistemas informaticos
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/builder_pattern.htm}
 * @category Patrones Creacionales - Objetos
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class BuilderTest {
    
    private IngenieroSoftware ingeniero;
    
    @Before
    public void setup() {
        // se llama al director o ingeniero
        ingeniero = new IngenieroSoftware();
    }
    
    @Test
    public void getSoftware_isSpotify() {
        // se le asigna un producto a crear
        ingeniero.setProducto(new Spotify());
        ingeniero.crearProducto();
        Software software = ingeniero.getProducto();
        assertEquals(ConstantsBuilder.LENGUAJE_SPOTIFY, software.getLenguaje());
    }
    
    @Test
    public void getSoftware_isNetflix() {
        // se le asigna un producto a crear
        ingeniero.setProducto(new Netflix());
        ingeniero.crearProducto();
        Software software = ingeniero.getProducto();
        assertEquals(ConstantsBuilder.LENGUAJE_NETFLIX, software.getLenguaje());
    }
    
}
