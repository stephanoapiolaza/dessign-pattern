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
package com.stephanoapiolaza.dessignpattern.adapter;

import com.stephanoapiolaza.dessignpattern.adapter.constants.ConstantsUtil;
import com.stephanoapiolaza.dessignpattern.adapter.enumeration.MediaPlayerEnum;

/**
 * Interfaz que representa el patron de disenno adapter
 * 
 * @see {@link https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm}
 * @category Patrones Estructural - Objetos
 * @version 1.0 - 02-05-18
 * @author Stephano.Apiolaza - stephanoapiolaza@gmail.com
 *
 */
public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;
	
	/**
	 * Allow reproduce a song or video
	 * @param audioType can be audio or video
	 * @param fileName to play
	 */
	public void play(MediaPlayerEnum audioType, String fileName) {
		if ( audioType.equals(MediaPlayerEnum.MP3) ) {
			System.out.println(ConstantsUtil.OUTPUT_AUDIO.concat(fileName));
		} else if ( audioType.equals(MediaPlayerEnum.MP4) ){
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println(ConstantsUtil.OUTPUT_NOT_AUDIO);
		}
	}
	
}
