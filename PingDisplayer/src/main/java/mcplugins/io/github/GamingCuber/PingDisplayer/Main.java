package mcplugins.io.github.GamingCuber.PingDisplayer;

import org.bukkit.plugin.java.JavaPlugin;

import mcplugins.io.github.GamingCuber.PingDisplayer.commands.PingCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new PingCommand(this);
	}
	
}
