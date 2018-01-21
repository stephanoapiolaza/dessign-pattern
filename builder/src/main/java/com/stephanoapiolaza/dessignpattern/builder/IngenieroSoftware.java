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

import com.stephanoapiolaza.dessignpattern.builder.model.Producto;
import com.stephanoapiolaza.dessignpattern.builder.model.Software;

/**
 * Clase que representa el patron de disenno builder,
 * esto se utiliza para crear objetos complejos, 
 * permitiendo cambiar la representacion o los datos 
 * de cada objeto de manera sencilla
 * 
 * Este ejemplo se basara en la construccion de sistemas informaticos
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/builder_pattern.htm}
 * @category Patrones Creacionales - Objetos
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class IngenieroSoftware {

    private Producto productoSoftware;
    
    /**
     * Permite asignar una instancia de producto a  crear
     * @param producto a crear
     */
    public void setProducto(Producto producto) {
        this.productoSoftware = producto;
    }
    
    /**
     * Retorna el producto de software
     * @return instancia de producto de software con su representacion (datos)
     */
    public Software getProducto() {
        return productoSoftware.getSoftware();
    }
    
    /**
     * Crea un flujo de creacion de productos
     */
    public void crearProducto() {
        this.productoSoftware.newInstance();
        this.productoSoftware.setLenguaje();
        this.productoSoftware.setCantidadUsuarios();
    }
    
}
