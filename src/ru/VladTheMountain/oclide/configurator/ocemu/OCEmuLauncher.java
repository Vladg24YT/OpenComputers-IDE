/*
 * The MIT License
 *
 * Copyright 2021 Vladislav Gorskii.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ru.VladTheMountain.oclide.configurator.ocemu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author VladTheMountain
 */
public class OCEmuLauncher {

    //CONSTANTS
    public static final int CPU = 0;
    public static final int GPU = 1;
    public static final int SCREEN = 2;
    public static final int FILESYSTEM = 3;
    public static final int COMPUTER = 4;
    public static final int MODEM = 5;
    public static final int INTERNET = 6;
    public static final int KEYBOARD = 7;
    public static final int EEPROM = 8;

    //CONFIG VARIABLES
    private static String monochromeColor = "0xFFFFFF";
    private static boolean allowBytecode = false;
    private static boolean allowGC = false;
    private static int timeout = 5;
    private static boolean debug = true;
    private static boolean vague = true;
    private static boolean enableHttp = true;
    private static boolean enableTcp = true;
    private static int maxNetworkPacketSize = 8192;
    private static int maxWirelessRange = 400;
    //
    private String computerComponents;

    /**
     *
     */
    public OCEmuLauncher(String[][] configuration) {
        for (int i = 0; i < configuration.length; i++) {
            for (int j = 0; j < configuration.length; j++) {
                
            }
        }
    }

    /**
     *
     * @param componentType
     * @return
     */
    String createComponent(int componentType) {
        String comp = "";
        switch (componentType) {
            case 0:
        }
        return comp;
    }

    /**
     *
     * @throws IOException
     */
    void createConfig() throws IOException {
        File config = new File("workspace/OCEmu/machine/ocemu.cfg");
        if (!(config.exists())) {
            if (!(new File(config.getParent()).exists())) {
                new File(config.getParent()).mkdirs();
            }
            config.createNewFile();
        }
        //
        String contents
                = "--OCEmu configuration. Designed to mimic HOCON syntax, but is not exactly HOCON\n"
                + "--syntax.\n"
                + "ocemu {\n"
                + "\n"
                + "  --Client side settings, presentation and performance related stuff.\n"
                + "  client {\n"
                + "\n"
                + "    --The color of monochrome text (i.e. displayed when in 1-bit color depth,\n"
                + "    --e.g. tier one screens / GPUs, or higher tier set to 1-bit color depth).\n"
                + "    --Defaults to white, feel free to make it some other color, tho!\n"
                + "    monochromeColor=\"" + monochromeColor + "\"\n"
                + "  }\n"
                + "\n"
                + "  --Computer related settings, concerns server performance and security.\n"
                + "  computer {\n"
                + "\n"
                + "    --Settings specific to the Lua architecture.\n"
                + "    lua {\n"
                + "\n"
                + "      --Whether to allow loading precompiled bytecode via Lua's `load` function,\n"
                + "      --or related functions (`loadfile`, `dofile`). Enable this only if you\n"
                + "      --absolutely trust all users on your server and all Lua code you run. This\n"
                + "      --can be a MASSIVE SECURITY RISK, since precompiled code can easily be\n"
                + "      --used for exploits, running arbitrary code on the real server! I cannot\n"
                + "      --stress this enough: only enable this is you know what you're doing.\n"
                + "      allowBytecode=" + allowBytecode + "\n"
                + "\n"
                + "      --Whether to allow user defined __gc callbacks, i.e. __gc callbacks\n"
                + "      --defined *inside* the sandbox. Since garbage collection callbacks are not\n"
                + "      --sandboxed (hooks are disabled while they run), this is not recommended.\n"
                + "      allowGC=" + allowGC + "\n"
                + "    }\n"
                + "\n"
                + "    --The time in seconds a program may run without yielding before it is\n"
                + "    --forcibly aborted. This is used to avoid stupidly written or malicious\n"
                + "    --programs blocking other computers by locking down the executor threads.\n"
                + "    --Note that changing this won't have any effect on computers that are\n"
                + "    --already running - they'll have to be rebooted for this to take effect.\n"
                + "    timeout=" + timeout + "\n"
                + "  }\n"
                + "\n"
                + "  --Emulator related settings. Components, accuracy, and debugging.\n"
                + "  emulator {\n"
                + "\n"
                + "    --Default components available to the computer.\n"
                + "    components {\n"
                + "\n"
                + computerComponents
                + "    }\n"
                + "\n"
                + "    --Whether to enable the emulator's extremely verbose logging.\n"
                + "    debug=" + debug + "\n"
                + "\n"
                + "    --Whether to return vague error messages like OpenComputers.\n"
                + "    vague=" + vague + "\n"
                + "  }\n"
                + "\n"
                + "  internet {\n"
                + "\n"
                + "    --Whether to allow HTTP requests via internet cards. When enabled, the\n"
                + "    --`request` method on internet card components becomes available.\n"
                + "    enableHttp=" + enableHttp + "\n"
                + "\n"
                + "    --Whether to allow TCP connections via internet cards. When enabled, the\n"
                + "    --`connect` method on internet card components becomes available.\n"
                + "    enableTcp=" + enableTcp + "\n"
                + "  }\n"
                + "\n"
                + "  --Other settings that you might find useful to tweak.\n"
                + "  misc {\n"
                + "\n"
                + "    --The maximum size of network packets to allow sending via network cards.\n"
                + "    --This has *nothing to do* with real network traffic, it's just a limit for\n"
                + "    --the network cards, mostly to reduce the chance of computer with a lot of\n"
                + "    --RAM killing those with less by sending huge packets. This does not apply\n"
                + "    --to HTTP traffic.\n"
                + "    maxNetworkPacketSize=" + maxNetworkPacketSize + "\n"
                + "\n"
                + "    --The maximum distance a wireless message can be sent. In other words, this\n"
                + "    --is the maximum signal strength a wireless network card supports. This is\n"
                + "    --used to limit the search range in which to check for modems, which may or\n"
                + "    --may not lead to performance issues for ridiculous ranges - like, you know,\n"
                + "    --more than the loaded area. See also: `wirelessCostPerRange`.\n"
                + "    maxWirelessRange=" + maxWirelessRange + "\n"
                + "  }\n"
                + "}";
        //
        Files.write(config.toPath(), contents.getBytes());
    }
}
