package paulevs.bhcreative;

import net.bhapi.util.Identifier;
import net.minecraft.entity.player.PlayerBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import paulevs.bhcreative.interfaces.CreativePlayer;

public class Creative {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "bhcreative";
	
	/**
	 * Will return creative tab {@link Identifier} based on internal ModID.
	 * @param name {@link String} name to construct ID.
	 * @return created {@link Identifier}.
	 */
	public static final Identifier id(String name) {
		return Identifier.make(MOD_ID, name);
	}
	
	/**
	 * Check if player is in creative mode or not.
	 * @param player {@link PlayerBase} to check.
	 * @return {@code true} if player is in creative.
	 */
	public static boolean isInCreative(PlayerBase player) {
		return CreativePlayer.class.cast(player).creative_isCreative();
	}
	
	/**
	 * Set creative mod for specified player.
	 * @param player {@link PlayerBase} to set creative mod.
	 * @param creative {@code boolean} mode state.
	 */
	public static void setCreative(PlayerBase player, boolean creative) {
		CreativePlayer.class.cast(player).creative_setCreative(creative);
	}
	
	/**
	 * Check if player is flying or not.
	 * @param player {@link PlayerBase} to check.
	 * @return {@code true} if player is flying.
	 */
	public static boolean isFlying(PlayerBase player) {
		return CreativePlayer.class.cast(player).creative_isFlying();
	}
	
	/**
	 * Set flying mod for specified player.
	 * @param player {@link PlayerBase} to set flying.
	 * @param flying {@code boolean} state.
	 */
	public static void setFlying(PlayerBase player, boolean flying) {
		CreativePlayer.class.cast(player).creative_setFlying(flying);
	}
}
