package mihalyi.ondrej.todomvc.javaee.cdiexamples.decorator;

import java.util.logging.Logger;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import mihalyi.ondrej.todomvc.javaee.cdiexamples.StartUpEvent;
import mihalyi.ondrej.todomvc.javaee.cdiexercises.Logging;

@Logging
public class DecoratorExample {

 @Inject
 private StringGenerator generator;
 
 public void handleStartUp(@Observes StartUpEvent event) {
  Logger.getLogger(this.getClass().getName()).info(generator.generate());
 }
 
 public void doAction(@Observes StartUpEvent event) {
  
 }
 
}
