package com.coeninator.earthbattlestaffcurrencyconverter;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EarthBattlestaffCurrencyConverterPluginTest {
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(EarthBattlestaffCurrencyConverterPlugin.class);
		RuneLite.main(args);
	}
}