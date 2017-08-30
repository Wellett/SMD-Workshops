/* Author: William Ellett
StudentID: 586703
last Modified: 23/8/2017
Programming and Software Development SWEN30006

Workshop3 -implementation of the greyscale thing?
Effect Library class
*/

public class EffectLibrary{
  private HashMap<String, Effect> effects;

  public EffectLibrary(){
    effects = new HashMap();
    effects.put("Greyscale", new Greyscale(););
  }

  //stub
  public boolean registerEffect(String name, Effect effect){
    effects.put(name, effect);
    return true;
  }

  //stub
  public boolean deregisterEffect(String name){
    effects.remove(name);
    return true;
  }

  //Accessors
  //stub
  public Effect getEffect(String name){
    return effects.get(name);
  }

  public String[] availableEffects(){
    return effects.keySet();
  }

}
