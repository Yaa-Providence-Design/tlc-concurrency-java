package com.company.labs;

public final class StatsCounter {
        private int successCount_;

        public final int getSuccessCount() {
            return successCount_;
        }

        public final synchronized void increaseSuccessCount(int delta)  {
            //try {
               // wait();
           // } catch (InterruptedException exception) {
              //  exception.printStackTrace();
           // }
            successCount_ += delta;
            //notifyAll();
        }
    }