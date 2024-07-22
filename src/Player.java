public class Player {
    private final String name;
    private int doubleDiceCount=0;
    private int resultSum=0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDoubleDiceCount() {
        return doubleDiceCount;
    }

    public int getResultSum() {
        return resultSum;
    }

    public void incrementDoubleDice() {
        this.doubleDiceCount++;
    }

    public void addResult(int dicesValue) {
        if(dicesValue<0 || dicesValue>12) throw new IllegalArgumentException("Dices value %s are out of bound".formatted(dicesValue));
        this.resultSum +=dicesValue;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", doubleDiceCount=" + doubleDiceCount +
                ", resultSum=" + resultSum +
                '}';
    }
}
