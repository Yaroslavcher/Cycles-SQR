package ru.netology.sqr;

public class SQRService {
        public long HowMnySqrsWithin(long min, long max) {
            long HowMny = 0;
            for (int i = 10; i <= 99; i++) {
                    if (i * i >= min) {
                    if (i * i <= max) {
                    HowMny++;
                    }
                    }
                }
            return HowMny;
        }

    }
