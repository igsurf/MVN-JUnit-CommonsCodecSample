package org.recharge;
import org.apache.commons.codec.digest.DigestUtils;


public class Recharge {

    public static  void main (String[] args) {

        if (args.length < 1) {
            System.err.println("Please Provide a input");
                    System.exit(0);
        }
        System.out.println(getSha256hex(args[0]));

    }

    public static String getSha256hex(String arg) {
        return DigestUtils.sha256Hex(arg);
    }


}
