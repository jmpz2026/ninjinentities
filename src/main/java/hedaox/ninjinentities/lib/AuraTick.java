package hedaox.ninjinentities.lib;

/**
 * Shared aura particle throttle counter. Upstream (ninjinentities-Unofficial)
 * keeps it as a static field of its reworked EntityGokuSsj3; our EntityGokuSsj3
 * is the original one, so the counter lives here instead.
 */
public class AuraTick {
    public static int serverTickx = 0;
}
