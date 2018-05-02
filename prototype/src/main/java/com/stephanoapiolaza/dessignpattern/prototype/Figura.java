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
package com.stephanoapiolaza.dessignpattern.prototype;

/**
 * Clase que representa el patron de disenno prototype
 * Interfaz de comunicacion con Cloneable, 
 * este se utiliza para indicar que la clase puede ser clonada,
 * retornando un objeto inmutable
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm}
 * @category Patrones Creacionales - Objeto
 * @version 1.0 - 27-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public abstract class Figura implements Cloneable{

    private String id;
    
    /**
     * Metodo heredado que permite obtener un texto de la figura geometrica a que pertenece
     */
    public abstract String getDibujo();
    
    /**
     * Permite clonar un objeto para aplicar patron prototype
     * @return objeto inmutable
     */
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * Get id element
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Set id element
     * @param id element
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
