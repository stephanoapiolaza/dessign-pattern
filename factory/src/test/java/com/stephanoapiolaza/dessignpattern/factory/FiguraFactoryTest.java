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
package com.stephanoapiolaza.dessignpattern.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stephanoapiolaza.dessignpattern.factory.enumeration.FiguraTipoEnum;
import com.stephanoapiolaza.dessingpattern.factory.impl.Circulo;
import com.stephanoapiolaza.dessingpattern.factory.impl.Cuadrado;
import com.stephanoapiolaza.dessingpattern.factory.impl.Triangulo;

/**
 * Clase que permite validar el patron Factory
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm}
 * @category Patrones Creacionales
 * @version 1.0 - 21-01-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class FiguraFactoryTest {

    @Test
    public void getFigura_isCirculo() {
        assertEquals(new Circulo().getDibujo(), FiguraFactory.getFigura(FiguraTipoEnum.CIRCULO).getDibujo());
    }
    
    @Test
    public void getFigura_isCuadrado() {
        assertEquals(new Cuadrado().getDibujo(), FiguraFactory.getFigura(FiguraTipoEnum.CUADRADO).getDibujo());
    }
    
    @Test
    public void getFigura_isTriangulo() {
        assertEquals(new Triangulo().getDibujo(), FiguraFactory.getFigura(FiguraTipoEnum.TRIANGULO).getDibujo());
    }
    
}
