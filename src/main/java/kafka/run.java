package kafka;

import java.io.IOException;

/**
 * Pick whether we want to run as producer or consumer. This lets us
 * have a single executable as a build target.
 */
public class run {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("Must have either 'producer' or 'consumer' as argument");
        }
        switch (args[0]) {
            case "producer":
            	kafka_application.main(args);
                break;
            case "consumer":
                kafka_consumer.main(args);
                break;
            default:
                throw new IllegalArgumentException("Don't know how to do " + args[0]);
        }
    }
}