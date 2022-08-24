package ObserverDesignPattern;

public class Youtube {

    public static void main(String[] args) {

        Channel uniq = new Channel();

        Subscriber s1 = new Subscriber("user1");
        Subscriber s2 = new Subscriber("user2");
        Subscriber s3 = new Subscriber("user3");
        Subscriber s4 = new Subscriber("user4");
        Subscriber s5 = new Subscriber("user5");
        Subscriber s6 = new Subscriber("user6");
        Subscriber s7 = new Subscriber("user7");

        uniq.subscribe(s1);
        uniq.subscribe(s2);
        uniq.subscribe(s3);
        uniq.subscribe(s4);
        uniq.subscribe(s5);
        uniq.subscribe(s6);
        uniq.subscribe(s7);

        s1.subscribeChannel(uniq);
        s2.subscribeChannel(uniq);
        s3.subscribeChannel(uniq);
        s4.subscribeChannel(uniq);
        s5.subscribeChannel(uniq);
        s6.subscribeChannel(uniq);
        s7.subscribeChannel(uniq);
        
        uniq.upload("How to learn Programming?");

    }

}
