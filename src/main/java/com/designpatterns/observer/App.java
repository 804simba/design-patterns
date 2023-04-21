package com.designpatterns.observer;

/**
 * Observer design pattern is a behavioural pattern that allows us to define a subscription
 * mechanism to notify multiple objects about any events that happen to the object they are
 * observing.
 *
 * The object with an interesting state (subject) and is going to notify other objects (observers)
 * about changes to its state is called a `publisher` while all other objects that tracks changes
 * to the publisher's state are called `subscribers`.
 * */
public class App {
    public static void main(String[] args) {
        // create topic
        Subject topic = new MyTopic();

        // create observers
        Observer timtez = new MyTopicSubscriber("timtez");
        Observer simba = new MyTopicSubscriber("simba");
        Observer angela = new MyTopicSubscriber("angela");

        // registers observers to the subject
        topic.register(timtez);
        topic.register(simba);
        topic.register(angela);

        // attach observers to topic
        timtez.setSubject(topic);
        simba.setSubject(topic);
        angela.setSubject(topic);

        // check if any update is available
        timtez.update();

        // now send message to observe
        topic.postMessage("New Nike airForce 1s in stock...");
    }
}
