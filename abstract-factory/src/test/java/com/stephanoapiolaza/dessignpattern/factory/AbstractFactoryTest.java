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

import com.stephanoapiolaza.dessignpattern.abstractfactory.AbstractFactory;
import com.stephanoapiolaza.dessignpattern.abstractfactory.enumeration.ColorTipoEnum;
import com.stephanoapiolaza.dessignpattern.abstractfactory.enumeration.FiguraTipoEnum;
import com.stephanoapiolaza.dessingpattern.abstractfactory.color.impl.Azul;
import com.stephanoapiolaza.dessingpattern.abstractfactory.shape.impl.Cuadrado;

/**
 * Clase que permite validar el patron Abstract Factory
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm}
 * @category Patrones Creacionales
 * @version 1.0 - 30-04-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class AbstractFactoryTest {

    @Test
    public void getColor_isAzul() {
    	AbstractFactory factories = AbstractFactory.getFactory("COLOR");
        assertEquals(new Azul().getColor(), factories.getColor(ColorTipoEnum.AZUL).getColor());
    }
    
    @Test
    public void getFigura_isCuadrado() {
    	AbstractFactory factories = AbstractFactory.getFactory("SHAPE");
        assertEquals(new Cuadrado().getDibujo(), factories.getShape(FiguraTipoEnum.CUADRADO).getDibujo());
    }
    
}
