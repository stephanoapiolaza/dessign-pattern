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

/**
 * Clase que representa el patron de disenno builder,
 * Abstracta para la representacion de productos de software, 
 * es decir, que se venden bajo licenciamiento
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/builder_pattern.htm}
 * @category Patrones Creacionales - Objetos
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public abstract class Producto {

    protected Software software;
    
    /**
     * Retorna la instancia de software
     * @return instancia de software
     */
    public Software getSoftware() {
        return software;
    }
    
    /**
     * Crea una instancia manual de software
     */
    public void newInstance() {
        this.software = new Software();
    }
    
    /**
     * Define un lenguaje de programacion del software
     */
    public abstract void setLenguaje();
    
    /**
     * Define la cantidad de usuarios que soporta el software
     */
    public abstract void setCantidadUsuarios();
    
}
