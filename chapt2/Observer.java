package chapt2;

public interface Observer {
    /**
     * Values passed from subject to observers. 
     * 
     * @param Conditions
     */
    public void update(Conditions conditions);
}