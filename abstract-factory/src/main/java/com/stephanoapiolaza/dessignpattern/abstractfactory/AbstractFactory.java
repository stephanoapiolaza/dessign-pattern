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
package com.stephanoapiolaza.dessignpattern.abstractfactory;

import com.stephanoapiolaza.dessignpattern.abstractfactory.color.Color;
import com.stephanoapiolaza.dessignpattern.abstractfactory.color.ColorFactory;
import com.stephanoapiolaza.dessignpattern.abstractfactory.enumeration.ColorTipoEnum;
import com.stephanoapiolaza.dessignpattern.abstractfactory.enumeration.FiguraTipoEnum;
import com.stephanoapiolaza.dessignpattern.abstractfactory.shape.Figura;
import com.stephanoapiolaza.dessignpattern.abstractfactory.shape.FiguraFactory;

/**
 * Interfaz que representa el patron de disenno abstract factory
 * para crear instancias unicas por objeto, ayudando a su 
 * reutilizacion y optimizacion, ideal para realizar tareas
 * de cache
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm}
 * @category Patrones Creacionales - Clase
 * @version 1.0 - 30-04-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public abstract class AbstractFactory {

	/**
	 * Permite crear una instancia de tipo color
	 * @param color solicitado
	 * @return instancia solicitada
	 */
	public abstract Color getColor(ColorTipoEnum color);
	
	/**
	 * Permite crear una instancia de tipo figura
	 * @param shape solicitado
	 * @return instancia solicitada
	 */
	public abstract Figura getShape(FiguraTipoEnum shape);
	
	/**
	 * Permite crear factorias
	 * @param choice factoria a crear
	 * @return factoria solicitada
	 */
	public static AbstractFactory getFactory(String choice) {
		if ( choice.equals("SHAPE")) {
			return new FiguraFactory();
		} else if ( choice.equals("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
	
}
