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
 * Modelo POJO con el modelo a realizar, con metodos
 * con los nombres de los atributos para una facil creacion, evitando
 * constructores con multiples parametros
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/builder_pattern.htm}
 * @category Patrones Creacionales - Objetos
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class Software {

    private String lenguaje;
    private int cantidadUsuarios;
    
    /**
     * Permite cambiar el atributo lenguaje
     * @param lenguaje a modificar
     * @return Instancia de la clase
     */
    public Software lenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }
    
    /**
     * Permite cambiar el atributo cantidadUsuarios
     * @param cantidadUsuarios a modificar
     * @return Instancia de la clase
     */
    public Software cantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios = cantidadUsuarios;
        return this;
    }

    /**
     * Getter
     * @return lenguaje
     */
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * Getter
     * @return cantidad usuarios
     */
    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }
    
}
