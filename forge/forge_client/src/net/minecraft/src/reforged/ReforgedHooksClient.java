/**
 * This software is provided under the terms of the Minecraft Forge Public 
 * License v1.0.
 */
package net.minecraft.src.reforged;

import java.util.LinkedList;
import net.minecraft.src.RenderGlobal;

public class ReforgedHooksClient {

	public static LinkedList<IRenderWorldLastHandler> renderWorldLastHandlers =
		new LinkedList<IRenderWorldLastHandler>();
	
	public static void onRenderWorldLast(RenderGlobal rg, float f) {
		for (IRenderWorldLastHandler handler : renderWorldLastHandlers) {
			handler.onRenderWorldLast(rg,f);
		}
	}
	
}
