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
package com.stephanoapiolaza.dessignpattern.builder.model;

import com.stephanoapiolaza.dessignpattern.builder.constants.ConstantsBuilder;

/**
 * Clase que representa el patron de disenno builder,
 * Modelo que define la representacion o datos del 
 * producto de software musical llamado Spotify
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/builder_pattern.htm}
 * @category Patrones Creacionales - Objetos
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class Spotify extends Producto{

    @Override
    public void setLenguaje() {
        super.software.lenguaje(ConstantsBuilder.LENGUAJE_SPOTIFY);
    }

    @Override
    public void setCantidadUsuarios() {
        super.software.cantidadUsuarios(ConstantsBuilder.CANT_USER_SPOTIFY);
    }
    
}
