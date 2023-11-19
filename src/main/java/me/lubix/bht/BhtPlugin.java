package me.lubix.bht;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

public class BhtPlugin extends Plugin {

    @Override
    public void onLoad() {

        //logger
        this.getLogger().info(this.getName() + " loaded!");
        this.getLogger().info("Hello World!");

        //creating and registering a new module
        final BhtModule bhtModule = new BhtModule();
        RusherHackAPI.getModuleManager().registerFeature(bhtModule);

        //creating and registering a new hud element
        final ExampleHudElement exampleHudElement = new ExampleHudElement();
        RusherHackAPI.getHudManager().registerFeature(exampleHudElement);

        //creating and registering a new command
        final ExampleCommand exampleCommand = new ExampleCommand();
        RusherHackAPI.getCommandManager().registerFeature(exampleCommand);
    }

    @Override
    public void onUnload() {
        this.getLogger().info(this.getName() + " unloaded!");
    }

    @Override
    public String getName() {
        return "BaseHuntTools";
    }

    @Override
    public String getVersion() {
        return "v0.1";
    }

    @Override
    public String getDescription() {
        return "BaseHuntTools rusherhack plugin by Lubix88";
    }

    @Override
    public String[] getAuthors() {
        return new String[]{"Lubix88"};
    }
}
