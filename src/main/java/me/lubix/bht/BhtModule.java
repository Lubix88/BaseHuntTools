package me.lubix.bht;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.ColorUtils;

import java.awt.*;

/**
 * Bht rusherhack module
 *
 * @author Lubix88
 */
public class BhtModule extends ToggleableModule {

	/**
	 * Settings
	 */
	private final BooleanSetting PlayerActitity = new BooleanSetting("Boolean", "Player Actitity", true);

	/**
	 * Constructor
	 */
	public BhtModule() {
		super("BaseHuntTools", "BHT plugin module", ModuleCategory.WORLD);
		//register settings
		this.registerSettings(
				this.PlayerActitity
		);
	}
	
	@Override
	public void onEnable() {
		if(mc.level != null) {
			ChatUtils.print("BHT module is enabled");
		}
	}
	
	@Override
	public void onDisable() {
		if(mc.level != null) {
			ChatUtils.print("BHT module has been disabled");
		}
	}
}
