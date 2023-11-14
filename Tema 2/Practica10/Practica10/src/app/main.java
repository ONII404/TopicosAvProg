package app;

import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;

public class main {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {

//                IntelliJTheme.setup( main.class.getResourceAsStream(
//    "/app/themes/Moonlight.theme.json" ) );
                
                FlatGruvboxDarkHardIJTheme.setup();
//                FlatMoonlightIJTheme.setup();
                form window = new form();
                window.setVisible(true);
            }
        });

    }
}
