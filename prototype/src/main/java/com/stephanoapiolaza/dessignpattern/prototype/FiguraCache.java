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

import java.util.HashMap;
import java.util.Map;

import com.stephanoapiolaza.dessignpattern.prototype.constants.ConstantsPrototype;
import com.stephanoapiolaza.dessingpattern.prototype.impl.Circulo;
import com.stephanoapiolaza.dessingpattern.prototype.impl.Cuadrado;
import com.stephanoapiolaza.dessingpattern.prototype.impl.Triangulo;

/**
 * Clase que representa el patron de disenno prototype
 * director para manipulacion de cache, retornando objetos inmutables
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm}
 * @category Patrones Creacionales - Objeto
 * @version 1.0 - 27-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class FiguraCache {

    private static Map<String, Figura> figuraMap = new HashMap<>();
    /**
     * Constructor Privado
     */
    private FiguraCache() {
        
    }
    
    /**
     * Retorna una figura de acuerdo al identificador solicitado
     * @param key identificador
     * @return figura solicitada
     */
    public static Figura getFigura(String key) {
        Figura figura = figuraMap.get(key);
        return (Figura) figura.clone();
    }
    
    /**
     * Metodo que simula llamadas a la base de datos para llenado
     */
    public static void loadCache() {
        doCircle();
        doSquare();
        doTriangle();
    }
    
    /**
     * Permite insertar un elemento en el mapa sincronizado
     * @param id key
     * @param obj value
     */
    private static void insertElement(String id, Figura obj) {
        figuraMap.put(id, obj);
    }
    
    /**
     * Inserta un elemento de tipo figura
     * @param obj de tipo figura
     */
    private static void insertFigura(Figura obj) {
        insertElement(obj.getId(), obj);
    }
    
    /**
     * Permite insertar un circulo
     */
    private static void doCircle() {
        Figura figura = new Circulo();
        figura.setId(ConstantsPrototype.ID_CIRCLE);
        insertFigura(figura);
    }
    
    /**
     * Permite insertar un cuadrado
     */
    private static void doSquare() {
        Figura figura = new Cuadrado();
        figura.setId(ConstantsPrototype.ID_SQUARE);
        insertElement(figura.getId(), figura);
    }
    
    /**
     * Permite insertar un triangulo
     */
    private static void doTriangle() {
        Figura figura = new Triangulo();
        figura.setId(ConstantsPrototype.ID_TRIANGLE);
        insertElement(figura.getId(), figura);
    }
    
}
