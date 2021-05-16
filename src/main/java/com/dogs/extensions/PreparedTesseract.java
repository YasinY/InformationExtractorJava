package com.dogs.extensions;

import net.sourceforge.tess4j.Tesseract;

public class PreparedTesseract extends Tesseract {


    public PreparedTesseract() {
        super();
    }

    private void initialise() {
       // setTessVariable(VAR_CHAR_BLACKLIST, "!?@#$%&*()<>_-+=/:;'\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
       // setTessVariable(ITessAPI., ".,0123456789");
    }


}
