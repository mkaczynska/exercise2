/**
 * Created by user on 06-Mar-16.
 */
public class Context {
    private MapStrategy strategy;

    public Context(MapStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
//        return strategy.doOperation(num1, num2);
        return 0;
    }
}
