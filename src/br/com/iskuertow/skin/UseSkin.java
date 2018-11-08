package br.com.iskuertow.skin;

import br.com.iskuertow.path.Path;
import java.util.List;

/**
 *
 * @author Thiago Dias Gomes
 */
public class UseSkin {

    /**
     * <p>
     * Traz todas as 13 skins em uma lista com apenas o nome da classe<p>
     * @return
     */
    public static List<Path> getSkin() {
        return Path.geValues();
    }

    /**
     * <p>
     * busca a skin com base no index, que vai do 1 ao 13
     * <p>
     * @param index
     * @return
     */
    public static String getSkin(int index) {
        return Path.geValues(index).toString();
    }
}
