package ejedev.raidshamer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


//plugin was renamed from raidshamer - keeping legacy config group name to avoid duplicate plugin entries
@ConfigGroup("raidshamer")
public interface RaidShamerConfig extends Config
{
    enum OtherPlayers
    {
        NONE,
        FRIENDS,
        ALL
    }

    @ConfigItem(
        keyName = "captureOwnDeaths",
        name = "Own Deaths Captured",
        description = "Allows you to toggle on/off own death shaming",
        position = 1
    )
    default boolean captureOwnDeaths()
    {
        return true;
    }

    @ConfigItem(
        keyName = "otherPlayersDeaths",
        name = "Other Players Shamed",
        description = "Allows you to change which other players should also be shamed.",
        position = 2
    )
    default OtherPlayers otherPlayersDeaths()
    {
        return OtherPlayers.NONE;
    }

    @ConfigItem(
        keyName = "activeInCoX",
        name = "Active in Chambers of Xeric (CoX)",
        description = "Allows for shaming in CoX",
        position = 3
    )
    default boolean activeInCoX()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeInToB",
        name = "Active in Theater of Blood (ToB)",
        description = "Allows for shaming in ToB",
        position = 4
    )
    default boolean activeInToB()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeInToA",
        name = "Active in Tombs of Amascut (ToA)",
        description = "Allows for shaming in ToA",
        position = 5
    )
    default boolean activeInToA()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeOutsideOfRaids",
        name = "Active outside of raids",
        description = "Allows for shaming outside of raids",
        position = 6
    )
    default boolean activeOutsideOfRaids()
    {
        return false;
    }

    @ConfigItem(
        keyName = "webhookEnabled",
        name = "Discord Webhook",
        description = "Allows you to send death photos automatically to a discord webhook. Read the github page for info.",
        position = 7
    )
    default boolean webhookEnabled()
    {
        return false;
    }

    @ConfigItem(
        keyName = "webhookLink",
        name = "Webhook URL",
        description = "Put your webhook link here, the full thing copied from discord.",
        position = 8
    )
    default String webhookLink()
    {
        return "";
    }
}

