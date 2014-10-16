import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class BugRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        world.add(new Bug());
        world.add(new Rock());
        world.show();
    }

    public static void moveBug(Bug bug, Integer count) {
        for (int i = 1; i < count; i++) {
            if (bug.canMove()) {
                bug.move();
            } else {
                bug.turn();
            }
        }
    }
}