package net.herrobriam.nomoredeepslate;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoMoreDeepslate implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("no-more-deepslate");

	@Override
	public void onInitialize() {
		LOGGER.info("Removing deepslate...");
	}
}