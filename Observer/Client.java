package Observer;

public class Client extends Observer {

    @Override
    public void update(ChangeEvent event) {
        System.out.println("HALLOOOOOOOO: " + event);
    }

}
