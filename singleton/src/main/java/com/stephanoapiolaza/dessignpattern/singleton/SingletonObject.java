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
package com.stephanoapiolaza.dessignpattern.singleton;

/**
 * Clase que representa el patron de disenno singleton
 * para crear instancias unicas por objeto, ayudando a su 
 * reutilizacion y optimizacion, ideal para realizar tareas
 * de cache
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm}
 * @category Patrones Creacionales - Objetos
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class SingletonObject {

    // Se crea una variable estatica, esto permite que los valores sean compartidos dentro de instancias de esta misma clase
    private static SingletonObject instance;
    private static final String[] DATA_CACHE = {"Cache 1", "Cache 2", "Cache 3"};
    
    /**
     * Se esconde el constructor, porque se debe llamar a getInstance() (sino no tendria sentido)
     */
    private SingletonObject() {}
    
    /**
     * Se crea una instancia unica para esta clase, esto permite reutilizacion
     * @return instancia unica de la clase
     */
    public static SingletonObject getInstance() {
        if ( null == instance ) {
            instance = new SingletonObject();
        }
        return instance;
    }
    
    /**
     * Metodo de prueba de patron singleton, muy util para clases de caching
     * @return datos en cache
     */
    public String[] getDataInCache() {
        return DATA_CACHE;
    }
    
}
