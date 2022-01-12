package org.springframework.samples.petclinic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;
import java.util.Properties;

@Component
public class StartupListener {

	private static final Logger LOG = LoggerFactory.getLogger(StartupListener.class);

	@EventListener(ApplicationReadyEvent.class)
	public void logStartup() {
		Properties p = System.getProperties();
		LOG.info("========================================================================");
		LOG.info("java.specification.version: " + p.getProperty("java.specification.version"));
		LOG.info("java.vm.vendor:             " + p.getProperty("java.vm.vendor"));
		LOG.info("java.vm.name:               " + p.getProperty("java.vm.name"));
		LOG.info("java.vm.version:            " + p.getProperty("java.vm.version"));
		LOG.info("java.vendor.url:            " + p.getProperty("java.vendor.url"));
		LOG.info("java.vendor.version:        " + p.getProperty("java.vendor.version"));
		LOG.info("java.vendor:                " + p.getProperty("java.vendor"));
		LOG.info("java.runtime.version:       " + p.getProperty("java.runtime.version"));
		LOG.info("java.home:                  " + p.getProperty("java.home"));
		LOG.info("========================================================================");
		LOG.info("java.class.path:            " + System.getProperty("java.class.path"));
		LOG.info("========================================================================");
	}

}
