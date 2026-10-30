
package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class AppTheme {

    // Mencegah pembuatan objek AppTheme
    private AppTheme() {
    }

    // =========================
    // WARNA APLIKASI
    // =========================

    public static final Color BACKGROUND =
            new Color(245, 247, 250);

    public static final Color TEXT =
            new Color(45, 52, 65);

    public static final Color WHITE =
            Color.WHITE;

    public static final Color GOLD =
            new Color(212, 160, 23);

    // Warna berdasarkan role karakter
    public static final Color WARRIOR =
            new Color(255, 220, 220);

    public static final Color MAGE =
            new Color(220, 230, 255);

    public static final Color ARCHER =
            new Color(220, 245, 225);

    public static final Color HEALER =
            new Color(245, 230, 255);


    // =========================
    // FONT APLIKASI
    // =========================

    public static final Font TITLE_FONT =
            new Font(Font.SANS_SERIF, Font.BOLD, 22);

    public static final Font NORMAL_FONT =
            new Font(Font.SANS_SERIF, Font.PLAIN, 14);

    public static final Font BOLD_FONT =
            new Font(Font.SANS_SERIF, Font.BOLD, 14);


    // =========================
    // BORDER APLIKASI
    // =========================

    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(
                            new Color(210, 215, 225)
                    ),
                    BorderFactory.createEmptyBorder(
                            10, 10, 10, 10
                    )
            );


    // =========================
    // WARNA BERDASARKAN ROLE
    // =========================

    public static Color colorFor(String role) {

        if (role == null) {
            return WHITE;
        }

        switch (role.toUpperCase()) {

            case "WARRIOR":
                return WARRIOR;

            case "MAGE":
                return MAGE;

            case "ARCHER":
                return ARCHER;

            case "HEALER":
                return HEALER;

            default:
                return WHITE;
        }
    }
}
