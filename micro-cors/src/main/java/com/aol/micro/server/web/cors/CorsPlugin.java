package com.aol.micro.server.web.cors;

import com.aol.cyclops.data.collections.extensions.persistent.PSetX;
import com.aol.micro.server.Plugin;

public class CorsPlugin implements Plugin {

    @Override
    public PSetX<Class> springClasses() {
        return PSetX.of(ConfigureBeans.class);
    }

}
