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
package com.stephanoapiolaza.dessignpattern.abstractfactory.shape;

import com.stephanoapiolaza.dessignpattern.abstractfactory.AbstractFactory;
import com.stephanoapiolaza.dessignpattern.abstractfactory.color.Color;
import com.stephanoapiolaza.dessignpattern.abstractfactory.enumeration.ColorTipoEnum;
import com.stephanoapiolaza.dessignpattern.abstractfactory.enumeration.FiguraTipoEnum;
import com.stephanoapiolaza.dessignpattern.abstractfactory.shape.Figura;
import com.stephanoapiolaza.dessingpattern.abstractfactory.shape.impl.Circulo;
import com.stephanoapiolaza.dessingpattern.abstractfactory.shape.impl.Cuadrado;
import com.stephanoapiolaza.dessingpattern.abstractfactory.shape.impl.Triangulo;

/**
 * Clase que representa el patron de disenno abstract factory
 * para crear instancias unicas por objeto, ayudando a su 
 * reutilizacion y optimizacion, ideal para realizar tareas
 * de cache
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htms}
 * @category Patrones Creacionales - Clase
 * @version 1.0 - 30-04-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class FiguraFactory extends AbstractFactory {
    
    /**
     * Retorna un color disponible
     * @param color solicitado
     * @return null, porque este factory solo es para crear figuras
     */
	@Override
	public Color getColor(ColorTipoEnum color) {
		return null;
	}

	 /**
     * Retorna un tipo de figura disponible
     * @param tipoFigura enum con los tipos de figura disponibilizados
     * @return tipo de figura solicitada
     */
	@Override
	public Figura getShape(FiguraTipoEnum shape) {
		if ( null == shape ) {
            return null;
        }
        if ( shape.equals(FiguraTipoEnum.CIRCULO) ) {
            return new Circulo();
        } else if ( shape.equals(FiguraTipoEnum.CUADRADO) ) {
            return new Cuadrado();
        } else if ( shape.equals(FiguraTipoEnum.TRIANGULO) ) {
            return new Triangulo();
        }
        return null;
	}
    
}
