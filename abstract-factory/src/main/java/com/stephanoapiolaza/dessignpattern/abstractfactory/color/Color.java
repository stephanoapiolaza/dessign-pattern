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
package com.stephanoapiolaza.dessignpattern.abstractfactory.color;

/**
 * Clase que representa el patron de disenno abstract factory
 * Interfaz de comunicacion con la Factoria, 
 * esto permite polimorfismo para que un objeto pueda mutar
 * si es que provienen de la misma jerarquia (opcional)
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm}
 * @category Patrones Creacionales - Clase
 * @version 1.0 - 30-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public interface Color {

    /**
     * Metodo heredado que permite obtener un texto del color al que pertenece
     */
    public String getColor();
    
}
