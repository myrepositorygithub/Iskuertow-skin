/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iskuertow.path;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Thiago Dias Gomes
 */
public enum Path {

    ACRYL(1, "com.jtattoo.plaf.acryl.AcrylLookAndFeel","Acry"),
    AERO(2, "com.jtattoo.plaf.aero.AeroLookAndFeel","Aero"),
    ALUMINIUM(3, "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel","Aluminium"),
    BERNSTEIN(4, "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel","Bernstein"),
    FAST(5, "com.jtattoo.plaf.fast.FastLookAndFeel","Fast"),
    GRAPHITE(6, "com.jtattoo.plaf.graphite.GraphiteLookAndFeel","Graphite"),
    HIFI(7, "com.jtattoo.plaf.hifi.HiFiLookAndFeel","HiFi"),
    LUNA(8, "com.jtattoo.plaf.luna.LunaLookAndFeel","Luna"),
    MAC_WIN(9, "com.jtattoo.plaf.mcwin.McWinLookAndFeel","McWin"),
    MINT(10, "com.jtattoo.plaf.mint.MintLookAndFeel","Mint"),
    NOIRE(11, "com.jtattoo.plaf.noire.NoireLookAndFeel","Noire"),
    SMART(12, "com.jtattoo.plaf.smart.SmartLookAndFeel","Smart"),
    TEXTURE(13, "com.jtattoo.plaf.texture.TextureLookAndFeel","Texture");

    private int index;
    private String name;
    private String display;

    private Path(int index, String name,String display) {
        this.index = index;
        this.name = name;
        this.display=display;
    }

    private Path() {
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDisplay() {
        return display;
    }
    
    

    /**
     * <p>
     * Metodo retorna uma lista de lookandfeel
     * <p>
     * @return
     */
    public static List<Path> geValues() {
        return Arrays.asList(Path.values());
    }

    /**
     * <p>
     * Metodo retorna um objeto de lookandfeel com base na chave
     * <p>
     * @param id
     * @return
     */
    public static Path geValues(int id) {
        for (Path path : Path.values()) {
            if (path.getIndex() == id) {
                return path;
            }
        }
        return null;
    }
}
