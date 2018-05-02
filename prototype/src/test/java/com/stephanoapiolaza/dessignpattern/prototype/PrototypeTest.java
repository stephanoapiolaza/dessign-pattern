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

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stephanoapiolaza.dessignpattern.prototype.constants.ConstantsPrototype;
import com.stephanoapiolaza.dessingpattern.prototype.impl.Circulo;
import com.stephanoapiolaza.dessingpattern.prototype.impl.Cuadrado;
import com.stephanoapiolaza.dessingpattern.prototype.impl.Triangulo;

/**
 * Clase que permite validar el patron prototype
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm -}
 * @category Patrones Creacionales - Objeto
 * @version 1.0 - 27-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class PrototypeTest {

    @Before
    public void setup() {
        FiguraCache.loadCache();
    }
    
    @Test
    public void getFigura_isCirculo() {
        assertEquals(new Circulo().getDibujo(), FiguraCache.getFigura(ConstantsPrototype.ID_CIRCLE).getDibujo());
    }
    
    @Test
    public void getFigura_isCuadrado() {
        assertEquals(new Cuadrado().getDibujo(), FiguraCache.getFigura(ConstantsPrototype.ID_SQUARE).getDibujo());
    }
    
    @Test
    public void getFigura_isTriangulo() {
        assertEquals(new Triangulo().getDibujo(), FiguraCache.getFigura(ConstantsPrototype.ID_TRIANGLE).getDibujo());
    }
    
}
