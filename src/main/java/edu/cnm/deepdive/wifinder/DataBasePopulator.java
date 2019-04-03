package edu.cnm.deepdive.wifinder;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DataBasePopulator implements ApplicationListener<ContextRefreshedEvent> {

  public static int counter;

  private SetupData setupData;

  public DataBasePopulator(SetupData setupData) {
    this.setupData = setupData;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    setupData.setupData();
  }


}

