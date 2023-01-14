public interface Subject {
    public void register(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers(String s);
}
