package ru.clevertec.api;

import ru.clevertec.core.Utils;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.printf(
                    "Are 12 & 19 positive numbers?%nAnswer: %s%n", Utils.isAllPositiveNumbers("12", "19"));
        }else {
            System.out.printf(
                    "Are %s positive numbers?%nAnswer: %s%n",
                    String.join(" & ", args),
                    Utils.isAllPositiveNumbers(args)
            );
        }
    }
}
