package org.unbunt.utils;

import java.util.Observable;

/**
 * User: tweiss
 * Date: 08.07.2008
 * Time: 12:13:44
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class VolatileObservable extends Observable {

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }

}
