package net.osslabz.paapi5;

/**
 * This project is just a re-packaged version of Repackaged version of Amazon's Product Advertising API 5.0 Java SDK since it is only available as a binary distribution.
 * <p>
 * The whole purpose is to be able to upload it to maven central for easier usage in Maven/gradle projects.
 */
public class ReadMe {

    /**
     * This class and it's main method only exists to satisfy the maven central toolchain and expects (and enforces) the presence of javadoc and source files archives. Since the actual classes are extracted
     * from lib/paapi5-java-sdk.*.jar we need at least one class with source and javadoc that is not optimized away.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("NO-OP");
    }
}