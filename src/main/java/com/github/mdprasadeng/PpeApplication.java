package com.github.mdprasadeng;

import com.google.common.base.Strings;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PpeApplication extends Application<PpeConfiguration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PpeApplication.class);

    public static void main(final String[] args) throws Exception {
        LOGGER.info("java main called with args - {}", StringUtils.join(args, ' '));
        LOGGER.info("calling run of dropwizard with args = {}");
        new PpeApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard_ppe";
    }

    @Override
    public void initialize(final Bootstrap<PpeConfiguration> bootstrap) {
        // TODO: application initialization

    }

    @Override
    public void run(final PpeConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
