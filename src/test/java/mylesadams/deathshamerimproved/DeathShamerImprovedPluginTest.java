package mylesadams.deathshamerimproved;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DeathShamerImprovedPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DeathShamerImprovedPlugin.class);
		RuneLite.main(args);
	}
}